//����� ȭ�� - ����
package student.ui;

import java.util.ArrayList;
import java.util.Scanner;

import org.apache.ibatis.annotations.Insert;

import student.dao.StudentDAO;
import student.vo.Student;

public class StudentUI {
	
	Scanner scan = new Scanner(System.in);
	StudentDAO dao = new StudentDAO();
	
    public StudentUI() {
		while (true) {
			menuPrint();
			int choice = scan.nextInt();
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
	
			case 0 : System.out.println("���α׷��� �����մϴ�");
	
				return;

			default : System.out.println("�߸� �Է��ϼ̽��ϴ�");
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
		System.out.print("���� > ");
    }
    
    public void input() {
    	System.out.println("[ ���� �Է� ]");
		scan.nextLine();
		System.out.print("�й� : ");
		String id = scan.nextLine();
		System.out.print("�̸� : ");
		String name = scan.nextLine();
		System.out.print("���� ���� : ");
		int kor = scan.nextInt();
		System.out.print("���� ���� : ");
		int eng = scan.nextInt();
		System.out.print("���� ���� : ");
		int mat = scan.nextInt();
		
		Student s = new Student(id, name, kor, eng, mat);
		int n = dao.insert(s);
		
		if(n == 0) System.out.println("���� ����");
		else System.out.println("���� ����");    	
    }
    
    public void output() {
    	ArrayList<Student> list;
    	System.out.println("[ ��ü �л� ���� ]");
		System.out.println("�й�\t�̸�\t����\t����\t����\t���");
		
		list = dao.selectAll();
		
		if (list == null || list.size() == 0) {
			System.out.println("����� �����Ͱ� �����ϴ�");
		}else {
			for (int i = 0; i < list.size(); i++) {
				Student s = list.get(i);
				System.out.println(s.getId());
				System.out.println(s.getName());
				System.out.println(s.getKor());
				System.out.println(s.getEng());
				System.out.println(s.getMat());
						
			}
		}
    	
    }
    
    
    
    

	//����
	public void delete() {
		
		
		System.out.println("[ ���� ]");
		System.out.print("������ �й� : ");
		scan.nextLine();
		String id = scan.nextLine();
		
		int n = dao.delete(id);
		
		if (n == 0) {
			System.out.println("* �ش�Ǵ� �й��� �����ϴ�.");
		}
		else {
			System.out.println("* " + n + "���� �����Ǿ����ϴ�.");
		}		
	}
	
	//����
	public void update() {
		
		System.out.println("[ ���� ]");
		scan.nextLine();
		System.out.print("������ �й� : ");
		String id = scan.nextLine();
		System.out.print("�̸� : ");
		String name = scan.nextLine();
		System.out.print("���� ���� : ");
		int kor = scan.nextInt();
		System.out.print("���� ���� : ");
		int eng = scan.nextInt();
		System.out.print("���� ���� : ");
		int mat = scan.nextInt();
		
		Student s = new Student(id, name, kor, eng, mat);
		int n = dao.update(s);
		
		if (n == 0) {
			System.out.println("* ���� ����");
		}
		else {
			System.out.println("* �����Ǿ����ϴ�.");
		}
	}
	
	//�̸����� �˻�
	public void search() {
		
		ArrayList<Student> list;
		
		System.out.println("[�˻�]");
		System.out.println("�˻��� �̸� : ");
		String name = scan.nextLine();
		
	    list = dao.selectName(name);
	    
	    if (list == null || list.size() == 0) {
			System.out.println("����� �����Ͱ� �����ϴ�.");
		}else {
			System.out.println("�й�\t�̸�\t����\t����\t����\t");
			for (int i = 0; i < list.size(); i++) {
				Student s = list.get(i);
				System.out.println(s.getId()+"\t");
				System.out.println(s.getName()+"\t");
				System.out.println(s.getKor()+"\t");
				System.out.println(s.getEng()+"\t");
				System.out.println(s.getMat()+"\t");
				System.out.println(s.getAvg());
			}
		}
		
	}
}
