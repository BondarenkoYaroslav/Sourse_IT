package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import agency.dao.AccountsDao;
import agency.dao.UsersDao;
import agency.dao.impl.DefaultAccountsDao;
import agency.dao.impl.DefaultUsersDao;

@WebServlet(name = "RegistrationServlet", urlPatterns = { "/registration" })
public class RegistrationServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	private AccountsDao accountsDao;

	{
		accountsDao = DefaultAccountsDao.getInstance();
	}
	private UsersDao usersDao;

	{
		usersDao = DefaultUsersDao.getInstance();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/registration.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String nameUser = request.getParameter("name");
		String surnameUser = request.getParameter("surname");
		String mailUser = request.getParameter("mail");
		String numberUser = request.getParameter("number");
		String birthdayUser = request.getParameter("birthday");
		String passwordUser = request.getParameter("password");
		String password2User = request.getParameter("password2");
		
		if (!accountsDao.isAnAccountRegistered(mailUser) && passwordUser.equals(password2User)) {
			
			usersDao.setUser(nameUser, surnameUser, mailUser, numberUser, java.sql.Date.valueOf(birthdayUser));
			
			accountsDao.createAccount(mailUser, passwordUser);
			
			response.sendRedirect(getServletContext().getContextPath() + "/login.jsp");
			
		} else {
			
			System.out.println("fail");
			response.sendRedirect(getServletContext().getContextPath() + "/registration.jsp");
			
		}

		
	}

}
