package ����2;

import java.util.Random;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
	
		Random r = new Random();
		Scanner sc = new Scanner(System.in);
		
		int comNum = r.nextInt(50)+1;
		
		System.out.println("�õ� Ƚ�� �Է� : ");
		int inputNum = sc.nextInt();
		int arr[] = new int[inputNum];
		int count = 0;
		
		while(true) {
			System.out.println("1~50 �� ���� �Է�("+(count+1)+"��° �õ�) : ");
			int people = sc.nextInt();
			arr[count] = people;
			
			if (comNum>people) {
				System.out.println("up");
			}else if (comNum<people) {
				System.out.println("down");
			}else {
				System.out.println("����!");
				System.out.println("�õ� Ƚ�� : "+(count+1));
				System.out.println("--�Է��� �� ���--");
				for (int i = 0; i <= count; i++) {
					System.out.println(arr[i]);
				}
				break;
			}
			count++;
			
			if (count>=inputNum) {
				System.out.println("�õ� Ƚ�� �ʰ�!");
				break;
			}
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
	
		
		
		
		
		
		
		
		

	}

}
