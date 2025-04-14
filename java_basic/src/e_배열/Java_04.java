package e_배열;

import java.util.Scanner;

public class Java_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("몇명?");
		int count = sc.nextInt();
		String[] stu = new String[count];  
		
		for (int i = 0; i< stu.length; i++) {
			System.out.println((i+1) + "번째 학생 이름?");
			String name = sc.next();
			
			stu[i] = name;
		}
		
		for (int i = 0; i< stu.length; i++) {
			System.out.println((i + 1 ) + "번째 학생 : " + stu[i]);
		}
		
		
		int j = 0;
		do {
			System.out.println("작업 선택? 검색:1, 종료:0");
			j = sc.nextInt();
			
			if(j == 1 ) {
				System.out.println("검색어 입력?");
				String search = sc.next();
				
				for (int i = 0; i< stu.length; i++) {
					int  se = stu[i].indexOf(search);
					
					if(se != -1) {
						System.out.println("일치하는 결과 : " + stu[i] );
					}
				
				}
				
			}
			
			
		}while(j != 0);
	}

}
