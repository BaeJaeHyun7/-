
public class WrapperClass {

	public static void main(String[] args) {
		// ���� -->����
		byte b = 3;
		int i = 257;
		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);
		System.out.println(b2);
		System.out.println(i2);
		//����-->����
		byte b3 = b2.byteValue();
		int i3 = i2.intValue();
		System.out.println("b3 = "+b3);
		System.out.println("i3 = "+i3);
		
		String strNum = "10";//->"10"�� ���ڿ�
		int i4 = Integer.parseInt(strNum);
		System.out.println(i4);
		// i2.parseInt(strNum);--->��� �ȵȴ�
		
		//public static int parseInt(String s) {
			
		//}
		
		long l4 = Long.parseLong(strNum);
		double d4 = Double.parseDouble(strNum);
		
		String birth = "1991-01-19";
		String subStr = birth.substring(0, 4);
		int age = 2020-Integer.parseInt(subStr)-1;
		
		
		
		
		
		

	}

}
