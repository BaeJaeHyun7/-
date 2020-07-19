
public class A4 implements Printable {
	
	@Override
	public void print() {
		System.out.println("Hello");
	}

	public static void main(String[] args) {
		A4 a4 = new A4();
		a4.print();

	}

}
