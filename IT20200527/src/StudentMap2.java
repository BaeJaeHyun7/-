import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class StudentMap2 {

	
	public static void main(String[] args) {
		HashMap<String, Student> studentMap = new HashMap<String, Student>();
		studentMap.put("È«", new Student("È«±æµ¿", 90));
		studentMap.put("±è", new Student("±è°³¶Ë", 100));
		studentMap.put("±è", new Student("±è°³¶Ë", 80));
		studentMap.put("ÀÌ", new Student("ÀÌ¸»¶Ë", 70));
		
		ArrayList<String> sList = new ArrayList<String>();
		sList.add("aaa");
		sList.add("bbb");
		sList.add("ccc");
		
		for (int i = 0; i < sList.size(); i++) {
			System.out.println(sList.get(i));
		}
		
		for(String s : sList) {
			System.out.println(s);
		}
		
		Set<String> keys = studentMap.keySet();
		for(String s : keys) {
			System.out.println("ÀÌ¸§ : "+studentMap.get(s).getName()+
					           "Á¡¼ö : "+studentMap.get(s).getScore());
						
		}
		System.out.println(studentMap.get("È«").getName());
		
		
		
		
		
	}
}
