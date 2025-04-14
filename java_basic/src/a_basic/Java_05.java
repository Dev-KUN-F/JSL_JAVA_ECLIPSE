package a_basic;

import java.util.Scanner;

public class Java_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("성명?");
		
		String name = sc.next();
		
		System.out.println("국어점수?");
		
		int kor = sc.nextInt();
		
		System.out.println("영어점수?");
		
		int eng = sc.nextInt();
		
		System.out.println("수학점수?");
		
		int mat = sc.nextInt();
		
		int total = kor + eng + mat;
		
		System.out.println(name + "님 총점 " + total + "점");
		
		
		
	}

}
