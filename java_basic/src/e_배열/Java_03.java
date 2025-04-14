package e_배열;

import java.util.Scanner;

public class Java_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇개의 수?");
		int count = sc.nextInt();
		
		
		int[] arr = new int[count];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1) + "번째 숫자 입력");
			int num = sc.nextInt();
			arr[i] = num;
			
			System.out.println((i+1) + "번째 숫자 입력 완료!");
		}
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("arr[" + i+"] : " + arr[i] );
		}
	}

}
