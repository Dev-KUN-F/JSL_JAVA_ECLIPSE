package d_반복문;

import java.util.Scanner;

public class Java_05_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int s_total = 0;
		int d_total = 0;
		
		while(true) {
			System.out.println("수입력?");
			int num = sc.nextInt();
			
			if (num == 0 )break;
			
			if(num % 2 == 0) {
				d_total += num;
			}else {
				s_total += num;
			}
			
			
		}
		
		System.out.println("종료!");
		System.out.println("짝수 합계 : " + d_total);
		System.out.println("홀수 합계 : " + s_total);

	}

}
