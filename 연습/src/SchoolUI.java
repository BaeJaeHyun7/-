import java.util.InputMismatchException;
import java.util.Scanner;

public class SchoolUI {
	
	SchoolManager sm = new SchoolManager();
	Scanner sc = new Scanner(System.in);
	
	public void printMainMenu() {
		System.out.println("=================");
		System.out.println("|| ���� ���� �ý��� ||");
		System.out.println("=================");
		System.out.println("1. ���");
		System.out.println("2. ��ü ���");
		System.out.println("0. ����");
		System.out.println("=================");
		System.out.println("�޴� ����=>");
	}
	
	public void printInsertHumanMenu() {
		System.out.println("============");
		System.out.println("|| ��� �޴� ||");
		System.out.println("============");
		System.out.println("1. �л�");
		System.out.println("2. ����");
		System.out.println("3. ����");
		System.out.println("0. ���� �޴�");
		System.out.println("=============");
		System.out.println("�޴� ����=>");
	}
	
	public void printAll() {
		sm.printAll();
	}
	
	public boolean insertStudent() {
		sc.nextLine();
		System.out.println("============");
		System.out.println("|| �л� ��� ||");
		System.out.println("============");
		
		try {
			System.out.print("�̸� : ");
			String inputName = sc.nextLine();
			System.out.print("���� : ");
			int inputAge = sc.nextInt();
			sc.nextLine();
			System.out.print("�ֹι�ȣ : ");
			String inputSn = sc.nextLine();
			System.out.print("�й� : ");
			String inputSsn = sc.nextLine();
			
			Student student = new Student(inputSn, inputName, inputAge, inputSsn);
			return sm.insertHuman(student);
		} catch (InputMismatchException e) {
			System.out.println("�߸��� �Է�");
			return false;
		}			
	}
	
	public boolean insertStaff() {
		sc.nextLine();
		System.out.println("============");
		System.out.println("|| ���� ��� ||");
		System.out.println("============");
		
		try {
			System.out.print("�̸� : ");
			String inputName = sc.nextLine();
			System.out.print("���� : ");
			int inputAge = sc.nextInt();
			sc.nextLine();
			System.out.print("�ֹι�ȣ : ");
			String inputSn = sc.nextLine();
			System.out.print("�μ� : ");
			String inputField = sc.nextLine();
			
			Staff staff = new Staff(inputSn, inputName, inputAge, inputField);
			return sm.insertHuman(staff);
		} catch (InputMismatchException e) {
			System.out.println("�߸��� �Է�");
			return false;
		}		
	}
	
	public boolean insertProfessor() {
		sc.nextLine();
		System.out.println("============");
		System.out.println("|| ���� ��� ||");
		System.out.println("============");
		
		try {
			System.out.print("�̸� : ");
			String inputName = sc.nextLine();
			System.out.print("���� : ");
			int inputAge = sc.nextInt();
			sc.nextLine();
			System.out.print("�ֹι�ȣ : ");
			String inputSn = sc.nextLine();
			System.out.print("���� : ");
			String inputMajor = sc.nextLine();
			
			Professor professor = new Professor(inputSn, inputName, inputAge, inputMajor);
			return sm.insertHuman(professor);
		} catch (InputMismatchException e) {
			System.out.println("�߸��� �Է�");
			return false;
		}		
	}
	
	public void insertHuman() {
		boolean result = false;
		while(true) {
			printInsertHumanMenu();
			
			try {
				int choice = sc.nextInt();
				
				switch (choice) {
				case 1 : result = insertStudent();
				         if(result) System.out.println("�����ϿϷ�");
				         else System.out.println("��� ����");
					
					break;
					
				case 2 : result = insertStaff(); 
						 if(result) System.out.println("�����ϿϷ�");
						 else System.out.println("��� ����");
					break;
					
				case 3 : result = insertProfessor(); 
						 if(result) System.out.println("�����ϿϷ�");
						 else System.out.println("��� ����");
		
					break;
		
				case 0 :
		
					return;

				default : System.out.println("�߸��� �Է�");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("���ڸ� �Է����ּ���");
			}
			
		}
		
	}
	
	public boolean deleteHuman() {
		sc.nextLine();
		System.out.println("============");
		System.out.println("|| ��ü ���� ||");
		System.out.println("============");
		System.out.println("�ֹι�ȣ �Է� : ");
		String inputSn = sc.nextLine();
		Human h = sm.findHuman(inputSn);
		if(h == null) return false;
		else return sm.deleteHuman(h);
	}
	
	public Human findHuman() {
		sc.nextLine();
		System.out.println("============");
		System.out.println("|| ��ü ã�� ||");
		System.out.println("============");
		System.out.println("�ֹι�ȣ �Է� : ");
		String inputSn = sc.nextLine();
		
		return sm.findHuman(inputSn);
	}	
	
public void exec() {
		
		while(true) {
			printMainMenu();
			
			try {
				int choice = sc.nextInt();
				
				switch (choice) {
				case 1 : insertHuman();
					
					break;
				
				case 2 : Human h = findHuman();
				         if(h != null) h.print();
				         else System.out.println("��ġ�ϴ� ���� ����");
				break;
				
				case 3 : boolean result = deleteHuman();
						 if(result) System.out.println("���� ����");
						 else System.out.println("���� ����");
				
				break;
					
				case 4 : printAll(); 
					
					break;
				
				case 0 :
		
					return;

				default : System.out.println("�߸��� �Է�");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("���ڸ� �Է����ּ���");
			}
			
		}
		
	}

}
