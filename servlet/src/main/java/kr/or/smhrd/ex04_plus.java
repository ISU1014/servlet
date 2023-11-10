package kr.or.smhrd;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ex04_plus") //html 파일의 action값 확인
public class ex04_plus extends HttpServlet {

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	//가져온다
	//파라미터 수집하기
	//Sting 으로 받아온 데이터를 형변환
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
	
//	String num1 = request.getParameter("num1");
//	int num1_int = Integer.parseInt(num1);
	
	System.out.println("num1 : "+num1+"\nnum2 : "+num2+"\nresult = "+(num1+num2));
	
	//사용자에게 결과값 보여주기 (화면 표출) //(어떤 형식, 어떤내용의 데이터)
	response.setContentType("text/html; charset=UTF-8");
	PrintWriter out = response.getWriter();
	
	out.print("<center>");
	out.print("<h1>연산의 결과</h1>");
	out.print("<br><br>");
	out.print("<h3>"+num1+"+"+num2+"="+(num1+num2)+"</h3>");
	out.print("</center>");
	
	
	
	
	
	}

}
