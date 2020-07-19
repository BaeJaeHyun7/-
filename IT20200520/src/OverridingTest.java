
public class OverridingTest {

	public static void main(String[] args) {
		
		OverridingTest t = new OverridingTest();
		Student student = new Student();
		t.method(student); //메소드 실행
		
		Teacher teacher = new Teacher();
		t.method(teacher);
}
	
	public void method(Person p) {
		
		if (p instanceof Student) {
			Student s = ((Student)p);
			System.out.println(s.who);
		}else {
			Teacher t = ((Teacher)p);
			System.out.println(t.who);
		}
				
		
		/*if (p instanceof Student) {
			Student s = ((Student) p); // 객체형변환
			System.out.println(s.who);
		}else {
			System.out.println("I don't know");
		}*/
		
		//이렇게 하는이유 --> 메소드를 여러개 안만들어도 됨
	}
	
	public void method2(Teacher t) {
		System.out.println(t.who);
		
	}
}
