package b_if;

import java.util.Scanner;

public class Java_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇 월 입니까?");
		String month = sc.next();
		
		int numMonth = Integer.parseInt(month);
		
		if (numMonth <= 12 && numMonth >= 0 ) {
			String result = "겨울";
			
			if(numMonth >= 3 && numMonth <= 5) {
				result = "봄";
			}else if (numMonth >= 6 && numMonth <= 8) {
				result = "여름";
			}else if (numMonth >= 9 && numMonth <= 11) {
				result = "가을";
			}
			
			System.out.println("계절 : " + result);
		}else {
			System.out.println("입력 오류!");
		}
	}

}
