
public class A8 implements Printable, Showable {

	public static void main(String[] args) {
	A8 obj = new A8();
	obj.print();
	obj.show();
	}
	
	@Override
	public void show() {
		System.out.println("Welcome");
	}	

	@Override
	public void print() {
	System.out.println("Hello");
	}
	
	


		

	

}

