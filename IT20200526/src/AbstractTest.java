
public class AbstractTest {

	public static void doPrint(Person p) {
		if (p instanceof Student) {
			Student s = (Student)p;
			s.printInfo();
			s.study();
		}
	}
	
	
	public static void main(String[] args) {
		Person p = new Student("ȫ�浿",28,"�Ѿ�",90);
		doPrint(p);
		
		
		
	}

}
