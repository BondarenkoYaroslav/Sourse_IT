package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import agency.dao.AccountsDao;
import agency.dao.impl.DefaultAccountsDao;

@WebServlet(name = "LoginServlet", urlPatterns = { "/login" })
public class LoginServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private AccountsDao accountsDao;

	{
		accountsDao = DefaultAccountsDao.getInstance();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/login.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();
		
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		if (login == null || login.isEmpty() || password == null || password.isEmpty()) {
			response.sendRedirect(getServletContext().getContextPath() + "/login.jsp");
			System.out.println("is absent");
		} else {

			if (accountsDao.getAccountByMail(login) == null) {

				System.out.println("wrong login");

				response.sendRedirect(getServletContext().getContextPath() + "/login.jsp");

			} else if (accountsDao.getAccountByMail(login).getPasswordAccount().equals(password) || accountsDao.getAccountByMail(login).getPasswordAccount().equals(session.getAttribute("passAccount"))) {

				System.out.println("access is allowed");

				accountsDao = DefaultAccountsDao.getInstance();

				if (accountsDao.getAccountByMail(login).getAccess().equals("admin")) {
					
					session.setAttribute("sessionName", login);
					session.setAttribute("role", accountsDao.getAccountByMail(login).getAccess());
					getServletContext().getRequestDispatcher("/adminaccount.jsp").forward(request, response);
					
				} else {
					
					session.setAttribute("sessionName", login);
					session.setAttribute("role", accountsDao.getAccountByMail(login).getAccess());
					session.setAttribute("passAccount", accountsDao.getAccountByMail(login).getPasswordAccount());
					getServletContext().getRequestDispatcher("/useraccount.jsp").forward(request, response);
					
				}

			} else {
				System.out.println("wrong password");
				response.sendRedirect(getServletContext().getContextPath() + "/login.jsp");
			}

		}

	}

}