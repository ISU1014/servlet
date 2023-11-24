package com.smhrd.domain;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import com.smhrd.database.SqlSessionManager;

public class MemberDAO {
	//DAO : Data Access Object : 실제로 DB에 접근할 수 있는 객체
	// DB 연결고리를 가져와서 SQL문 실행, 결과문을 처리
	
	
	//SqlSessionManager.java 클래스에서 만든것 활용
	SqlSessionFactory sqlSessionFactory = SqlSessionManager.getSqlSession();
	SqlSession sqlSession = sqlSessionFactory.openSession();
	
	//회원가입 기능구현
	public int insertMember(member_web joinMember) {
		int cnt = 0;
		
		try { //try문에 cnt 꼭 넣기
			// sqlSession.insert(Mapper.xml의 id값, 매개변수)
			// mapper.xml 여러개 있는 경우 id입력하는 곳에
			// com.smhrd.database.Mapper.insertMember
			cnt = sqlSession.insert("insertMember",joinMember);
			// SQL문의 성공 여부에 따른 트랜잭션 관리
			if(cnt>0) {
				sqlSession.commit();
			}else {
				sqlSession.rollback();
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			//빌려온 연결고리 sqlSession객체 반납
			sqlSession.close();
		}
		return cnt;
	}
	
	//로그인 기능 구현
	public member_web selectMember(member_web inputMember) {
		member_web loginMember = null;
		try {
			//여러 데이터 가져올경우 : .selectList(id값,매개변수) -> List<VO>
													//	.xml의 SQL태그에서 resultType에 List가 아니라 VO형태로 변환
													//	VO현태로 반환
			//한개의 데이터 가져올 경우 : .selectOne(id값,매개변수) -> VO
			loginMember = sqlSession.selectOne("selectMember",inputMember);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		return loginMember;
		
	}
	
	
	
	
	
	
}