
public class StringTest2 {

	public static void main(String[] args) {
		
		String str = "900514-3XXXXXX";
		char charStr = str.charAt(7);
		System.out.println(charStr);
		
		String str2 = "Hello World!";
		int compareNum = str2.compareTo("hello world!");
		System.out.println(compareNum);
		
		String str3 = "Hello";
		String concatStr = str3.concat(" World!");
		System.out.println(concatStr);
		
		String str4 = "Hello Java";
		boolean containsCheck = str.contains("o");
		System.out.println(containsCheck);
		
		String str5 = "Hello World!";
		boolean equalStr = str5.equals("hello");
		System.out.println(equalStr);
		
		String str6 = "Hello World!";
		int idxNum = str6.indexOf("o");
		System.out.println(idxNum);
		
		
		String str7 = "Hello World!";
		int lastStr = str7.lastIndexOf("o");
		System.out.println(lastStr);
		 
		String str8 = "Hello World!";
		String subStr = str8.substring(2, 8);
		System.out.println(subStr);
		
		String str9 = "star.a.r.123.jpg";
		int point = str9.lastIndexOf(".");
        String jpg = str9.substring(point+1);
        System.out.println("jpg : "+jpg);
        
        String str10 = "Hello World!";
        int lengthStr = str10.length();
        System.out.println(lengthStr);
        
        String str11 = "Hello World";
        String rprStr = str11.replace("o", "Q");
        System.out.println(rprStr);
        
        String str12 = "오늘은 금요일이 아니다.";
        String[] splitStr = str12.split(" ");
        for (int i = 0; i < splitStr.length; i++) {
			System.out.println(splitStr[i]);
		}
        
        String str13 = "Hello World!";
        String lowerStr = str13.toLowerCase();
        String upperStr = str13.toUpperCase();
        System.out.println(lowerStr);
        System.out.println(upperStr);
        
        String str14 = "    Hello World!         ";
        String trimStr = str14.trim();
        System.out.println(trimStr);
        
        
        
        
        
        
        
        
}
}