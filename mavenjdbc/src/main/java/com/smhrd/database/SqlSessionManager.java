package com.smhrd.database;

import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionManager {
	//config.xml을 읽어들여 DB 커넥션 후 세션(sqlSession) 변환
	//DB 연결 고리(sqlSession)를 만들어 놓고 그때그때 가져다쓰는 방식
	//-->Connection Pool (CP)
	
	//공장 만들어내기
	// SqlSessionFactory : SqlSession 생성(Connection객체와 비슷한 역할)
	// SqlSession : SQL실행, 트랜잭션을 관리
	static SqlSessionFactory sqlSessionFactory;
	
	//sqlSessionManager 객체가 호출되면 무조건 실행할 수 있도록 static 사용
	static { //무조건 실행
		try {
			String resource = "com/smhrd/database/config.xml";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
			//SqlSessionFactoryBuilder : config.xml 파일을 바탕으로 sqlseSessionFactory 생성
			//** ctrl+shift+o 전체 import
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	/* sqlSessionFactory를 DAO에서 사용할 수 있게 하는 메소드*/
	public static SqlSessionFactory getSqlSession() {
				//위 SqlSessionFactory 객체
		return sqlSessionFactory; //변수
	}

}
