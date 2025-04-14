package f_method;

public class Java_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java_04_sub sub = new Java_04_sub();
		int[] score = {10, 20 ,30};
		
		int total = sub.getTotal(score);
		
		double ave = sub.getAve(score);
		
		String result = sub.getResult(score);
		
		System.out.println("total : " + total);
		System.out.println("ave : " + ave);
		System.out.println("result : " + result);
	}

}
