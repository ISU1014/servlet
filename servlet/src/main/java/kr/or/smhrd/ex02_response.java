package kr.or.smhrd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex02_response")
public class ex02_response extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//response객체 : 사용자에게 정보를 보낼때 사용하는 객체(페이지 이동시에도 사용)
		
		//1.사용자에게 보내는 문서 방식 지정
		response.setContentType("text/html; charset=UTF-8");
		
		//2.데이터를 보낼 수 있는 통로 생성
		PrintWriter out = response.getWriter();
		
		//3.통로를 통해 전달할 데이터 작성
		//단순한 문자열 출력이 아니라, 태그 내용이 구현되는 정보
		out.print("<h1>안녕하세요!!!</h1>");
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
