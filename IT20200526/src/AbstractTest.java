
public class AbstractTest {

	public static void doPrint(Person p) {
		if (p instanceof Student) {
			Student s = (Student)p;
			s.printInfo();
			s.study();
		}
	}
	
	
	public static void main(String[] args) {
		Person p = new Student("È«±æµ¿",28,"ÇÑ¾ç",90);
		doPrint(p);
		
		
		
	}

}
