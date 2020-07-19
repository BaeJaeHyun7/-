
public class MathTest {

	public static void main(String[] args) {
		//절대값
		int abs = Math.abs(-1);
		System.out.println(abs);
		
		//큰값찾기
		int max = Math.max(100, 50);
		System.out.println(max);
		
		//작은값찾기
		int min = Math.min(100, 50);
		System.out.println(min);
		
		//3개변수중 작은값 찾기
		int min2 = Math.min(Math.min(100, 50), 10);
		System.out.println(min2);
		
	    //올림
		double ceil = Math.ceil(10.1);
		System.out.println("ceil : "+ceil);
		
		//버림
		double floor = Math.floor(10.9);
		System.out.println("floor : "+floor);
		
		//반올림
		double round = Math.round(10.5);
		System.out.println("round : "+round);
		
	    
		
		
		
		
		
		
		
	}

}
