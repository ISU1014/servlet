package kr.or.smhrd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getpost")
public class ex08_getpost extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//데이터 전송 방식:GET,POST
		//POST 방식 : post방식의 한글 인코딩
		//요청에 담긴 내용을 인코딩
		request.setCharacterEncoding("UTF-8");
		
		//파라미터 수집(데이터 가져오기)
		String data=request.getParameter("data");
		System.out.println(data);
		
		
//		response.setContentType("text/html; charset =UTF-8");
//		PrintWriter out = response.getWriter();
		
		
		
		
		
	}

}
