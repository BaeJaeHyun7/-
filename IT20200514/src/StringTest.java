
public class StringTest {

	public static void main(String[] args) {
		
		//String�� java.lang�� �ִ� Ŭ����, �޼ҵ� ������ �Ѵ�.(�θ� ���̴ϱ�)
		
		
		//������ġ ã���ִ°�(char�� ��ȯ)
		String str = "900514-3XXXXXX";
		
		//���鵵 ���ڿ��� ���	
		
		char c = str.charAt(7);
		
		if (c == '1' || c == '3') {
			System.out.println("����");
		}
		else if (c == '2' || c == '4') {
			System.out.println("����");
		}
		//������ġ ���ڷ� Ȯ��(���ڿ��� ���� ��)
		String str2 = "Aab";
		int compareNum = str2.compareTo("AAA");
		
		System.out.println(compareNum);
		
		//���ڿ��� �ٿ��ִ� �۾�
		
		String str3 = "Hello";
		String concatStr = str3.concat("java");
		String concatStr2 = str3 + "java";
	    System.out.println(concatStr);	
	    
	    //���ڿ��� ���� ���ϴ� �ܾ �ִ����� Ȯ�����ִ� �޼ҵ�
	    String str4 = "Hello Java";
	    boolean containsCheck = str4.contains("b");
		System.out.println(containsCheck);
		
		//���ڿ��� �Ű����� ���� ������ Ȯ��
		String str5 = "Java";
		boolean equalsCheck = str5.equals("Java");
		System.out.println(equalsCheck);
		
		
		//���ڿ��� �ּ��� ��ġ�� �տ������� ã�Ƽ� ���ڷ�(�ε���)��ȣ�� ��Ÿ���°�
		String str6 = "Hello World!";
		int indexofNum = str6.indexOf("l");
		System.out.println(indexofNum);
		
		//���ڿ��� �ּ��� ��ġ�� �ڿ������� ã�Ƽ� ���ڷ�(�ε���)��ȣ�� ��Ÿ���°�
		String str7 = "Hello World!";
		int lastIndexOfNum = str7.lastIndexOf("o");
		System.out.println(lastIndexOfNum);
		
		//���ڿ� ��ġ�� �ִ°��� �߶󳻱� ���(���������� �ε��� ���� ������) =====>�����߿�(���̾��ϱ�)
		
		String str8 = "Hello World!";
		String subStr = str8.substring(2, 8);
		System.out.println(subStr);
		
		//����ڰ� ���ϸ��� �Է��Ѵٰ� ������
		//������� �׸������̶�� �ϸ� star.jpg, aaa.jpeg, bbbb.png
		//������ ccc.avi,ddd.mkv
		//����ڰ� �Է��� ������ Ȯ����(.��� ���� ������ ����)�� �����Ҽ� �ְԵȴ�.
		//jpg�� ©�󳾶�
		String str9 = "star.a.r.123.jpg";
		int extNum = str9.lastIndexOf(".");
		String fileName = str9.substring(0, extNum);
		String ext = str9.substring(extNum+1);
		System.out.println("���� ���� : "+fileName);
		System.out.println("Ȯ���ڴ� : "+ext);
		
		//���ڿ��� ���̸� ��ȯ�ϴ� �޼ҵ�
		String str10 = "Hello World!";
		int lengthStr = str10.length();
		System.out.println("���ڿ��� ���̴� : "+lengthStr);
		
		int[] arr = new int[10];
		//���⼭ ������ �Ӽ�
		int lengthArr = arr.length;
		
		//�ش繮�ڿ��ȿ� �����ܾ �ߺ��ɰ�� ���ܾ ġȯ�Ѵ�.
		String str11 = "Hello World!";
		String replaceStr = str11.replace('l', 'L');
		System.out.println("���ڿ� ġȯ�ϱ� : "+replaceStr);
		
		String str12 = "������ �ݿ��� ġŲ�� ���Ѹ���";
		//��ĭ�� ���� --> ���鵵 ���ڿ�, �迭�� ����
		String[] splitArr = str12.split(" ");
		
		for (int i = 0; i < splitArr.length; i++) {
			System.out.println(splitArr[i]);			
		}
		
		//� Ư���� ��Ȳ���� ��/�ҹ��ڸ� �������� �ʰ� ���ڸ� �Ǵ��ؾ� �Ҷ�
        //Ư�� �˻��Ҷ� ���� ���ȴ�.
		//Java String : �˻��� java string, JAVA STRING, JaVa StrINg		
		String str13 = "Hello World!";
		String lowerStr = str13.toLowerCase();
		String upperStr = str13.toUpperCase();
		
		System.out.println("�ҹ��� ��ȯ : "+lowerStr);
		System.out.println("�빮�� ��ȯ : "+upperStr);
		
		//
		
		String str14 = "             Hello World!               ";
		String trimStr = str14.trim();
		System.out.println("�糡 �������� : "+trimStr);
		
		
		
		
	}

}
