package servlet;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet (urlPatterns = "/bmi")
public class BmiServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UEF-8");
		resp.setContentType("text/html;charset=UTF-8");
		
		String height= req.getParameter("h");
		String weight= req.getParameter("w");
		
		String bmi = Integer.parseInt((height*height)/);
		
		resp.getWriter().print();
				
	}

}
