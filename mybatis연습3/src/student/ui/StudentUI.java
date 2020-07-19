//사용자 화면 - 연습
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
					System.out.println("프로그램을 종료합니다."); 
					return;
				default: 	
					System.out.println("다시 선택하세요.");
			}
		}
	}
	
	public void menuPrint() {
		
		System.out.println("원하는 메뉴를 선택하세요");
		System.out.println("1. 저장 ");
		System.out.println("2. 전체 출력 ");
		System.out.println("3. 삭제 ");
		System.out.println("4. 수정 ");
		System.out.println("5. 찾기 ");
		System.out.println("0. 종료 ");
	}
	
	public void input() {
		sc.nextLine();
		System.out.println("학번 입력 : ");
		String id = sc.nextLine();
		System.out.println("이름 입력 : ");
		String name = sc.nextLine();
		System.out.println("국어점수 입력 : ");
		int kor = sc.nextInt();
		System.out.println("영어점수 입력 : ");
		int eng = sc.nextInt();
		System.out.println("수학점수 입력 : ");
		int mat = sc.nextInt();
		
		Student s = new Student(id, name, kor, eng, mat);
		int n = dao.insert(s);
		if(n == 0) {System.out.println("저장실패");}
		else {System.out.println("저장 성공");}
		
	}
	
	public void output() {
		
		ArrayList<Student> list;
		System.out.println("학번 /t 이름 /t 국어점수 /t 영어점수 /t 수학점수 /t");
		list = dao.selectAll();
		
		if(list == null || list.size() == 0) System.out.println("저장된 데이터가 없습니다.");
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
		System.out.println("학번 입력 : ");
		String id = sc.nextLine();
		
		int n = dao.delete(id);
		if(n == 0) {System.out.println("삭제 실패 : ");}
		else {System.out.println("삭제 성공 : ");}
		
	}
	
	public void update() {
		sc.nextLine();
		System.out.println("수정할 학번 입력 : ");
		String id = sc.nextLine();
		System.out.println("이름 입력 : ");
		String name = sc.nextLine();
		System.out.println("국어점수 입력");
		int kor = sc.nextInt();
		System.out.println("영어점수 입력");
		int eng = sc.nextInt();
		System.out.println("수학점수 입력");
		int mat = sc.nextInt();
		
		Student s = new Student(id, name, kor, eng, mat);
		int n = dao.update(s);
		if(n == 0) {System.out.println("수정 실패");}
		else {System.out.println("수정 성공");}
	}
	
	public void search() {
		
		ArrayList<Student>list;
		
		sc.nextLine();
		System.out.println("검색할 이름 : ");
		String name = sc.nextLine();
		
		list = dao.selectName(name);
		
		if(list == null || list.size() == 0) 
			{System.out.println("저장된 데이터가 없습니다.");}
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
