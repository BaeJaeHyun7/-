
public class Truck extends Vehicle {

	double maxLoad; //최대 적재량
	
	public Truck(int w, int s, double max) {
		
		super(); // 생성자에만 숨어있는 슈퍼구문(부모를 뜻함) -> Vehicle의 생성자(Vehicle();)
		//상속과 관계없이 항상 숨어있는 구문
		//부모클래스를 찾는거다
		//super는 부모 super();는 생성자
		//생성자는 객체를 만드는 과정이다
		System.out.println("Truck 생성자 호출");
		numberOfWheel = w;
		numberOfSeat = s;
		maxLoad = max;
	}
	//화물을 짐칸에 싣는 기능
	public void load() {
		
		
	}
	//Vehicle(부모)의 start메소드를 Truck이 오버라이딩해서 재정의 한 기능
	  @Override
	//어노테이션(골뱅이는 annotation라고 부른다) : 오버라이드 어노테이션
	public void start() {
		System.out.println("트럭의 출발기능");
		
	} 
	 
	
	
}
