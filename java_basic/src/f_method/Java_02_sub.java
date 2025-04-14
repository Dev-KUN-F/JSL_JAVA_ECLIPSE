package f_method;

public class Java_02_sub {
	
	int getTotal(int score1 , int score2, String score3){
		
		int total = score1 + score2 + Integer.parseInt(score3);
		return total;
	}
	
	double getAve(int total , int count) {
		double ave = total / (double)count;
		return ave;
	}
	
	String getResult(double ave) {
		String grade = "F";
		
		if(ave >= 90) {
			grade = "A";
		}else if(ave >= 80) {
			grade = "B";
		}else if(ave >= 70) {
			grade = "C";
		}else if(ave >= 60) {
			grade = "D";
		}
		return grade;
	}
}
