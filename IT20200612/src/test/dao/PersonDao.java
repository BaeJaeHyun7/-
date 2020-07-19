package test.dao;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import test.vo.Person;

public class PersonDao {

	//����� sqlSessionFactory ��ü�� �ҷ��;� �Ѵ�.
	
	private SqlSessionFactory factory = MybatisConfig.getSqlSessionFactory();
	
	//ȸ�������Ҷ� ������ DAO�� �޼ҵ�
	public void insertPerson(Person vo) {
		//sqlSessionFactory ��ü�� ����ؼ� sqlSession ��ü�� �����Ѵ�.
		//���� �߱޹��� Ű�� ����ؼ� �ǹ��� �����Ѵ�.
		
		SqlSession session = null;
		//DataBase�� ����� �������� �����ϴٰ� ����ġ ���� ������ �������� ����ó���� ���ֱ� ���ؼ�
		try {
			//1. DB�� ������ session�� �����Ѵ�.
			session = factory.openSession();
			
			//2. MapperInterface �� class�� ���·� ���� �޼ҵ带 ȣ���Ҽ� �ְ� �ؾ��Ѵ�.
			PersonMapper mapper = session.getMapper(PersonMapper.class);
			
			//3.class�� ���·� ������� MapperInterface�� ����ؼ� �޼ҵ带 ȣ���Ѵ�.
			//ȸ�������� �����ض�.
			mapper.insertPerson(vo);
			
			//4.insert������ ���� �� �Ŀ��� �����ϱ� ���ؼ� commit�� �ؾ��Ѵ�.
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			//�����ϰ� �����ֱ�
			if(session != null) session.close();
		}
		
	}
	
	//ȸ�� ���� ���
	public void deletePerson(int num) {
		SqlSession session = null;
		
		try {
			session = factory.openSession();
			PersonMapper mapper = session.getMapper(PersonMapper.class);
			//mapper�������̽��� ������ �ִ� �޼ҵ� �߿� ȸ������ �޼ҵ带 ����
			mapper.deletePerson(num);
			session.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			if(session != null) session.close();
		}
	}
	
}
