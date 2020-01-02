package filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MyAccountFilter implements Filter {
	@Override
	public void init(FilterConfig config) {
	}

	@Override
	public void destroy() {
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) res;
		HttpSession session = request.getSession(false);

		System.out.println(session.getId());

		String loginURL = request.getContextPath() + "/login";
		String registrURL = request.getContextPath() + "/registration";

		boolean loggedIn = session != null && session.getAttribute("name") != null;
		boolean loginRequest = request.getRequestURI().equals(loginURL)
				|| request.getRequestURI().equals(loginURL + ".jsp");
		boolean registrRequest = request.getRequestURI().equals(registrURL)
				|| request.getRequestURI().equals(registrURL + ".jsp");

		if (loggedIn || loginRequest || registrRequest) {

			chain.doFilter(req, res);
			
		} else {
			response.sendRedirect("login.jsp");

		}
	}
}