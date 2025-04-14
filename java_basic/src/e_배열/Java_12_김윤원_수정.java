package e_배열;

import java.util.Scanner;

public class Java_12_김윤원_수정 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=====김윤원=====");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Q1. 몇명?");
		int people = sc.nextInt();
		
		System.out.println("Q2. 몇과목?");
		int num = sc.nextInt();
		
		String[] setup = new String[num + 3]; 
		
		for(int i = 0; i < setup.length; i++) {
			if(i == 0 ) {
				setup[i] = "성명";
				
			}else if (i > 0 && i < setup.length - 2) {
				System.out.println(i + "번째 과목명을 입력해주세요.");
				setup[i] = sc.next();
			}else if (i == setup.length - 2) {
				setup[i] = "총점";
			}else {
				setup[i] = "평균";
			}
			
		}
		
		
		
		
		String[][] scores = new String[people][num + 3];
		
		for (int i = 0; i < scores.length; i++ ) {
			int total = 0;
			double ave = 0;
			
			for (int j = 0; j < scores[i].length; j++ ) {
				if (j == 0) {
					System.out.println(i+1+"번째 분의 성함을 입력해주세요.");
					scores[i][j] = sc.next();
					
				}else if (j > 0 && j < scores[i].length - 2) {
					System.out.println(setup[j]+ " 점수는?");
					scores[i][j] = sc.next();
					total += Integer.parseInt(scores[i][j]);
				}else if (j == scores[i].length - 2) {
					scores[i][j] = Integer.toString(total);
				}else if (j == scores[i].length -1){
					ave = total / (double)num;
					
					scores[i][j] = String.valueOf(ave);
				}
			}
			
			
		}
		
		System.out.println("==============================================================");
		for(int i = 0; i < setup.length; i++) {
			System.out.print(setup[i] + "\t");
		}
		System.out.println("");
		
		System.out.println("--------------------------------------------------------------");
		
		
		for(int i = 0; i < scores.length; i++) {
			for(int j = 0; j < scores[i].length; j++) {
				System.out.print(scores[i][j] +"\t");
			}
			System.out.println("");
		}
		System.out.println("--------------------------------------------------------------");
		
	}

}
