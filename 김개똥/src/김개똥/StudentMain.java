package �谳��;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class StudentMain {

	public static void main(String[] args) {
		
	HashMap<Integer, StudentList> student = new HashMap<Integer, StudentList>();
	
	student.put(1, new StudentList("�谳��", 90));
	
	Set<Integer> keys = student.keySet();
	
	for(Integer i : keys) {
		System.out.println(student.get(i));
	}
		
		
		
		
		
	
}
}