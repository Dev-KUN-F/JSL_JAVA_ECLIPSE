package e_배열;

public class Java_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[][] student ={
				{"홍길동","90","85","75","90","",""},
				{"이상진","80","95","95","80","",""},
				{"안문숙","70","80","80","95","",""},
				{"김은경","95","75","75","95","",""},
				{"오수신","80","95","95","80","",""},
				{"김상구","70","80","80","95","",""},
				{"하윤지","80","95","95","80","",""},
				{"박상식","70","85","80","95","",""},
				{"이주영","95","60","75","95","",""},
				{"이윤오","95","55","75","95","",""},
				{"박태정","90","95","80","85","",""},
				{"이유진","80","90","90","95","",""},
				{"안병철","70","85","75","80","",""},
				{"김종식","95","70","80","75","",""},
				{"황종현","80","95","90","95","",""},
				{"이창진","70","80","75","80","",""},
				{"이윤숙","80","90","90","95","",""},
				{"배창식","70","85","75","85","",""},
				{"허윤호","95","75","80","60","",""},
				{"박흥민","95","70","80","55","",""}
			};	
		
		System.out.println("============================================");
		System.out.println("성명\t국어\t영어\t수학\t과학\t총점");
		System.out.println("--------------------------------------------");
		
		
		
		for(int i = 0; i < student.length; i++) {
			int total = 0;
			double ave = 0;
			
			for(int j = 0; j < student[i].length; j++) {
				if(j > 0 && j < student[i].length - 2) {
					int score = Integer.parseInt(student[i][j]);
					total += score;
					
				}else if (j == student[i].length - 2) {
					student[i][j] = Integer.toString(total);
				}else if (j == student[i].length -1) {
					ave = total / (double)(student[i].length-3);
					
					student[i][j] = String.valueOf(ave);
				}
				
			}
			
		}
		
		for(int i = 0; i < student.length; i++) {
			for(int j = 0; j < student[i].length; j++) {
				System.out.print(student[i][j] +"\t");
			}
			System.out.println("");
		}
		System.out.println("--------------------------------------------");
	}

}
