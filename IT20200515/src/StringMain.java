import java.util.Scanner;

public class StringMain {

	public static void main(String[] args) {
		//����ڷκ��� ���ڿ��� �Է¹޾Ƽ� �ݴ�� ����ϴ� ���α׷� ���ø����̼�
		// ex : Hello World -> dlroW olleH
		//�ѱ��� �ѱ��ھ� �ɰ��� �ٲ�
		
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �Է��ϼ���");
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
		System.out.println("���ڿ��� �Է����ּ��� : ");
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
