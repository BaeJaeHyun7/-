//생성자 오버로딩
public class Human {

	private String name;
	private String sn;
	private int age;
	
	//이름이 같고 매개변수는 다르기때문에 기본생성자와 매개변수있는 생성자는 오버로딩 했다고 본다.
	//매개변수만 다르면 된다
	//생성자가 많으면 그때그때 상황에 따라서 사용할수있지만 무분별하게 만들필요는 없다
	//오버로딩은 생성자에서 많이 사용한다
	public Human() {
		
	}
	
	public Human(String name, String sn, int age) {
		super();
		this.name = name;
		this.sn = sn;
		this.age = age;
	}
	
	//게터와 세터제공
	
	
	
}
