package f_method;

import java.util.Scanner;

public class Java_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java_03_sub sub = new Java_03_sub();
		Scanner sc = new Scanner(System.in);
		// 기본 30000
		// 남자: +10000
		// 여자: +20000
		// 25살 이상 : +10000
		
		// 학년?
		// 점수?
		// 1~3학년 60점 이상 "합격"
		// 4~6학년 80점 이상 "합격"
		
		// 출력 : 결과 : 합격 / 불합격
		
		
//		System.out.println("성별?  남,여");
//		String gender = sc.next();
//		System.out.println("나이?");
//		int age = sc.nextInt();
//		
//		
//		int money = sub.getMoney(gender, age);
//		System.out.println("용돈 : "+ money + "원");
		
		
		
		System.out.println("학년? 1~6");
		int stu = sc.nextInt();
		
		System.out.println("점수?");
		int score = sc.nextInt();
		
		String result = sub.getResult(stu, score);
		
		System.out.println("결과 : " + result);
	}

}
