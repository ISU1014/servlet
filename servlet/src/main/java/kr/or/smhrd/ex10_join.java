package kr.or.smhrd;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/join")
public class ex10_join extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		

		//데이터 전송 방식:GET,POST
		//POST 방식 : post방식의 한글 인코딩
		//요청에 담긴 내용을 인코딩
		request.setCharacterEncoding("UTF-8");
		
		//파라미터 수집
		//job,gender,hobby
				
		String id = request.getParameter("id");
		String pw = request.getParameter("password");
		String gender = request.getParameter("gender");
		String select = request.getParameter("select");
		String color = request.getParameter("color");
		String birth = request.getParameter("birth");
		String text = request.getParameter("text");
		String[] hobby = request.getParameterValues("hobby");

		System.out.println("id : "+id);
		System.out.println("pw : "+pw);
		System.out.println("gender : "+gender);
		System.out.println("select : "+select);
		System.out.println("color : "+color);
		for(String e : hobby) {
			System.out.println("hobby : "+hobby);
		}
		
		System.out.println("birth : "+birth);
		
		System.out.println("text : "+text);
		
//		for(int i=0; i<3; i++) {
//			System.out.println("취미"+(i+1)+" "+hobby[i]);
//		}
//		
		
		
		
		
	}

}
