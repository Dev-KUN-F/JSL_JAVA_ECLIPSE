package a_basic;

import java.util.Scanner;

public class Java_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성명?");
		
		String name = sc.next();
		
		System.out.println("총점?");
		
		int total = sc.nextInt();
		
		System.out.println("몇과목?");
		
		double count = sc.nextDouble();
		
		double ave = total / count ;
		
		System.out.println(name + "님 평균 "  + ave +"점");

	}

}
