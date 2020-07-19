package book.ui;

import java.util.ArrayList;
import java.util.Scanner;

import book.dao.BookDAO;
import book.vo.BookVO;

/**
 * ���� ���� ����� �������̽�
 */
public class BookUI {

	/**
	 * ���� ���� ó�� ����� ����ϴ� Ŭ������ ��ü
	 */
	BookDAO dao;
	/**
	 * Ű���� �Է� ����� ��ü
	 */
	Scanner scan;
	
	/**
	 * �⺻ ������ - ���� ��ü ���� ������ BookDAO�� Scanner Ŭ������ ��ü�� �����Ͽ� ����Ѵ�.
	 */
	public BookUI() {
		dao = new BookDAO();
		scan = new Scanner(System.in);
		
		int menu;
		
		
		while (true) {
			menu = printMenu();
			
			switch (menu) {
				case 1 : input();	break;	//���
				case 2 : output();	break;	//���
				case 3 : delete();	break;	//����
				case 4 : update();	break;	//����
				case 5 : search();	break;	//�˻�
				case 0 : 					//����
					System.out.println("[�˸�] ���α׷��� �����մϴ�.");
					return;
				default : 
					System.out.println("[�˸�] �ٽ� �����ϼ���.");
			}
		}

	}
	
	/**
	 * �޴� ��� ȭ�� & �޴� ��ȣ �Է�
	 * @return ����ڰ� �Է��� �޴� ��ȣ
	 */
	public int printMenu() {
		int num = 0;
		
		System.out.println();
		System.out.println("   [ ���� ����  ]     ");
		System.out.println("  1.  �������� ���       ");
		System.out.println("  2.  ��ü��� ���       ");
		System.out.println("  3.  �������� ����       ");
		System.out.println("  4.  �������� ����       ");
		System.out.println("  5.  �˻�                    ");
		System.out.println("  0.  ���α׷� ����       ");
		System.out.print(" * ��ȣ���� : ");
		
		num = scan.nextInt();
		return num;
	}

	/**
	 * �� �������� ��� ȭ��
	 */
	public void input() {
		String title, author, publisher; 
		int price;
		BookVO vo;
		int result = 0;
		
		System.out.println("�n  [ �� �������� ��� ]");
		scan.nextLine();
		
		System.out.print("���� : ");
		title = scan.nextLine();
		System.out.print("���� : ");
		author = scan.nextLine();
		System.out.print("���ǻ� : ");
		publisher = scan.nextLine();
		System.out.print("���� : ");
		price = scan.nextInt();
		
		vo = new BookVO(title, author, publisher, price);
		result = dao.insertBook(vo);
		if(result == 1) {
			System.out.println("[�˸�] ����Ǿ����ϴ�.");
		} else {
			System.out.println("[�˸�] ���� �����Ͽ����ϴ�.");
		}
	}
	
	/**
	 * ��ü ������� ��� ȭ��
	 */
	public void output() {
		System.out.println("�n  [ ��ü ������� ]�n");
		ArrayList<BookVO> list = dao.listAll();
		BookVO vo = null;
		
		if (list == null || list.size() == 0) {
			System.out.println("[�˸�] ��ϵ� �����Ͱ� �����ϴ�.");
		}
		else {
			System.out.println("��ȣ�t����t���ڂt���ǻ�t���݂t�����");
			System.out.println("===================================================");
			for (int i = 0; i < list.size(); i++) {
				vo = list.get(i);
				System.out.print(vo.getBnum() + "�t");
				System.out.print(vo.getTitle() + "�t");
				System.out.print(vo.getAuthor() + "�t");
				System.out.print(vo.getPublisher() + "�t");
				System.out.print(vo.getPrice() + "�t");
				System.out.print(vo.getInputdate());
				System.out.println();
			}
			System.out.println();
		}
	}
	
	/**
	 * ��ȣ�� ���� ���� ȭ��
	 */
	public void delete() {
		int bnum;
		int result = 0;
	
		System.out.println("�n  [ �������� ���� ]");
		System.out.print("������ ��ȣ : ");
		bnum = scan.nextInt();
		
		result = dao.deleteBook(bnum);
		
		if (result == 0) {
			System.out.println("[�˸�] �ش� ��ȣ�� �����Ͱ� �����ϴ�.");
		}
		else {
			System.out.println("[�˸�] �����Ǿ����ϴ�.");
		}
	}
	
	/**
	 * �������� ���� ȭ��
	 */
	public void update() {
		String title, author, publisher;
		int price, bnum, result = 0;
		BookVO vo = null;
	
		System.out.println("�n  [ �������� ���� ]");
		System.out.print("������ ������ȣ : ");
		bnum = scan.nextInt();
		
		vo = dao.getBook(bnum);
		
		if (vo == null) {
			System.out.println("[�˸�] �ش� ��ȣ�� �����Ͱ� �����ϴ�.");
			return;
		}
		else {
			System.out.println("* ���� ����");
			System.out.println("��ȣ : " + vo.getBnum());
			System.out.println("���� : " + vo.getTitle());
			System.out.println("���� : " + vo.getAuthor());
			System.out.println("���ǻ� : " + vo.getPublisher());
			System.out.println("���� : " + vo.getPrice());
			System.out.println("======================="); 
			
			System.out.println("* ������ ����");
			scan.nextLine();
			System.out.print("���� : ");
			title = scan.nextLine();
			System.out.print("���� : ");
			author = scan.nextLine();
			System.out.print("���ǻ� : ");
			publisher = scan.nextLine();
			System.out.print("���� : ");
			price = scan.nextInt();
			
			vo = new BookVO(bnum, title, author, publisher, price);
			result = dao.updateBook(vo);
			
			if (result == 0) {
				System.out.println("[�˸�] �����Ͱ� �����ϴ�.");
			}
			else {
				System.out.println("[�˸�] �����Ǿ����ϴ�.");
			}
		}
	}
	
	
	/**
	 * �˻� ȭ��
	 */
	public void search() {
		String text;
		ArrayList<BookVO> list = null;
		BookVO vo = null;
	
		System.out.println("�n [ �� �� ]");
		System.out.print("�˻��� ���� : ");
		scan.nextLine();
		text = scan.nextLine();
		
		list = dao.searchBook(text);
		
		if (list == null || list.size() == 0) {
			System.out.println("[�˸�] �˻� ����� �����ϴ�.");
		}
		else {
			System.out.println("��ȣ�t����t���ڂt���ǻ�t���݂t�����");
			System.out.println("===================================================");
			for (int i = 0; i < list.size(); i++) {
				vo = list.get(i);
				System.out.print(vo.getBnum() + "�t");
				System.out.print(vo.getTitle() + "�t");
				System.out.print(vo.getAuthor() + "�t");
				System.out.print(vo.getPublisher() + "�t");
				System.out.print(vo.getPrice() + "�t");
				System.out.print(vo.getInputdate());
				System.out.println();
			}
			System.out.println();
		}
	}

}
