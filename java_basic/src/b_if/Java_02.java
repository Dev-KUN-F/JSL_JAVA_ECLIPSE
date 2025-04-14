package b_if;

import java.util.Scanner;

public class Java_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("남 , 여 ?"); //여자이면 만원 더줌
		
		String gender = sc.next();
		
		System.out.println("나이 ?"); // 나이가 30살 이상이면 만원더줌
		
		int age = sc.nextInt();
		
		int money = 50000;
		
		if (gender.equals("여")) {
			money += 10000;
		}
		
		if(age >= 30) {
			money += 10000;
		}
		
		System.out.println("용돈 : " + money + "원" );
		
	}

}
