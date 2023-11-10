package kr.or.smhrd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//url-mapping(65p, 72p) : 문자열 경로와 실행될 서블릿 클래스를 맵핑(연결)
// ("/문자열") --> /생략되면 오류.
// url 맵핑 중복되면 오류.

//@WebServlet() --> 해당 클래스를 실행시켜주는 문자열을 담고 있음
@WebServlet("/ex01_request")
public class ex01_request extends HttpServlet {
	
	//버전관리(직렬화) --> 있어도 없어도 상관없는 코드.
	private static final long serialVersionUID = 1L;

	//자바의 main()과 비슷하게 실행이가능한 service() 메서드
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	 
		//request객체 : 요청에 대한 정보를 저장하고 있는 객체
		//정보 : 사용자 ip, 데이터 전송 방식, 쿠키, 이전에 접속한 사이트 주소
		//		인코딩 방식, 데이터 등등
		
	//사용자의 요청에 담긴 ip주소를 가져오기	
	String ip = request.getRemoteAddr();
		
	//syso : 출력문 역할 --> 콘솔창에서 오류 확인(디버깅 요소)
	System.out.println("접속한 사용자 ip : "+ip);
	//ip : 0:0:0:0:0:0:0:1 -> Ipv6주소
	//ip : 172.30.1.95 -> Ipv4주소
	
	//나의 로컬 서버 응답 주소
	//http://localhost:8080/servlet/ex01_request
	//http://172.30.1.95:8080/servlet/ex01_request
	
	//1.사용ㅈ에게 보내는 문서 방식 지정
	response.setContentType("text/html; charset=UTF-8");
	//2.데이터를 보낼 수 있ㄴ느 통로 생성(출력 스트림)
	PrintWriter out = response.getWriter();
	
	if(ip.equals("172.30.1.36")) {
		out.print("<h1>수진이 들어옴!</h1>");
	}
	else if(ip.equals("172.30.1.31")) {
		out.print("<h1>수원이 들어옴!</h1>");
	}
	else if(ip.equals("172.30.1.22")){
		out.print("<h1>언니 어서와</h1>");
	}else {
		out.print("<h1>환영합니다</h1>");
	}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
