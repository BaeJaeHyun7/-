import java.util.ArrayList;

public class StudentList3 {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		Student s1 = new Student("ȫ�浿", 90);
		Student s2 = new Student("�谳��", 80);
		Student s3 = new Student("�̸���", 100);
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
		for(Student s : studentList) {
			System.out.println(s.getName()+s.getScore());
		}
		
		boolean check = studentList.isEmpty();
        System.out.println(check);
        studentList.remove(1);
        
        for(Student sq : studentList)
        System.out.println(sq.getName());
        
        studentList.clear();
        boolean check2 = studentList.isEmpty();
        System.out.println(check2);
	}
	


}
