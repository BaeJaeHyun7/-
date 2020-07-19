import java.util.InputMismatchException;

public class HumanMain {

	public static void main(String[] args) {
		
	
		HumanUI ui = new HumanUI();
		//1 tryCatch를 사용해서 예외처리 하는방법
		//ui.exec1();
		
		
		//2 Throws를 사용해서 예외처리 하는방법
		while(true) {
			try {
				ui.exec2();
				break;
			}catch (InputMismatchException e) {
				System.out.println("형식에 맞지 않는 입력입니다. 처음부터 다시 입력하세요.");
			}
		}
		
	}
}
