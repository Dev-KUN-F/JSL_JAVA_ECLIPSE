package e_배열;

public class Java_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] info = {"김윤원", "60", "70", "80"};
		
		String[] score = new String[info.length + 1];
		
		int total = 0;
		
		for(int i = 0; i < info.length; i++) {
			score[i] = info[i];
			
			if(i>=1) {
			total += Integer.parseInt(score[i]);
			}
		}
		
		score[info.length] = Integer.toString(total);
		
		System.out.println("---------------------------------------------");
		
		for (int i = 0; i < score.length; i++) {
			System.out.print(score[i] + "\t");
		}
	}

}
