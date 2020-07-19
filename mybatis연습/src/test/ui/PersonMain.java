package test.ui;

import java.util.Scanner;

import test.dao.PersonDao;
import test.vo.Person;

public class PersonMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*System.out.println("이름을 입력하세요");
		String name = sc.nextLine();
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		
		Person p = new Person();
		p.setName(name);
		p.setAge(age);
		
		PersonDao dao = new PersonDao();
		dao.insertPerson(p);*/
		
		System.out.println("지울번호를 입력하시오");
		int num = sc.nextInt();
		
		PersonDao dao = new PersonDao();
		dao.deletePerson(num);
		

	}

}
