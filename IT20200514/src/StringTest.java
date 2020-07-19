
public class StringTest {

	public static void main(String[] args) {
		
		//String은 java.lang에 있는 클래스, 메소드 역할을 한다.(널리 쓰이니깐)
		
		
		//숫자위치 찾아주는것(char를 반환)
		String str = "900514-3XXXXXX";
		
		//공백도 문자열로 취급	
		
		char c = str.charAt(7);
		
		if (c == '1' || c == '3') {
			System.out.println("남자");
		}
		else if (c == '2' || c == '4') {
			System.out.println("여자");
		}
		//숫자위치 숫자로 확인(문자열의 값을 비교)
		String str2 = "Aab";
		int compareNum = str2.compareTo("AAA");
		
		System.out.println(compareNum);
		
		//문자열을 붙여주는 작업
		
		String str3 = "Hello";
		String concatStr = str3.concat("java");
		String concatStr2 = str3 + "java";
	    System.out.println(concatStr);	
	    
	    //문자열에 내가 원하는 단어가 있는지를 확인해주는 메소드
	    String str4 = "Hello Java";
	    boolean containsCheck = str4.contains("b");
		System.out.println(containsCheck);
		
		//문자열과 매개변수 값이 같은지 확인
		String str5 = "Java";
		boolean equalsCheck = str5.equals("Java");
		System.out.println(equalsCheck);
		
		
		//문자열의 주소의 위치를 앞에서부터 찾아서 숫자로(인덱스)번호로 나타내는것
		String str6 = "Hello World!";
		int indexofNum = str6.indexOf("l");
		System.out.println(indexofNum);
		
		//문자열의 주소의 위치를 뒤에서부터 찾아서 숫자로(인덱스)번호로 나타내는것
		String str7 = "Hello World!";
		int lastIndexOfNum = str7.lastIndexOf("o");
		System.out.println(lastIndexOfNum);
		
		//문자열 위치에 있는것을 잘라내기 기능(마지막꺼는 인덱스 포함 전까지) =====>존나중요(많이쓰니깐)
		
		String str8 = "Hello World!";
		String subStr = str8.substring(2, 8);
		System.out.println(subStr);
		
		//사용자가 파일명을 입력한다고 했을때
		//예를들어 그림파일이라고 하면 star.jpg, aaa.jpeg, bbbb.png
		//동영상 ccc.avi,ddd.mkv
		//사용자가 입력한 파일의 확장자(.찍고 나온 파일의 형태)를 구분할수 있게된다.
		//jpg만 짤라낼때
		String str9 = "star.a.r.123.jpg";
		int extNum = str9.lastIndexOf(".");
		String fileName = str9.substring(0, extNum);
		String ext = str9.substring(extNum+1);
		System.out.println("파일 명은 : "+fileName);
		System.out.println("확장자는 : "+ext);
		
		//문자열의 길이를 반환하는 메소드
		String str10 = "Hello World!";
		int lengthStr = str10.length();
		System.out.println("문자열의 길이는 : "+lengthStr);
		
		int[] arr = new int[10];
		//여기서 렝스는 속성
		int lengthArr = arr.length;
		
		//해당문자열안에 여러단어가 중복될경우 모든단어를 치환한다.
		String str11 = "Hello World!";
		String replaceStr = str11.replace('l', 'L');
		System.out.println("문자열 치환하기 : "+replaceStr);
		
		String str12 = "오늘은 금요일 치킨을 시켜먹자";
		//한칸의 공백 --> 공백도 문자열, 배열로 리턴
		String[] splitArr = str12.split(" ");
		
		for (int i = 0; i < splitArr.length; i++) {
			System.out.println(splitArr[i]);			
		}
		
		//어떤 특수한 상황에서 대/소문자를 구별하지 않고 문자를 판단해야 할때
        //특히 검색할때 자주 사용된다.
		//Java String : 검색어 java string, JAVA STRING, JaVa StrINg		
		String str13 = "Hello World!";
		String lowerStr = str13.toLowerCase();
		String upperStr = str13.toUpperCase();
		
		System.out.println("소문자 변환 : "+lowerStr);
		System.out.println("대문자 변환 : "+upperStr);
		
		//
		
		String str14 = "             Hello World!               ";
		String trimStr = str14.trim();
		System.out.println("양끝 공백제거 : "+trimStr);
		
		
		
		
	}

}
