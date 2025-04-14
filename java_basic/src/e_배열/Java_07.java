package e_배열;

import java.util.Scanner;

public class Java_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇과목 인가요?");
		int count = sc.nextInt();
		
		String[] stu = new String[count +3];
		
		int total = 0;
		double ave = 0;
		
		for (int i = 0; i < stu.length; i++) {
			if(i == 0 ) {
				System.out.println("성함을 입력해주세요.");
				stu[i] = sc.next();
				
				
			}else if (i == count +1) {
				stu[i] = Integer.toString(total);
			}else if (i == count +2) {
				ave = total / (double)count;
				stu[i] = String.valueOf(ave);
			}else {
				System.out.println(i + "번째 과목의 점수를 입력해주세요.");
				int score = sc.nextInt();
				
				total += score;
				
				stu[i] = Integer.toString(score);
			}
		}
		
		System.out.println("-----------------------------------------------");
		
		for (int i = 0; i < stu.length; i++) {
			System.out.print(stu[i] + "\t");
		}
	}

}
