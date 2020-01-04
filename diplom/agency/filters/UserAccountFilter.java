package filters;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebFilter("/useraccount.jsp")
public class UserAccountFilter implements Filter {

	public UserAccountFilter() {
	}

	public void destroy() {
	}

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;

		HttpSession session = request.getSession();

		if ((session.getAttribute("sessionName")).toString().contains("@")
				&& (session.getAttribute("role")).toString().contains("user")) {

			response.sendRedirect("/useraccount.jsp");
			
		} else if ((session.getAttribute("sessionName")).toString().contains("@")
				&& (session.getAttribute("role")).toString().contains("admin")) {

			response.sendRedirect("/adminaccount.jsp");

		} else {
			
			response.sendRedirect("/login.jsp");
			
		}

	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
