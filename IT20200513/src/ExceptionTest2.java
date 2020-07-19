import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {
		
	   
		while (true) {
			try {
				   Scanner sc = new Scanner(System.in);	
					System.out.print("반드시 정수를 입력해주세요 : ");
					int num = sc.nextInt();		
					System.out.println("입력받은 정수는 : "+ num);
				    break;
			} catch (Exception e) {
				System.out.println("정수를 입력하라니깐");
			}
		}
		
		
		
		
		
		
		
		
		
		
		
	    
		 
			
			
			
		
		
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*do {
			
			try {			
				Scanner sc = new Scanner(System.in);	
				System.out.print("반드시 정수를 입력해주세요 : ");
				int num = sc.nextInt();		
				System.out.println("입력받은 정수는 : "+ num);
				break;
			} catch (InputMismatchException e) {
				System.out.println("정수를 입력하라니깐");
			}finally {
				System.out.println("무조건 실행되는 구문");
			}
			
		} while (true);*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*boolean flag = true;
		do {
			
			try {
				
				Scanner sc = new Scanner(System.in);
					
				System.out.print("반드시 정수를 입력해주세요 : ");
				int num = sc.nextInt();
				
				System.out.println("입력받은 정수는 : "+ num);
				flag = false;

			}catch(InputMismatchException e) {
				System.out.println("정수 입력해라 좀많이");
			}
			
		} while (flag == true);*/
		
		
		
		
		
		
		

}
}