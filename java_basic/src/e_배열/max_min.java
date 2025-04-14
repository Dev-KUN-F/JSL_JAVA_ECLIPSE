package e_배열;

public class max_min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {85, 92, 78, 95, 88};
		
		int big = scores[0];
		
		int small = scores[0];
		
		for(int i = 1; i < scores.length; i++ ) {
			if(big < scores[i]) {
				big = scores[i];
			}
		}
		
		
		for(int i = 1; i < scores.length; i++ ) {
			if(small > scores[i]) {
				small = scores[i];
			}
		}
		System.out.println("최대값 : " + big);
		System.out.println("최소값 : " + small);
	}

}
