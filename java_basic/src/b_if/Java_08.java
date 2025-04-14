package b_if;

import java.util.Scanner;

public class Java_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Q1. 직업 : 학생 :1, 주부:2, 회사원:3 ?
		//Q2. 월납입액 ?
		//Q3. 몇년 ?
		
		// 이자 : 학생 : 20%, 주부 : 10%, 회사원 : 5%
		// 출력 : 만기금액 : 1500000
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("직업 ? 학생:1, 주부:2, 회사원:3");
		int job = sc.nextInt();
		
		if(job == 1 || job ==2 ||job == 3) {
			System.out.println("월납입액?");
			int pay = sc.nextInt();
			
			System.out.println("몇년?");
			int year = (sc.nextInt()) * 12;
			
			int total = pay  *  year;
			
			double result = 0;
			
			if(job == 1) {
				result = total * 1.2;
			}else if (job == 2) {
				result = total * 1.1;
			} else {
				result = total * 1.05;
			}
			
			System.out.println("만기금액 : " + (int)result);
		}else {
			System.out.println("직업입력 오류!");
		}
	}

}
