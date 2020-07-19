import java.util.ArrayList;

public class StudentList2 {
	
	public static void main(String[] args) {
		
		ArrayList<Student>studentList = new ArrayList<Student>();
		
		Student s1 = new Student("È«±æµ¿", 90);
		Student s2 = new Student("±è°³¶Ë", 80);
		Student s3 = new Student("ÀÌ¸»¶Ë", 100);
		
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
		for(Student s : studentList)
		System.out.println(s.getName());
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	

}
