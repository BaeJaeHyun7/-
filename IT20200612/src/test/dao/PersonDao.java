package test.dao;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import test.vo.Person;

public class PersonDao {

	//사용할 sqlSessionFactory 객체를 불러와야 한다.
	
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	//회원가입할때 실행할 DAO의 메소드
	public void insertPerson(Person vo) {
		//sqlSessionFactory 객체를 사용해서 sqlSession 객체를 생성한다.
		//내가 발급받은 키를 사용해서 건물에 진입한다.
		
		SqlSession session = null;
		//DataBase에 연결된 쿼리문을 시행하다가 예상치 못한 오류를 만났을때 예외처리를 해주기 위해서
		try {
			//1. DB에 연결할 session을 생성한다.
			session = factory.openSession();
			
			//2. MapperInterface 를 class의 형태로 만들어서 메소드를 호출할수 있게 해야한다.
			PersonMapper mapper = session.getMapper(PersonMapper.class);
			
			//3.class의 형태로 만들어진 MapperInterface를 사용해서 메소드를 호출한다.
			//회원가입을 실행해라.
			mapper.insertPerson(vo);
			
			//4.insert쿼리를 실행 한 후에는 적용하기 위해서 commit을 해야한다.
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//연결하고 끊어주기
			if(session != null) session.close();
		}
		
	}
	
	//회원 삭제 기능
	public void deletePerson(int num) {
		SqlSession session = null;
		
		try {
			session = factory.openSession();
			PersonMapper mapper = session.getMapper(PersonMapper.class);
			//mapper인터페이스가 가지고 있는 메소드 중에 회원삭제 메소드를 실행
			mapper.deletePerson(num);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session != null) session.close();
		}
	}
	
}
