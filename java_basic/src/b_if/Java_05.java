package b_if;

import java.util.Scanner;

public class Java_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("평균?");
		double ave = sc.nextDouble();
		
		if(ave >= 0 && ave <= 100) {
			String result = "F";
			
			if (ave >= 90) {
				result = "A";
			}else if (ave >= 80) {
				result = "B";
			}else if (ave >= 70) {
				result = "C";
			}
			
			System.out.println("결과 : " + result + " 등 급");
		}else {
			System.out.println("성적 입력 오류!");
		}
	}

}
