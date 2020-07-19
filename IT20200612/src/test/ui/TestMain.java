package test.ui;

import java.util.Scanner;

import test.dao.PersonDao;
import test.vo.Person;

public class TestMain {

	public static void main(String[] args) {
		//회원가입기능을 만들겠다.
		//1. 데이터를 사용자로부터 입력받는다.
		Scanner sc = new Scanner(System.in);
		/*System.out.println("이름을 입력해 주세요 : ");
		String name = sc.nextLine();
		System.out.println("나이를 입력해 주세요 : ");
		int age = sc.nextInt();
		//2. 입력받은 데이터를 회원정보 객체에 저장한다.
		Person p = new Person();
		p.setName(name);
		p.setAge(age);
		//3. 저장된 회원정보 객체를 DB에 전달한다.
		PersonDao dao = new PersonDao();
		dao.insertPerson(p);
		
		//4. DB에서 전달받은 회원가입 객체를 insert 쿼리문을 사용해서 등록한다.
		// 일단 쿼리문부터 만들어야 한다.*/
		
		//회원정보를 삭제하는 기능을 만들어보겠습니다.
		//1. 사용자로부터 삭제하려는 회원의 pk(회원번호)를 입력받는다.
		System.out.println("삭제하려는 회원의 회원번호를 입력해 주세요 : ");
		int num = sc.nextInt();
		//2. 입력받은 pk를 DB에 전달해서 delete 쿼리문을 실행한다.
		PersonDao dao = new PersonDao();
		dao.deletePerson(num);

	}

}
