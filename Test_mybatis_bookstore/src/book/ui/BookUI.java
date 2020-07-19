package book.ui;

import java.util.ArrayList;
import java.util.Scanner;

import book.dao.BookDAO;
import book.vo.BookVO;

/**
 * 서점 관리 사용자 인터페이스
 */
public class BookUI {

	/**
	 * 도서 정보 처리 기능을 담당하는 클래스의 객체
	 */
	BookDAO dao;
	/**
	 * 키보드 입력 기능의 객체
	 */
	Scanner scan;
	
	/**
	 * 기본 생성자 - 현재 객체 최초 생성시 BookDAO와 Scanner 클래스의 객체를 생성하여 사용한다.
	 */
	public BookUI() {
		dao = new BookDAO();
		scan = new Scanner(System.in);
		
		int menu;
		
		
		while (true) {
			menu = printMenu();
			
			switch (menu) {
				case 1 : input();	break;	//등록
				case 2 : output();	break;	//출력
				case 3 : delete();	break;	//삭제
				case 4 : update();	break;	//수정
				case 5 : search();	break;	//검색
				case 0 : 					//종료
					System.out.println("[알림] 프로그램을 종료합니다.");
					return;
				default : 
					System.out.println("[알림] 다시 선택하세요.");
			}
		}

	}
	
	/**
	 * 메뉴 출력 화면 & 메뉴 번호 입력
	 * @return 사용자가 입력한 메뉴 번호
	 */
	public int printMenu() {
		int num = 0;
		
		System.out.println();
		System.out.println("   [ 서점 관리  ]     ");
		System.out.println("  1.  도서정보 등록       ");
		System.out.println("  2.  전체목록 출력       ");
		System.out.println("  3.  도서정보 삭제       ");
		System.out.println("  4.  도서정보 수정       ");
		System.out.println("  5.  검색                    ");
		System.out.println("  0.  프로그램 종료       ");
		System.out.print(" * 번호선택 : ");
		
		num = scan.nextInt();
		return num;
	}

	/**
	 * 새 도서정보 등록 화면
	 */
	public void input() {
		String title, author, publisher; 
		int price;
		BookVO vo;
		int result = 0;
		
		System.out.println("굈  [ 새 도서정보 등록 ]");
		scan.nextLine();
		
		System.out.print("제목 : ");
		title = scan.nextLine();
		System.out.print("저자 : ");
		author = scan.nextLine();
		System.out.print("출판사 : ");
		publisher = scan.nextLine();
		System.out.print("가격 : ");
		price = scan.nextInt();
		
		vo = new BookVO(title, author, publisher, price);
		result = dao.insertBook(vo);
		if(result == 1) {
			System.out.println("[알림] 저장되었습니다.");
		} else {
			System.out.println("[알림] 저장 실패하였습니다.");
		}
	}
	
	/**
	 * 전체 도서목록 출력 화면
	 */
	public void output() {
		System.out.println("굈  [ 전체 도서목록 ]굈");
		ArrayList<BookVO> list = dao.listAll();
		BookVO vo = null;
		
		if (list == null || list.size() == 0) {
			System.out.println("[알림] 등록된 데이터가 없습니다.");
		}
		else {
			System.out.println("번호굏제목굏저자굏출판사굏가격굏등록일");
			System.out.println("===================================================");
			for (int i = 0; i < list.size(); i++) {
				vo = list.get(i);
				System.out.print(vo.getBnum() + "굏");
				System.out.print(vo.getTitle() + "굏");
				System.out.print(vo.getAuthor() + "굏");
				System.out.print(vo.getPublisher() + "굏");
				System.out.print(vo.getPrice() + "굏");
				System.out.print(vo.getInputdate());
				System.out.println();
			}
			System.out.println();
		}
	}
	
	/**
	 * 번호로 정보 삭제 화면
	 */
	public void delete() {
		int bnum;
		int result = 0;
	
		System.out.println("굈  [ 도서정보 삭제 ]");
		System.out.print("삭제할 번호 : ");
		bnum = scan.nextInt();
		
		result = dao.deleteBook(bnum);
		
		if (result == 0) {
			System.out.println("[알림] 해당 번호의 데이터가 없습니다.");
		}
		else {
			System.out.println("[알림] 삭제되었습니다.");
		}
	}
	
	/**
	 * 도서정보 수정 화면
	 */
	public void update() {
		String title, author, publisher;
		int price, bnum, result = 0;
		BookVO vo = null;
	
		System.out.println("굈  [ 도서정보 수정 ]");
		System.out.print("수정할 도서번호 : ");
		bnum = scan.nextInt();
		
		vo = dao.getBook(bnum);
		
		if (vo == null) {
			System.out.println("[알림] 해당 번호의 데이터가 없습니다.");
			return;
		}
		else {
			System.out.println("* 기존 정보");
			System.out.println("번호 : " + vo.getBnum());
			System.out.println("제목 : " + vo.getTitle());
			System.out.println("저자 : " + vo.getAuthor());
			System.out.println("출판사 : " + vo.getPublisher());
			System.out.println("가격 : " + vo.getPrice());
			System.out.println("======================="); 
			
			System.out.println("* 수정할 정보");
			scan.nextLine();
			System.out.print("제목 : ");
			title = scan.nextLine();
			System.out.print("저자 : ");
			author = scan.nextLine();
			System.out.print("출판사 : ");
			publisher = scan.nextLine();
			System.out.print("가격 : ");
			price = scan.nextInt();
			
			vo = new BookVO(bnum, title, author, publisher, price);
			result = dao.updateBook(vo);
			
			if (result == 0) {
				System.out.println("[알림] 데이터가 없습니다.");
			}
			else {
				System.out.println("[알림] 수정되었습니다.");
			}
		}
	}
	
	
	/**
	 * 검색 화면
	 */
	public void search() {
		String text;
		ArrayList<BookVO> list = null;
		BookVO vo = null;
	
		System.out.println("굈 [ 검 색 ]");
		System.out.print("검색할 제목 : ");
		scan.nextLine();
		text = scan.nextLine();
		
		list = dao.searchBook(text);
		
		if (list == null || list.size() == 0) {
			System.out.println("[알림] 검색 결과가 없습니다.");
		}
		else {
			System.out.println("번호굏제목굏저자굏출판사굏가격굏등록일");
			System.out.println("===================================================");
			for (int i = 0; i < list.size(); i++) {
				vo = list.get(i);
				System.out.print(vo.getBnum() + "굏");
				System.out.print(vo.getTitle() + "굏");
				System.out.print(vo.getAuthor() + "굏");
				System.out.print(vo.getPublisher() + "굏");
				System.out.print(vo.getPrice() + "굏");
				System.out.print(vo.getInputdate());
				System.out.println();
			}
			System.out.println();
		}
	}

}
