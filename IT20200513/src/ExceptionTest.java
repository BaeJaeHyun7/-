
public class ExceptionTest {

	public static void main(String[] args) {
		
		
		
		
		
		try {
			
			int a = 10, b = 0;
			System.out.println("시작");
			System.out.println(a/b);
			System.out.println("끝");
			
		} catch (Exception e) {
			System.out.println("정수를 입력하시오");
		}
		
			
				
		
		
		
		
		/*try {
		int a = 10, b = 0;
		System.out.println("시작");
		System.out.println(a/b);
		System.out.println("끝");
		}
		
		catch(ArithmeticException e) {
			System.out.println("예외 캐치 : "+e.getMessage());
		
	}*/

}
}