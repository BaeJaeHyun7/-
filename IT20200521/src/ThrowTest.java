
public class ThrowTest {

	public static void main(String[] args) {
		
		try {
			summary();
		} catch (Exception e) {
			e.printStackTrace();
			//어떤, 어디서 예외가 발생했는지 알려주는 코드
		}

	}
	
	public static int divide(int n ,int m) throws Exception {
		return n/m;
	}
	
	public static void summary() throws Exception {

		try {
			System.out.println("계산결과 : "+divide(10,0));
		} catch (Exception e) {
			throw new Exception("비밀번호 5회틀림");
			//강제로 예외발생(에러는 아니지만 강제로 에러를 발생시켜야 하는 상황)
		}
}
}