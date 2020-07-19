
package test.dao;

import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

/**
 * Mybatis의 환경 설정 읽고 객체 생성
 */
public class MybatisConfig {
	private static SqlSessionFactory sqlSessionFactory;
	
	
     
	//static 블럭
	//해당 클래스가 로딩될때 딱 한번만 호출(실행)됨.
	//어플리캐이션이 실행되면 어플리케이션 안에 있는 모든 클래스가 로딩됩니다.
	//객체생성이 아님
	//가지고있는게 뭔지 한번스캔후 뭔가를 직접만드는건 객체생성할때 하는거다.
	//얘는 메소드가 아니라 static block으로 불림
	//일회용코드
	static {
		String resource = "mybatis-config.xml";		//Mybatis 환경설정 파일 읽기. src 경로에 저장.
		

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
