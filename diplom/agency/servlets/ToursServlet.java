package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import agency.dao.ToursDao;
import agency.dao.impl.DefaultToursDao;

@WebServlet(name = "ToursServlet", urlPatterns = { "/tours" })
public class ToursServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private ToursDao toursDao;

	{
		toursDao = DefaultToursDao.getInstance();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/tours.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String idTour = request.getParameter("idTour");	
		
		if (toursDao.existId((Integer.parseInt(idTour)))) {
			
			 request.setAttribute("ingormationTour", toursDao.getTourById(Integer.parseInt(idTour)).toString());

			  getServletContext().getRequestDispatcher("/tours.jsp").forward(request, response);
			
		} else {

			request.setAttribute("ingormationTour", "there is no such tour");

			  getServletContext().getRequestDispatcher("/tours.jsp").forward(request, response);
		}

	}

}
