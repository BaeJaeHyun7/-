
abstract class Person {

	String name;
	int age;
	String addr;
	
	
	public Person(String name, int age, String addr) {
		super();
		this.name = name;
		this.age = age;
		this.addr = addr;
	}
	
	public abstract void printInfo();
}
