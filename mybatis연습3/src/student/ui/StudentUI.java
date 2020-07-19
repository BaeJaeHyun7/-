//����� ȭ�� - ����
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
				case 1: input();	break;
				case 2: output();	break;
				case 3: delete();	break;
				case 4: update();	break;
				case 5: search();	break;
				case 0: 	
					System.out.println("���α׷��� �����մϴ�."); 
					return;
				default: 	
					System.out.println("�ٽ� �����ϼ���.");
			}
		}
	}
	
	public void menuPrint() {
		
		System.out.println("���ϴ� �޴��� �����ϼ���");
		System.out.println("1. ���� ");
		System.out.println("2. ��ü ��� ");
		System.out.println("3. ���� ");
		System.out.println("4. ���� ");
		System.out.println("5. ã�� ");
		System.out.println("0. ���� ");
	}
	
	public void input() {
		sc.nextLine();
		System.out.println("�й� �Է� : ");
		String id = sc.nextLine();
		System.out.println("�̸� �Է� : ");
		String name = sc.nextLine();
		System.out.println("�������� �Է� : ");
		int kor = sc.nextInt();
		System.out.println("�������� �Է� : ");
		int eng = sc.nextInt();
		System.out.println("�������� �Է� : ");
		int mat = sc.nextInt();
		
		Student s = new Student(id, name, kor, eng, mat);
		int n = dao.insert(s);
		if(n == 0) {System.out.println("�������");}
		else {System.out.println("���� ����");}
		
	}
	
	public void output() {
		
		ArrayList<Student> list;
		System.out.println("�й� /t �̸� /t �������� /t �������� /t �������� /t");
		list = dao.selectAll();
		
		if(list == null || list.size() == 0) System.out.println("����� �����Ͱ� �����ϴ�.");
		else {
			for (int i = 0; i < list.size(); i++) {
				Student s = list.get(i);
				System.out.print(s.getId()+"\t");
				System.out.print(s.getName()+"\t");
				System.out.print(s.getKor()+"\t");
				System.out.print(s.getEng()+"\t");
				System.out.print(s.getMat()+"\t");
				System.out.println(s.getAvg()+"\t");
			}
		}
		
		
	}
	
	public void delete() {
		sc.nextLine();
		System.out.println("�й� �Է� : ");
		String id = sc.nextLine();
		
		int n = dao.delete(id);
		if(n == 0) {System.out.println("���� ���� : ");}
		else {System.out.println("���� ���� : ");}
		
	}
	
	public void update() {
		sc.nextLine();
		System.out.println("������ �й� �Է� : ");
		String id = sc.nextLine();
		System.out.println("�̸� �Է� : ");
		String name = sc.nextLine();
		System.out.println("�������� �Է�");
		int kor = sc.nextInt();
		System.out.println("�������� �Է�");
		int eng = sc.nextInt();
		System.out.println("�������� �Է�");
		int mat = sc.nextInt();
		
		Student s = new Student(id, name, kor, eng, mat);
		int n = dao.update(s);
		if(n == 0) {System.out.println("���� ����");}
		else {System.out.println("���� ����");}
	}
	
	public void search() {
		
		ArrayList<Student>list;
		
		sc.nextLine();
		System.out.println("�˻��� �̸� : ");
		String name = sc.nextLine();
		
		list = dao.selectName(name);
		
		if(list == null || list.size() == 0) 
			{System.out.println("����� �����Ͱ� �����ϴ�.");}
		else {
			for (int i = 0; i < list.size(); i++) {
				Student s = list.get(i);
				System.out.print(s.getId()+"\t");
				System.out.print(s.getName()+"\t");
				System.out.print(s.getKor()+"\t");
				System.out.print(s.getEng()+"\t");
				System.out.print(s.getMat()+"\t");
				System.out.println(s.getAvg()+"\t");
			}
		
		
	}
	
	
	
	
		
	
	}
}
