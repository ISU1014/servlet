package kr.or.smhrd;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/info")
public class ex09_info extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		

		//데이터 전송 방식:GET,POST
		//POST 방식 : post방식의 한글 인코딩
		//요청에 담긴 내용을 인코딩
		request.setCharacterEncoding("UTF-8");
		
		//파라미터 수집
		//job,gender,hobby
				
		String job = request.getParameter("job");
		String gender = request.getParameter("gender");
		String[] hobby = request.getParameterValues("hobby");
		System.out.println("직업	"+job);
		System.out.println("성별	"+gender);
		
//		for(int i=0; i<3; i++) {
//			System.out.println("취미"+(i+1)+" "+hobby[i]);
//		}
		for(String e : hobby) {
			System.out.println(e);
		}
		
		
		
		
	}

}
