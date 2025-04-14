package d_반복문;

public class Java_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int total = 0;
		
		for(int i = 0; i <10; i++) {
			
			if (i % 2 == 1) {
				System.out.println(i);
			}else {
				total += i;
			}
			
		}
		System.out.println("짝수합 : " +total);
	}

}
