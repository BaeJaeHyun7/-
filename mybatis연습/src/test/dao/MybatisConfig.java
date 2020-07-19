
package test.dao;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Mybatis�� ȯ�� ���� �а� ��ü ����
 */
public class MybatisConfig {
	private static SqlSessionFactory sqlSessionFactory;
	
	
     
	//static ��
	//�ش� Ŭ������ �ε��ɶ� �� �ѹ��� ȣ��(����)��.
	//���ø�ĳ�̼��� ����Ǹ� ���ø����̼� �ȿ� �ִ� ��� Ŭ������ �ε��˴ϴ�.
	//��ü������ �ƴ�
	//�������ִ°� ���� �ѹ���ĵ�� ������ ��������°� ��ü�����Ҷ� �ϴ°Ŵ�.
	//��� �޼ҵ尡 �ƴ϶� static block���� �Ҹ�
	//��ȸ���ڵ�
	static {
		String resource = "mybatis-config.xml";		//Mybatis ȯ�漳�� ���� �б�. src ��ο� ����.
		

		try {
			Reader reader = Resources.getResourceAsReader(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
			reader.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
}
