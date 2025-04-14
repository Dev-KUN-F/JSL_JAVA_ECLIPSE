package e_배열;

import java.util.Scanner;

public class Java_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name  = {"이상민", "박만수", "이찬우", "김성식", "김지우", 
						  "김인수", "안상수", "이미옥", "백현수", "이찬우", 
						  "허상수", "김이우", "김미순", "허정우", "임민수", 
						  "윤석민", "안태정", "최순실", "송민수", "강유현", 
						  "강민기", "신강식", "허준용", "김형수", "안강현"};
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("검색어 입력");
		String search = sc.next();
		int count = 0;
		
//		for (int i = 0; i < name.length; i++ ) {
//			int sr = name[i].indexOf(search);
//			
//			if(sr != -1) {
//				count++;
//				System.out.println(name[i]);
//				
//			}
//		}
//		
//		System.out.println("검색결과 이름일치 : " + count + "명");
		
	}

}
