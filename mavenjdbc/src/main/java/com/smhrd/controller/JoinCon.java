package com.smhrd.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.smhrd.domain.MemberDAO;
import com.smhrd.domain.member_web;

/**
 * Servlet implementation class JoinCon
 */
public class JoinCon extends HttpServlet {
	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//0. post방식 인코딩
		request.setCharacterEncoding("UTF-8");
		//1. 파라미터 수집(id,pw,nick)
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String nick = request.getParameter("nick");
		
		//2.가져온 값을 member_web객체에 담아주기
		member_web joinMember = new member_web(id,pw,nick);
		
		//3.DAO 객체 생성 --> 
		//DAO의 메소드를 호출해서 joinMember전달 DAO 메소드의 결과물을 담아줌 --> int 
		MemberDAO dao = new MemberDAO();
		int cnt = dao.insertMember(joinMember);
		
		//4. (int의 결과)SQL문 실행 결과에 따른 명령 후 처리
		//		int의 결과가 0보다 크면 success/ 작으면 false
		String res="";
		if(cnt>0) {
			res="joinSuccess.html";
			//response.sendRedirect("joinSuccess.html");
			//둘중 하나
		}else {
			res="join.html";
			//response.sendRedirect("join.html");
			//둘중 하나
		}
		response.sendRedirect(res);
	}
}
