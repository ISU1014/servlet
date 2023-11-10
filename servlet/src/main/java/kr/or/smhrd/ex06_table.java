package kr.or.smhrd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/maketable")
public class ex06_table extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//파라미터 수집
		int room = Integer.parseInt(request.getParameter("room"));//text name값
		int floor = Integer.parseInt(request.getParameter("floor"));//text name값
		
		
		response.setContentType("text/html; charset =UTF-8");
		PrintWriter out = response.getWriter();
		
		out.print("<center>");
		out.print("<table border='1'>");
		
		int num=0;
		for(int i=1; i<=floor; i++) {
			out.print("<tr>");
			for(int j=1; j<=room; j++) {
				out.print("<td>"+(++num)+"</td>");
			}
			out.print("</tr>");
		}
		out.print("</table>");
		out.print("</center>");
		
		
		
	}

}
