package e_배열;

public class Java_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] info = {"김윤원", "60", "70", "80"};
		
		String[] score = new String[info.length + 3];
		
		int total = 0;
		
		for(int i = 0; i < info.length; i++) {
			score[i] = info[i];
			
			if(i>=1) {
			total += Integer.parseInt(score[i]);
			}
		}
		
		score[info.length] = Integer.toString(total);
		
		int count = info.length - 1;
		
		double ave = total / (double)count;
		score[info.length+1] = String.valueOf(ave);
		
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
		
		score[info.length +2] = grade;
		
		System.out.println("---------------------------------------------");
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + "\t");
		}
	}

}
