package d_반복문;

import java.util.Scanner;

public class Java_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇개의 수?");
		int count = sc.nextInt();
		
		int total = 0;
		
		for (int i = 1; i <= count; i++) {
			System.out.println( i +"번째 수 입력");
			int num = sc.nextInt();
			
			if(num == -1) break;
			total += num;
		}
		
		System.out.println("총 "+ count +"개의 수 총합 : " + total);
	}

}
