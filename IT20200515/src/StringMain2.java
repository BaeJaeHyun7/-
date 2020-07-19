import java.util.Scanner;

public class StringMain2 {

	public static void main(String[] args) {
		//사용자로부터 문자열을 입력받아서 반대로 출력하는 프로그램 어플리케이션
		// ex : Hello World -> dlroW olleH
		//한글자 한글자씩 쪼개서 바꿈
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력하세요");
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