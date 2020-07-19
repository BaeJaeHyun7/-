
public class OverloadingMain {
	
	public static void main(String[] args) {
		//1
		Calculator cal = new Calculator();
		int sum1 = cal.add(10, -50);
		double sum2 = cal.add(30.32, 1.46);
		System.out.println(sum1);
		System.out.println(sum2);
		
		//2
		Product[] pArr = new Product[3];  //배열안에 들어갈수 있는 자료형은?
		Product p1 = new Product();       //product , product를 상속받은 자식클래스
		p1.setName("사과");
		p1.setPrice(7000);
		
		Product p2 = new Product("배");
		Product p3 = new Product("귤", 5000);
		
		pArr[0] = p1;
		pArr[1] = p2;
		pArr[2] = p3;
		
		for(int i=0; i<pArr.length; i++) {
			System.out.println(pArr[i]); //pArr[i] -> product객체  원래는 주소값이 들어가야하는데 값이나옴 =>tostring으로 재정의해서
		}
		
	}
	
	//1.객체를 출력하면 주소값이 출력된다.
	//2. product클래스에서 toString메소드를 오버라이딩 했더니 멤버변수의 값이 출력됬다.
	//3.toString메소드는 Object클래스로부터 오버라이딩한 메소드다.
	//4.->Object의 toString메소드는 주소값을 출력한다.
	
}
