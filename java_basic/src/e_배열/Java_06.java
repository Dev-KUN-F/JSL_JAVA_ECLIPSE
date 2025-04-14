package e_배열;

import java.util.Scanner;

public class Java_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇과목입니까?");
		int count = sc.nextInt();
		
		String[] stu = new String[count + 1];
		
		for (int i = 0; i < stu.length; i++ ) {
			if (i == 0) {
				System.out.println("성함을 입력해주세요.");
				String name = sc.next();
				
				stu[i] = name;
			}else {
				System.out.println(i + "번째 과목의 점수를 입력해주세요.");
				String score = sc.next();
				
				stu[i] = score;
			}
		}
		
		System.out.println("------------------------");
		
		for (int i = 0; i < stu.length; i++ ) {
			
			System.out.print(stu[i] + "\t");
			
		}
		
		
	}

}
