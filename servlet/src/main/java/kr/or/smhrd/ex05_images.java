package kr.or.smhrd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ex05_imagesss")
public class ex05_images extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String choice = request.getParameter("choice");
		
		//사용자에게 보여줄 내용 (화면 표출) //(어떤 형식, 어떤내용의 데이터)
		response.setContentType("text/html; charset =UTF-8");
		PrintWriter out = response.getWriter();//통로
		

		out.print("<center>");
		out.print("<h1>이미지</h1>");
		out.print("<br><br>");
		
		if(choice.equals("one")) {
			out.print("<img src='images/one.jpg'>");
		}else if(choice.equals("two")) {
			out.print("<img src='images/two.jpg'>");
		}else if(choice.equals("three")) {
			out.print("<img src='images/3.jpeg'>");
		}
		
		out.print("</center>");
		
		
		
	}

}
