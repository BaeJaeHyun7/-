import java.util.ArrayList;

public class StudentList {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();//값을 넣을때 student만 넣을수 있다.
		
		
		
		Student s1 = new Student("홍길동", 90);
		Student s2 = new Student("김개똥", 80);
		Student s3 = new Student("이말똥", 100);
		
		//리스트에서 데이터를 저장할때,매개변수를 전달하는 형태로 저장한다(메소드)
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
		
		
		//향상된 for문 - for each문
		for(Student s : studentList) {
			System.out.println(s.getName()+ s.getScore());
		}

		
	
	
	
	
	
	
	boolean check = studentList.isEmpty();
	System.out.println(check);
	studentList.remove(1);
	
	//리스트에서 출력 구문
			for (int i = 0; i < studentList.size(); i++) {
				System.out.println("이름 : "+studentList.get(i).getName()+
						            "점수 : "+studentList.get(i).getScore()+"점");
			}		
	
	
	studentList.clear();
	boolean check2 = studentList.isEmpty();
	System.out.println(check2);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*Student s = new Student("홍길동",90);
			//studentList.add(s);   요 두줄이 밑의 줄과 같음	
			studentList.add(new Student("홍길동",90)); //객체만들고 . 메소드 실행, 데이터를 저장하는 기능
			studentList.add(new Student("김개똥",80)); 
			studentList.add(new Student("이말똥",100)); */

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
