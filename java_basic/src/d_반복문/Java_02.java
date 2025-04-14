package d_반복문;

import java.util.Scanner;

public class Java_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇단?");
		int basic = sc.nextInt();
		int result = 0;
		
		for (int i = 1; i < 10; i++) {
			result = basic * i;
			
			System.out.println(basic + " * " + i +" = " + result);
		}
	}

}
