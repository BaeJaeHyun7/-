import java.util.Scanner;

public class StringMain2 {

	public static void main(String[] args) {
		//����ڷκ��� ���ڿ��� �Է¹޾Ƽ� �ݴ�� ����ϴ� ���α׷� ���ø����̼�
		// ex : Hello World -> dlroW olleH
		//�ѱ��� �ѱ��ھ� �ɰ��� �ٲ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���");
		String str = sc.nextLine();
		
		int length = str.length();
		
		char []arr = new char[length];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = str.charAt(i);
		}
		
		for (int i = arr.length-1; i >= 0 ; i--) {
			System.out.print(arr[i]);
		}
		
		
		
		
		
		
		


}
}