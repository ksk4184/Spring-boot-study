import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import dao.ProductDAO;
import model.Product;

/**
 *
 * 이번프로젝트는
 * Spring 컨테이너도 이용하고
 * Mybatis도 이용하는 프로젝트임
 * 
 * 저번 MybatisTest2 프로젝트는 Mybatis만 이용한것
 *
 * src : 프로젝트의 클래스들의 루트
 *  src/main/java		자바
 *  src/main/resources	xml, 이미지... 
 *  src/test/java		테스트용
 *  
 *  폴더구조 : 종류별로 구분할 수 있도록 분류\
 *  
 *  여하튼 간에 패키지는 아니다 src, test, java, main 등등은!
 *  
 *  
 *  클래스의 경로 : "oo.oo.클래스명" 하위폴더를 . 으로 구분
 *  xml의 경로 : "oo/oo/oo.xml" 하위폴더를 / 로 구분
 *  
 *  Mybatis의 장점
 *  1. 자바코드로부터 SQL문을 분리해줌
 *  2. "id=? and name=?", ResultSet 결과값 매핑을 편리하게 해줌
 *  3. SqlSession로 Connection 관리 + 트랜잭션관리
 *  
 *  Spring의 장점
 *  1. 객체를 관리할 수 있는 컨테이너를 제공한다.
 *  
 *  ****해야할 작업
 *  pom.xml에 dependency 추가 (라이브러리 설치)
 *  	(참고, context설치되면 Core도 설치된거)
 *  	Spring Core(기본설치됨), Spring context(기본설치됨), Spring jdbc
 *  	Mybatis, Mybatis-Spring
 *  	MySql
 *  
 *  	4개 설치하면됨
 *  
 *  applicationContext.xml 데이터베이스 정보, 알리아스, 매퍼파일의 위치
 *  						빈 객체 관리하고 싶은 패키지를 스캔
 *  						SqlSessionFactoryBean 등록
 *  						SqlSessionTemplete 등록
 *  
 *  dao.mapper productMapper.xml 작성 SQL문을 저장해놓음
 *  model에  VO 객체 Product 클래스 등록
 *  dao 패키지에서 ProductDAO작성
 *  	@Autowired로 일치하는 객체 SqlSessionFactory를 변수로 가져옴
 *  
 *  
 *  
 *
 */
public class Test {
	private static ProductDAO dao;
	private static Product pr;

	public static void main(String[] args) {
		ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");
		dao = context.getBean("productDAO", ProductDAO.class);
		Product product = dao.selectOne(1);
		System.out.println(product.toString());
		
		System.out.println("-------------- selectAll");
		print();
		
		
		System.out.println("-------------- insert");
		pr = new Product();
		pr.setName("김성식");
		pr.setDescription("안녕하세요");
		pr.setPictureurl("www.");
		pr.setPrice(20000);
		dao.insert(pr);
		print();
		
		
		System.out.println("-------------- delete");
		dao.delete(11);
		print();
		
		
		System.out.println("-------------- update");
		pr = new Product();
		pr.setCode(14);
		pr.setName("김상사");
		pr.setDescription("안녕하세요");
		pr.setPictureurl("www.");
		pr.setPrice(25000);
		dao.update(pr);
		print();
		
		
	}
	
	public static void print() {
		List<Product> pl = dao.selectAll();
		System.out.println("code\tname\tprice\tpictureurl\tdescription");
		for (Product pr : pl) {
			System.out.println(pr.getCode()+"\t"+pr.getName()+"\t"
					+pr.getPrice()+"\t"+pr.getDescription());
		}
	}
}
