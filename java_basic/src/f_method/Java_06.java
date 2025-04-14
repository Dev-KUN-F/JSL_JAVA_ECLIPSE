package f_method;

import java.util.Scanner;

public class Java_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java_06_sub sub = new Java_06_sub();
		Scanner sc = new Scanner(System.in);
		
		String[][] student ={
				{"홍길동","90","85","75","90"},
				{"이상진","80","95","95","80"},
				{"안문숙","70","80","80","95"},
				{"김은경","95","75","75","95"},
				{"오수신","80","95","95","80"},
				{"김상구","70","80","80","95"},
				{"하윤지","80","95","95","80"},
				{"박상식","70","85","80","95"},
				{"이주영","95","60","75","95"},
				{"이윤오","95","55","75","95"},
				{"박태정","90","95","80","85"},
				{"이유진","80","90","90","95"},
				{"안병철","70","85","75","80"},
				{"김종식","95","70","80","75"},
				{"황종현","80","95","90","95"},
				{"이창진","70","80","75","80"},
				{"이윤숙","80","90","90","95"},
				{"배창식","70","85","75","85"},
				{"허윤호","95","75","80","60"},
				{"박흥민","95","70","80","55"}
			};
		
		int passCount = sub.getPassCount(student);
		
		System.out.println("합격자 : " + passCount + "명" );
		
		
		System.out.println("검색 성명?");
		String name = sc.next();
		
		int searchCount = sub.getPassCount(name, student);
		
		System.out.println(name+" 포함 이름 :" + searchCount + "명");
		
	}

}
