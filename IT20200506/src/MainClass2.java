import java.util.Scanner;

public class MainClass2 {

	public static void main(String[] args) {
		
		Calculator2 cal = new Calculator2();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է��ϼ���");
		int num1 = sc.nextInt();
		System.out.println("������ �Է��ϼ���");
		int num2 = sc.nextInt();
		
		int sum = cal.minus(num1,num2);
		
		System.out.println(sum);
		
		
		
		
		

	}

}
