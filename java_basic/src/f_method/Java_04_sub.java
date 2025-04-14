package f_method;

public class Java_04_sub {

	
	int getTotal( int[] score) {
		int total = 0;
		
		for (int i=0; i < score.length; i ++) {
			total += score[i];
		}
		
		return total;
	}
	
	double getAve( int[] score) {
		int total = getTotal(score);
		
		double ave = total / (double)score.length;
		
		return ave;
	}

	 String getResult(int[] score) {
		double ave = getAve(score);
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
