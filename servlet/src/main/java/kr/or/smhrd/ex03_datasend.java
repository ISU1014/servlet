package kr.or.smhrd;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/datasend") //url mapping 값
public class ex03_datasend extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//request.getParameter("input태그의 name 속성값"); //가져온다 파라미터를
		// 받아온 데이터는 항상 String으로 반환
		String data = request.getParameter("data");
		System.out.println(data);
		
		
		// 실행은 html 파일에서부터 해야함.
		//if 오류 400번대 -> action 경로 잘못 적은 경우
		//오류 500번대 -> servlet이나 html 문법에 오류
		
		
		
		
	}

}
