import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		
	   
		while (true) {
			try {
				   Scanner sc = new Scanner(System.in);	
					System.out.print("�ݵ�� ������ �Է����ּ��� : ");
					int num = sc.nextInt();		
					System.out.println("�Է¹��� ������ : "+ num);
				    break;
			} catch (Exception e) {
				System.out.println("������ �Է��϶�ϱ�");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	    
		 
			
			
			
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*do {
			
			try {			
				Scanner sc = new Scanner(System.in);	
				System.out.print("�ݵ�� ������ �Է����ּ��� : ");
				int num = sc.nextInt();		
				System.out.println("�Է¹��� ������ : "+ num);
				break;
			} catch (InputMismatchException e) {
				System.out.println("������ �Է��϶�ϱ�");
			}finally {
				System.out.println("������ ����Ǵ� ����");
			}
			
		} while (true);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*boolean flag = true;
		do {
			
			try {
				
				Scanner sc = new Scanner(System.in);
					
				System.out.print("�ݵ�� ������ �Է����ּ��� : ");
				int num = sc.nextInt();
				
				System.out.println("�Է¹��� ������ : "+ num);
				flag = false;

			}catch(InputMismatchException e) {
				System.out.println("���� �Է��ض� ������");
			}
			
		} while (flag == true);*/
		
		
		
		
		
		
		

}
}