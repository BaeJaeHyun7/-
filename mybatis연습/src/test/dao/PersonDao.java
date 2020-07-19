package test.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import test.vo.Person;

public class PersonDao {
	
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	public void insertPerson(Person vo) {
		
		SqlSession session = null;
		
		try {
			session = factory.openSession();
			PersonMapper mapper = session.getMapper(PersonMapper.class);
			mapper.insertPerson(vo);
			session.commit();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session != null) session.close();
		}	
	}
	
	public void deletePerson(int num) {
		
SqlSession session = null;
		
		try {
			session = factory.openSession();
			PersonMapper mapper = session.getMapper(PersonMapper.class);
			mapper.deletePerson(num);
			session.commit();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session != null) session.close();
		}	
		
		
	}
		
	

}
