package f_method;

public class Java_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Java_01_sub sub = new Java_01_sub();
		
		int kor = 90;
		int eng = 80;
		
		sub.getTotal(kor, eng);
			
		String sum3 = sub.getSum3(10,"20", 30);
		
		System.out.println(sum3);
	
		
		int sum4 = sub.getSum4("10", "20", 50 );
		
		System.out.println(sum4);
		
		String tf = sub.getResult(sum4);
		
		System.out.println(tf);
	}

}
