package d_반복문;

import java.util.Scanner;



public class Java_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇단부터?");
		int start = sc.nextInt();
		
		System.out.println("몇단까지?");
		int end = sc.nextInt();
		
		for (int i = start; i <= end; i++) {
			System.out.println(i + "단-------------");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
			System.out.println("");
		}
	}

}
