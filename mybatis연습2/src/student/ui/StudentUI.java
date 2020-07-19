//사용자 화면 - 연습
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
	
			case 0 : System.out.println("프로그램을 종료합니다");
	
				return;

			default : System.out.println("잘못 입력하셨습니다");
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
		System.out.print("선택 > ");
    }
    
    public void input() {
    	System.out.println("[ 성적 입력 ]");
		scan.nextLine();
		System.out.print("학번 : ");
		String id = scan.nextLine();
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("국어 점수 : ");
		int kor = scan.nextInt();
		System.out.print("영어 점수 : ");
		int eng = scan.nextInt();
		System.out.print("수학 점수 : ");
		int mat = scan.nextInt();
		
		Student s = new Student(id, name, kor, eng, mat);
		int n = dao.insert(s);
		
		if(n == 0) System.out.println("저장 실패");
		else System.out.println("저장 성공");    	
    }
    
    public void output() {
    	ArrayList<Student> list;
    	System.out.println("[ 전체 학생 정보 ]");
		System.out.println("학번\t이름\t국어\t영어\t수학\t평균");
		
		list = dao.selectAll();
		
		if (list == null || list.size() == 0) {
			System.out.println("저장된 데이터가 없습니다");
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
    
    
    
    

	//삭제
	public void delete() {
		
		
		System.out.println("[ 삭제 ]");
		System.out.print("삭제할 학번 : ");
		scan.nextLine();
		String id = scan.nextLine();
		
		int n = dao.delete(id);
		
		if (n == 0) {
			System.out.println("* 해당되는 학번이 없습니다.");
		}
		else {
			System.out.println("* " + n + "건이 삭제되었습니다.");
		}		
	}
	
	//수정
	public void update() {
		
		System.out.println("[ 수정 ]");
		scan.nextLine();
		System.out.print("수정할 학번 : ");
		String id = scan.nextLine();
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("국어 점수 : ");
		int kor = scan.nextInt();
		System.out.print("영어 점수 : ");
		int eng = scan.nextInt();
		System.out.print("수학 점수 : ");
		int mat = scan.nextInt();
		
		Student s = new Student(id, name, kor, eng, mat);
		int n = dao.update(s);
		
		if (n == 0) {
			System.out.println("* 수정 실패");
		}
		else {
			System.out.println("* 수정되었습니다.");
		}
	}
	
	//이름으로 검색
	public void search() {
		
		ArrayList<Student> list;
		
		System.out.println("[검색]");
		System.out.println("검색할 이름 : ");
		String name = scan.nextLine();
		
	    list = dao.selectName(name);
	    
	    if (list == null || list.size() == 0) {
			System.out.println("저장된 데이터가 없습니다.");
		}else {
			System.out.println("학번\t이름\t국어\t영어\t수학\t");
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
