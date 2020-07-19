
public class InheritanceTest {

	public static void main(String[] args) {
		
		Truck truck = new Truck(6, 3, 11.5);
		/*System.out.println("트럭의 바퀴의 수는 : "+ truck.numberOfWheel+"개입니다");
		System.out.println("트럭의 최대 적재량은 : "+truck.maxLoad+"톤이다");
		truck.start();		
		truck.stop();
		
		//주소값 알려주는 메소드 ->자주사용하니깐 toString 안써도됨
		//toString메소드는 object클래스 안에있다.
		//출력을 할때에는 object클래스의 toString메소드*/
		System.out.println(truck);
		System.out.println(truck.toString());

	}

}
