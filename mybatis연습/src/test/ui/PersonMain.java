package test.ui;

import java.util.Scanner;

import test.dao.PersonDao;
import test.vo.Person;

public class PersonMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		/*System.out.println("�̸��� �Է��ϼ���");
		String name = sc.nextLine();
		System.out.println("���̸� �Է��ϼ���");
		int age = sc.nextInt();
		
		Person p = new Person();
		p.setName(name);
		p.setAge(age);
		
		PersonDao dao = new PersonDao();
		dao.insertPerson(p);*/
		
		System.out.println("�����ȣ�� �Է��Ͻÿ�");
		int num = sc.nextInt();
		
		PersonDao dao = new PersonDao();
		dao.deletePerson(num);
		

	}

}
