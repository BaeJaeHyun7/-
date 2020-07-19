//����� ȭ��
package student.ui;

import java.util.ArrayList;
import java.util.Scanner;

import student.dao.StudentDAO;
import student.vo.Student;

public class StudentUI {
	Scanner sc = new Scanner(System.in);
	StudentDAO dao = new StudentDAO();
	public StudentUI() {
		while (true) {
			menuPrint();
			int choice = sc.nextInt();
			switch (choice) {
			case 1 : input();
				
				break;
			case 2 : output();
				
				break;
			case 3 : delete();
	
				break;
			case 4 : update();
	
				break;
			case 5 : search();
	
				break;
			case 0 : System.out.println("���α׷��� �����մϴ�.");
	
				return;

			default : System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
			}
		}
	}
	
	public void menuPrint() {
		System.out.println("[ �л� ���� ���� ]");
		System.out.println("1. �Է�");
		System.out.println("2. ��ü ���");
		System.out.println("3. ����");
		System.out.println("4. ����");
		System.out.println("5. �˻�");
		System.out.println("0. ����");
		System.out.print("����>");
	}
	
	public void input() {
		sc.nextLine();
		System.out.println("[ ���� �Է� ]");
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("���� ���� : ");
		int kor = sc.nextInt();
		System.out.print("���� ���� : ");
		int eng = sc.nextInt();
		System.out.print("���� ���� : ");
		int mat = sc.nextInt();
		
		Student s = new Student(name, kor, eng, mat);
		int n = dao.insertStudent(s);
		if(n==0) System.out.println("* ���� ����");
		else System.out.println("* ����Ǿ����ϴ�.");
	}
	public void output() {
		sc.nextLine();
		System.out.println("[ ��ü �л� ���� ]");
		System.out.println("�й�"+"�t"+"�̸�"+"�t"+"����"+"�t"+"����"+"�t"+"����");
		ArrayList<Student> list;
		list = dao.selectStudentAll();
		
		if (list == null || list.size() == 0) {
			System.out.println("* ����� �����Ͱ� �����ϴ�.");
		}else {
			for (int i = 0; i < list.size(); i++) {
				Student s = list.get(i);
				System.out.print(s.getId()+"�t");
				System.out.print(s.getName()+"�t");
				System.out.print(s.getKor()+"�t");
				System.out.print(s.getEng()+"�t");
				System.out.println(s.getMat()+"�t");
			}
		}
		
	}
	
	public void delete() {
		sc.nextLine();
		System.out.println("[ ���� ]");
		System.out.print("������ �й� : ");
		int id = sc.nextInt();
		
		int n = dao.deleteStudent(id);
		if(n==0) System.out.println("* �ش��ϴ� �й��� �����ϴ�.");
		else System.out.println("*"+n+"���� �����Ǿ����ϴ�.");
	}
	
	public void update() {
		sc.nextLine();
		System.out.println("[ ���� ]");
		System.out.print("������ �й� : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("�̸� : ");
		String name = sc.nextLine();
		System.out.print("���� ���� : ");
		int kor = sc.nextInt();
		System.out.print("���� ���� : ");
		int eng = sc.nextInt();
		System.out.print("���� ���� : ");
		int mat = sc.nextInt();
		
		Student s = new Student(id, name, kor, eng, mat);
		int n = dao.updateStudent(s);
		if(n==0) System.out.println(" ���� ����.");
		else System.out.println("* �����Ǿ����ϴ�.");
	}
	
	public void search() {
		sc.nextLine();
		System.out.println("[ �˻� ]");
		System.out.print("�˻��� �̸� : ");
		String name = sc.nextLine();
		
		ArrayList<Student>list;
		
		list = dao.searchStudent(name);
		
		if (list == null || list.size() == 0) {
			System.out.println("* ����� �����Ͱ� �����ϴ�.");
		}else {
			for (int i = 0; i < list.size(); i++) {
				System.out.println("�й�"+"�t"+"�̸�"+"�t"+"����"+"�t"+"����"+"�t"+"����");
				Student s = list.get(i);
				System.out.print(s.getId()+"�t");
				System.out.print(s.getName()+"�t");
				System.out.print(s.getKor()+"�t");
				System.out.print(s.getEng()+"�t");
				System.out.println(s.getMat()+"�t");
			}
		}
		
		
	}
	
	
	
	
	
}
