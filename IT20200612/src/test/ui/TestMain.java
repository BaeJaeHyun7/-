package test.ui;

import java.util.Scanner;

import test.dao.PersonDao;
import test.vo.Person;

public class TestMain {

	public static void main(String[] args) {
		//ȸ�����Ա���� ����ڴ�.
		//1. �����͸� ����ڷκ��� �Է¹޴´�.
		Scanner sc = new Scanner(System.in);
		/*System.out.println("�̸��� �Է��� �ּ��� : ");
		String name = sc.nextLine();
		System.out.println("���̸� �Է��� �ּ��� : ");
		int age = sc.nextInt();
		//2. �Է¹��� �����͸� ȸ������ ��ü�� �����Ѵ�.
		Person p = new Person();
		p.setName(name);
		p.setAge(age);
		//3. ����� ȸ������ ��ü�� DB�� �����Ѵ�.
		PersonDao dao = new PersonDao();
		dao.insertPerson(p);
		
		//4. DB���� ���޹��� ȸ������ ��ü�� insert �������� ����ؼ� ����Ѵ�.
		// �ϴ� ���������� ������ �Ѵ�.*/
		
		//ȸ�������� �����ϴ� ����� �����ڽ��ϴ�.
		//1. ����ڷκ��� �����Ϸ��� ȸ���� pk(ȸ����ȣ)�� �Է¹޴´�.
		System.out.println("�����Ϸ��� ȸ���� ȸ����ȣ�� �Է��� �ּ��� : ");
		int num = sc.nextInt();
		//2. �Է¹��� pk�� DB�� �����ؼ� delete �������� �����Ѵ�.
		PersonDao dao = new PersonDao();
		dao.deletePerson(num);

	}

}
