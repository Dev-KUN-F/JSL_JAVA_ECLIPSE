package b_if;
import java.util.Scanner;

public class Java_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수?");
		int kor = sc.nextInt();
		
		System.out.println("영어 점수?");
		String eng = sc.next();

		System.out.println("수학 점수?");
		int mat = sc.nextInt();
		
		int eng2 = Integer.parseInt(eng);
		
		int total = kor + eng2 + mat ;
		
		double ave = total / 3.0;
		
		String result = "F";
		
		if(total > 300 || total < 0) {
			System.out.println("점수 입력 오류!");
		}else {
			if (ave >= 90) {
			result = "A";
			}else if (ave >= 80) {
			result = "B";
			}else if (ave >= 70) {
			result ="C";	
			}
			
			System.out.println("총점 : " + total);
			System.out.println("평균 : " + ave);
			System.out.println("결과 : " + result);
		}
		
		
		
		
		
	}

}
