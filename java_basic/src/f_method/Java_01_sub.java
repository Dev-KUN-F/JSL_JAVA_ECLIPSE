package f_method;

public class Java_01_sub {

	int getTotal(int kor, int eng){
		int total = kor + eng;
		return total;
	}
	
	String getSum3(int num1, String num2, int num3) {
		int total = num1 + Integer.parseInt(num2) + num3;
		
		
		
		return Integer.toString(total);
	}
	
	int getSum4(String num1, String num2, int num3) {
		int total = Integer.parseInt(num1) + Integer.parseInt(num2) + num3;
		
		
		
		return total;
	}
	
	String getResult( int score) {
		String result = "불합격";
		
		if(score >= 80) {
			result = "합격";
		}
		
		
		
		return result;
	}

}
