import java.util.InputMismatchException;

public class HumanMain {

	public static void main(String[] args) {
		
	
		HumanUI ui = new HumanUI();
		//1 tryCatch�� ����ؼ� ����ó�� �ϴ¹��
		//ui.exec1();
		
		
		//2 Throws�� ����ؼ� ����ó�� �ϴ¹��
		while(true) {
			try {
				ui.exec2();
				break;
			}catch (InputMismatchException e) {
				System.out.println("���Ŀ� ���� �ʴ� �Է��Դϴ�. ó������ �ٽ� �Է��ϼ���.");
			}
		}
		
	}
}
