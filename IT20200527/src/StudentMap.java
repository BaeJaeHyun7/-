import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class StudentMap {

	public static void main(String[] args) {
		HashMap<String , Student> studentMap = new HashMap<String, Student>();
		studentMap.put("ȫ", new Student("ȫ�浿", 90));
		studentMap.put("��", new Student("�谳��", 100));
		studentMap.put("��", new Student("�谳��", 80));
		studentMap.put("��", new Student("�̸���", 70));
		
		
		
		ArrayList<String> sList = new ArrayList<String>();
		sList.add("aaa");
		sList.add("bbb");
		sList.add("ccc");
		
		
		
		for (int i = 0; i < sList.size(); i++) {
			System.out.println(sList.get(i));
		}
		//for each��
		// : �������� �������� �ݺ��� ���Ѿ� �ϴ� ���
		// : �������� ������ �������� �����͸� �ݺ������� �����Ǵ� ������
		// ������ ������� ó������ ������ �ݺ��ϴ� �ݺ���
		for(String s : sList) {
			System.out.println(s);
		}
		
		
			
		//set�� �ߺ��� ������� �ʴ´�.	
		Set<String> keys = studentMap.keySet();
		//���� for�� ->for each�� -> �����ϸ� ������ ó������ ������ ����. ��� �ִ��� ���ʿ䰡 ����.
		for (String s : keys) {
			System.out.println("�̸� : "+studentMap.get(s).getName()+
					           "���� : "+studentMap.get(s).getScore());
		}
		
		System.out.println(studentMap.get("ȫ").getName());
		
	}

}
