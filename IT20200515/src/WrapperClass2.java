
public class WrapperClass2 {

	public static void main(String[] args) {
		
		byte b = 3;
		int i = 257;
		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);
		System.out.println(b2);
		System.out.println(i2);
		
		byte b3 = b2.byteValue();
		int i3 = i2.intValue();
		System.out.println(b3);
		System.out.println(i3);
		
		String strNum = "10";
		int i4 = Integer.parseInt(strNum);
		System.out.println(i4);
		
		long l4 = Long.parseLong(strNum);
		Double d4 = Double.parseDouble(strNum);
		
		String birth = "1991-01-19";
		String str = birth.substring(0, 4);
		int year = Integer.parseInt(str);
		System.out.println(str);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*//기초 참조
		byte b = 3;
		int i = 257;
		Byte b2 = new Byte(b);
		Integer i2 = new Integer(i);
		System.out.println(b2);
		System.out.println(i2);
		
		//참조 기초
		
		byte b3 = b2.byteValue();
		int i3 = i2.intValue();
		System.out.println("b3 = "+b3);
		System.out.println("i3 = "+i3);
		
		String strNum = "10";
		int i4 = Integer.parseInt(strNum);
		System.out.println(i4);
		
		long l4 = Long.parseLong(strNum);
		double d4 = Double.parseDouble(strNum);
		
		String birth = "1991-01-19";
		String subStr = birth.substring(0, 4);
		int age = 2020-Integer.parseInt(subStr)-1;
		System.out.println(age);
		
		
		
		int a = 25;
		Integer ab = new Integer(50);
		System.out.println(a+ab);
		//오토언박싱*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
