package b_if;

import java.util.Scanner;

public class Java_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//기본 생활비 500000
		//학생 = 기본 + 100000
		//주부 = 기본 + 300000
		//회사원 = 기본 + 400000
		
		// 출력 학생 : 600000
		Scanner sc = new Scanner(System.in);
		
		System.out.println("직업은? 학생 or 주부 or 회사원중 택일");
		
		String job = sc.next();
		
		int basic = 500000;
		
		if (job.equals("학생") || job.equals("주부") || job.equals("회사원")) {
			
			if (job.equals("학생")) {
				basic += 100000;
			}else if(job.equals("주부")) {
				basic += 300000;
			}else {
				basic += 400000;
			}
			
			System.out.println(job + " : " + basic);
		}else {
			System.out.println("직업 입력 오류!");
		}
		
	}

}
