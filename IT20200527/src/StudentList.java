import java.util.ArrayList;

public class StudentList {

	public static void main(String[] args) {
		ArrayList<Student> studentList = new ArrayList<Student>();//���� ������ student�� ������ �ִ�.
		
		
		
		Student s1 = new Student("ȫ�浿", 90);
		Student s2 = new Student("�谳��", 80);
		Student s3 = new Student("�̸���", 100);
		
		//����Ʈ���� �����͸� �����Ҷ�,�Ű������� �����ϴ� ���·� �����Ѵ�(�޼ҵ�)
		studentList.add(s1);
		studentList.add(s2);
		studentList.add(s3);
		
		
		
		//���� for�� - for each��
		for(Student s : studentList) {
			System.out.println(s.getName()+ s.getScore());
		}

		
	
	
	
	
	
	
	boolean check = studentList.isEmpty();
	System.out.println(check);
	studentList.remove(1);
	
	//����Ʈ���� ��� ����
			for (int i = 0; i < studentList.size(); i++) {
				System.out.println("�̸� : "+studentList.get(i).getName()+
						            "���� : "+studentList.get(i).getScore()+"��");
			}		
	
	
	studentList.clear();
	boolean check2 = studentList.isEmpty();
	System.out.println(check2);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*Student s = new Student("ȫ�浿",90);
			//studentList.add(s);   �� ������ ���� �ٰ� ����	
			studentList.add(new Student("ȫ�浿",90)); //��ü����� . �޼ҵ� ����, �����͸� �����ϴ� ���
			studentList.add(new Student("�谳��",80)); 
			studentList.add(new Student("�̸���",100)); */

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
