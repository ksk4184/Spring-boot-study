package dao;
/**
*
* 세션의 객체는 우리가 만들지 않는다, 알아서 스프링이 만들어준다.
* 데이터베이스와 연동하는 작업만 한다
*
*/

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mysql.cj.Session;

import model.Product;

@Component
public class ProductDAO {
	
	@Autowired // 일치하는 타입을 찾아서 객체를 닫아준다.
	private SqlSessionFactory sessionFactory;
	
	/** 테이블 code 값을 기준으로 데이터를 조회하는 메서드*/
	// 세션은 한번 열었다쓰고 닫아주는 것이 권장사항
	public Product selectOne(int code) {
		// sql 작업을 위해서 세션을 얻어와야함.
		// 세션은 작업 후에 바로바로 닫아주어야함.
		
		SqlSession session = null;
		try {
			session = sessionFactory.openSession(); // (false) 수동 
			Product p = session.selectOne("dao.mapper.productMapper.selectOne",code); // product결과가 넘어올것임
			return p;
		}
		finally { // finally는 에러없이 실행될때 무조건 실행된다.
			session.close();
		}
	}
	
	
	public List<Product> selectAll() {
		SqlSession session = null;
		try {
			session = sessionFactory.openSession();
			List<Product> al = session.selectList("dao.mapper.productMapper.selectAll");
			return al;
		}
		finally {
			session.close();
		}		
	}
	
	public int insert(Product product) {
		SqlSession session = null;
		try {
			session = sessionFactory.openSession();
			int result = session.insert("dao.mapper.productMapper.insert", product);
			return result;
		}
		finally {
			session.close();
		}
	}
	
	public int delete(int code) {
		SqlSession session = null;
		try {
			session = sessionFactory.openSession();
			int result = session.delete("dao.mapper.productMapper.delete", code);
			return result;
		}
		finally {
			session.close();
		}
		
	}
	
	public int update(Product product) {
		SqlSession session = null;
		try {
			session = sessionFactory.openSession();
			int result = session.delete("dao.mapper.productMapper.update", product);
			return result;
		}
		finally {
			session.close();
		}
		
	}
	
	
	
	

}
