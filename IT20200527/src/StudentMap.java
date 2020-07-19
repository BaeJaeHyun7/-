import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class StudentMap {

	public static void main(String[] args) {
		HashMap<String , Student> studentMap = new HashMap<String, Student>();
		studentMap.put("홍", new Student("홍길동", 90));
		studentMap.put("김", new Student("김개똥", 100));
		studentMap.put("김", new Student("김개똥", 80));
		studentMap.put("이", new Student("이말똥", 70));
		
		
		
		ArrayList<String> sList = new ArrayList<String>();
		sList.add("aaa");
		sList.add("bbb");
		sList.add("ccc");
		
		
		
		for (int i = 0; i < sList.size(); i++) {
			System.out.println(sList.get(i));
		}
		//for each문
		// : 기준으로 오른쪽은 반복을 시켜야 하는 대상
		// : 기준으로 왼쪽은 오른쪽의 데이터를 반복했을때 생성되는 데이터
		// 순서에 상관없이 처음부터 끝까지 반복하는 반복문
		for(String s : sList) {
			System.out.println(s);
		}
		
		
			
		//set은 중복을 허용하지 않는다.	
		Set<String> keys = studentMap.keySet();
		//향상된 for문 ->for each문 -> 시작하면 무조건 처음부터 끝까진 돈다. 몇개가 있는지 알필요가 없다.
		for (String s : keys) {
			System.out.println("이름 : "+studentMap.get(s).getName()+
					           "점수 : "+studentMap.get(s).getScore());
		}
		
		System.out.println(studentMap.get("홍").getName());
		
	}

}
