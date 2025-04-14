package b_if;

import java.util.Scanner;

public class Java_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성별? 남:1, 여:2");
		String gender = sc.next();
		
		//체력지수 ?
		// 남자 지수 75 이상 정상 
		// 여자 지수 65 이상 정상 
		// 출력 남자 정상 / 비정상
		//    여자 정상 / 비정상
		
		
		
		if (gender.equals("1") || gender.equals("2")) {	
			System.out.println("체력지수?");
			int score = sc.nextInt();
			String gender2 = "여자";
			
			String result = "비정상";
			
			if(gender.equals("1")) {
				gender2 = "남자";
				
				if(score >= 75) {
					result = "정상";
				}
			}else {
				if(score >= 65) {
					result = "정상";
				}
			}
			
			System.out.println( gender2+ " " + result);
			
		}else {
			System.out.println("성별입력 오류!");
		}
	}

}
