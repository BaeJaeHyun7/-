//사용자 화면
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
			case 0 : System.out.println("프로그램을 종료합니다.");
	
				return;

			default : System.out.println("잘못 입력하셨습니다.");
				break;
			}
		}
	}
	
	public void menuPrint() {
		System.out.println("[ 학생 성적 관리 ]");
		System.out.println("1. 입력");
		System.out.println("2. 전체 출력");
		System.out.println("3. 삭제");
		System.out.println("4. 수정");
		System.out.println("5. 검색");
		System.out.println("0. 종료");
		System.out.print("선택>");
	}
	
	public void input() {
		sc.nextLine();
		System.out.println("[ 성적 입력 ]");
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		int mat = sc.nextInt();
		
		Student s = new Student(name, kor, eng, mat);
		int n = dao.insertStudent(s);
		if(n==0) System.out.println("* 저장 실패");
		else System.out.println("* 저장되었습니다.");
	}
	public void output() {
		sc.nextLine();
		System.out.println("[ 전체 학생 정보 ]");
		System.out.println("학번"+"굏"+"이름"+"굏"+"국어"+"굏"+"영어"+"굏"+"수학");
		ArrayList<Student> list;
		list = dao.selectStudentAll();
		
		if (list == null || list.size() == 0) {
			System.out.println("* 저장된 데이터가 없습니다.");
		}else {
			for (int i = 0; i < list.size(); i++) {
				Student s = list.get(i);
				System.out.print(s.getId()+"굏");
				System.out.print(s.getName()+"굏");
				System.out.print(s.getKor()+"굏");
				System.out.print(s.getEng()+"굏");
				System.out.println(s.getMat()+"굏");
			}
		}
		
	}
	
	public void delete() {
		sc.nextLine();
		System.out.println("[ 삭제 ]");
		System.out.print("삭제할 학번 : ");
		int id = sc.nextInt();
		
		int n = dao.deleteStudent(id);
		if(n==0) System.out.println("* 해당하는 학번이 없습니다.");
		else System.out.println("*"+n+"건이 삭제되었습니다.");
	}
	
	public void update() {
		sc.nextLine();
		System.out.println("[ 수정 ]");
		System.out.print("수정할 학번 : ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.print("이름 : ");
		String name = sc.nextLine();
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		int mat = sc.nextInt();
		
		Student s = new Student(id, name, kor, eng, mat);
		int n = dao.updateStudent(s);
		if(n==0) System.out.println(" 수정 실패.");
		else System.out.println("* 수정되었습니다.");
	}
	
	public void search() {
		sc.nextLine();
		System.out.println("[ 검색 ]");
		System.out.print("검색할 이름 : ");
		String name = sc.nextLine();
		
		ArrayList<Student>list;
		
		list = dao.searchStudent(name);
		
		if (list == null || list.size() == 0) {
			System.out.println("* 저장된 데이터가 없습니다.");
		}else {
			for (int i = 0; i < list.size(); i++) {
				System.out.println("학번"+"굏"+"이름"+"굏"+"국어"+"굏"+"영어"+"굏"+"수학");
				Student s = list.get(i);
				System.out.print(s.getId()+"굏");
				System.out.print(s.getName()+"굏");
				System.out.print(s.getKor()+"굏");
				System.out.print(s.getEng()+"굏");
				System.out.println(s.getMat()+"굏");
			}
		}
		
		
	}
	
	
	
	
	
}
