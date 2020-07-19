
public class Vehicle {
	
	int numberOfWheel;  //바퀴의 수
	int numberOfSeat; //좌석의 수
	double weight; //차량의 무게
	
	public Vehicle() {
		super();//숨어있는 구문 Object();
		System.out.println("Vehicle 생성자 호출");
	}
	//차량을 출발시키는 기능
	public void start() {
		System.out.println("Vehicle 출발기능");
		
	} 
	//차량을 정지시키는 기능
	public void stop() {
	 System.out.println("트럭의 정지기능");	
	} 

}
