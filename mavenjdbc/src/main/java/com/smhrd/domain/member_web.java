package com.smhrd.domain;

//데이터 묶을 객체는 테이블 1개당 1개씩 생성 추천
//객체 이름과 테이블명 일치
public class member_web {
	
	//필드의 이름과 컬럼명과 일치
	private String id;
	private String pw;
	private String nick;

	
	//생성자
	public member_web() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getId(String id) {
		if(id.equals("admin")) {
			this.id=id;
		}	
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getPw() {
		return pw;
	}
	
	public void setPw(String pw) {
		this.pw = pw;
	}
	

	public member_web(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	public member_web(String id, String pw, String nick) {
		super();
		this.id = id;
		this.pw = pw;
		this.nick = nick;
	}

	@Override
	public String toString() {
		return "member_web [id=" + id + ", pw=" + pw + ", nick=" + nick + "]";
	}
	
	

}
