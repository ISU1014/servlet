package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.smhrd.domain.MemberDAO;
import com.smhrd.domain.member_web;

public class LoginCon extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//0. post방식 인코딩
		request.setCharacterEncoding("UTF-8");
		//1. 파라미터 수집(id,pw,nick)
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		//2. member_web 객체에 받아온 값 담아주기
		member_web inputmember = new member_web(id, pw);
		
		//3. DAO객체 생성
		MemberDAO dao = new MemberDAO();
		//3-1. DAO의 메소드를 호출해서 inputMember 전달
		//3-2. DAO 메소드의 결과물을 담아줌 --> member_web
		member_web loginMember = dao.selectMember(inputmember);

		//4.(member_web의 결과) SQL문 실행결과에 따른 명령 후 처리
		if(loginMember != null) {
			System.out.println("로그인 성공~");
			//성공시 session 회원정보 저장하고 main.jsp 이동
			HttpSession session = request.getSession();
			session.setAttribute("loginMember", loginMember);
			response.sendRedirect("main.jsp");
		}else {
			System.out.println("로그인 실패 ㅜㅜ");
			//로그인 html로 이동
			response.sendRedirect("login.html");
		}
		
	}

}
