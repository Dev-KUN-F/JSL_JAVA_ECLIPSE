package b_if;

import java.util.Scanner;

public class Java_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1학년 ~3학년 60점 이상 합격
		// 4학년 ~6학년 80점 이상 합격
		// 출력 : "3학년 65점 합격/불합격"
		// 학년 입력 오류
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 학년 ?");
		
		
		int grade = sc.nextInt();
		
		if(grade >= 1  && grade <= 6) {
			
			System.out.println("몇점?");
			int score = sc.nextInt();
			
			String result = "불합격";
			
			if(grade >= 3) {
				if(score >= 80) {
					result = "합격";
				}
			}else {
				if (score >= 60) {
					result = "합격";
				}
			}
			
			System.out.println(grade + "학년 " + score + "점 " +result);
		}else {
			System.out.println("학년입력 오류");
		}
		
		
	}

}
