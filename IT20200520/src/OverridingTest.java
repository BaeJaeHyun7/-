
public class OverridingTest {

	public static void main(String[] args) {
		
		OverridingTest t = new OverridingTest();
		Student student = new Student();
		t.method(student); //�޼ҵ� ����
		
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
			Student s = ((Student) p); // ��ü����ȯ
			System.out.println(s.who);
		}else {
			System.out.println("I don't know");
		}*/
		
		//�̷��� �ϴ����� --> �޼ҵ带 ������ �ȸ��� ��
	}
	
	public void method2(Teacher t) {
		System.out.println(t.who);
		
	}
}
