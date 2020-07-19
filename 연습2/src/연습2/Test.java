package 연습2;

import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int comNum = r.nextInt(50)+1;
		
		System.out.println("시도 횟수 입력 : ");
		int inputNum = sc.nextInt();
		int arr[] = new int[inputNum];
		int count = 0;
		
		while(true) {
			System.out.println("1~50 의 수를 입력("+(count+1)+"번째 시도) : ");
			int people = sc.nextInt();
			arr[count] = people;
			
			if (comNum>people) {
				System.out.println("up");
			}else if (comNum<people) {
				System.out.println("down");
			}else {
				System.out.println("정답!");
				System.out.println("시도 횟수 : "+(count+1));
				System.out.println("--입력한 수 목록--");
				for (int i = 0; i <= count; i++) {
					System.out.println(arr[i]);
				}
				break;
			}
			count++;
			
			if (count>=inputNum) {
				System.out.println("시도 횟수 초과!");
				break;
			}
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		

	}

}
