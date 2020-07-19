public class CountTest {

	public static void main(String[] args) {
		Count c1 = new Count();
		Count c2 = new Count();
		Count c3 = new Count();
		
		System.out.println("c1.serialNumber : "+c1.serialNumber);
		System.out.println("c2.serialNumber : "+c2.serialNumber);
		System.out.println("c3.serialNumber : "+c3.serialNumber);
		
		//Static 선언된 클래스 변수는 클래스의 이름으로 접근 가능하다.
		System.out.println("Count.counter : " + Count.counter);
		
		//멤버변수처럼 객체의 이름으로도 접근이 가능하다.
		System.out.println("c2.counter : "+c2.counter);

	}

}
