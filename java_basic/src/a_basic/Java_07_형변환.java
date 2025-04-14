package a_basic;

public class Java_07_형변환 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 85 ; //85.0
		double a_result = (double)a;
		
		System.out.println("a_result : " + a_result);
		
		int total = 125;
		int count = 2;
		
		
		
		double ave = total / (double)count ;
		
		System.out.println("ave : " + ave);
		
		// double -> int
		
		double d = 85.8885;
		
		int d_result = (int)d;
		
		System.out.println("d_result : " + d_result);
		
		// int -> string
		
		int i = 85;
		String i_result = Integer.toString(i);
		
		System.out.println("i_result : " + (i_result + 100) );
		
		// string -> int
		
		String s = "100";

		int s_result = Integer.parseInt(s);
		
		
		
		System.out.println("s_result : " + (s_result +100));
		
	
	}

}
