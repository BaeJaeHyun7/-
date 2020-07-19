import java.util.Scanner;

public class StringMain {

	public static void main(String[] args) {
		//사용자로부터 문자열을 입력받아서 반대로 출력하는 프로그램 어플리케이션
		// ex : Hello World -> dlroW olleH
		//한글자 한글자씩 쪼개서 바꿈
		
		Scanner sc = new Scanner(System.in);
		System.out.println("글자를 입력하세요");
		String str = sc.nextLine();		
		int length = str.length();
		
		
	    char [] charArray = new char[length];
	    
	    for (int i = 0; i < length; i++) {
			charArray[i] = str.charAt(i);
		}
	    
	    for (int i = length-1 ; i >= 0; i--) {
			System.out.print(charArray[i]);
		}
		
		
		
				
		
		
		
		/*Scanner sc = new Scanner(System.in);
		System.out.println("문자열을 입력해주세요 : ");
		String str = sc.nextLine();
		int len = str.length();
	    char [] oldChar = new char[len];
	    char [] newChar = new char[len];
	    
	    for (int i = 0; i < len; i++) {
			oldChar[i] = str.charAt(i);
		}
	    
	    for (int i = 0; i < len; i++) {
			newChar[len-1-i] = oldChar[i];
		}
	    
	    for (int i = 0; i < newChar.length; i++) {
			System.out.print(newChar[i]);
		}*/
		
		
		
		
		
	}

}
