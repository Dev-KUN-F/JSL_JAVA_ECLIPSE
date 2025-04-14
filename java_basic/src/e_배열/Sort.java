package e_배열;

public class Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = {85, 92, 78, 95, 88};
		
		int num = 0;
		
		
		
		for(int i = 0; i < scores.length; i++ ) {
			for(int j = i + 1; j < scores.length; j++) {
				if(scores[i] < scores[j]) {
					num = scores[i];
					scores[i] = scores[j];
					scores[j] = num;
				}
			}
		}
		System.out.println("내림차순 정렬");
		
		for(int i = 0; i < scores.length; i++ ) {
			System.out.print(scores[i] + "\t");
		} 
		
		
		
		
	
		
	
	}

}
