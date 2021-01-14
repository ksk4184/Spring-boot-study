package com.mybatis;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**

Mybatis : jdbc를 사용하면서 불편한 점들을 개선해주는 프레임워크

jdbc 하면서 불편했던점!
connection (자원관리, 예외처리)
파라미터 매핑  ("select * from bydb where id=? and name=?")
결과값 매핑  (esultSet rs.next() 컬럼의 타입과 이름을 매핑)



Mybatis는 잠깐잠깐 세션을 열고 닫는다.

설정파일을 읽어서 Mybatis를 사용할 수 있도록 세션을 만들어주는 클래스
홈페이지에서 코드 복붙
이 세션을 여러개 만들지 않도록 싱글톤 디자인패턴으로 만들어 보자


 */

public class MybatisConnectionFactory {
	private static SqlSessionFactory sqlSessionFactory;
	static {
		try {
			String resource = "com/mybatis/config.xml";//"설정파일";
			InputStream inputStream = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
}
