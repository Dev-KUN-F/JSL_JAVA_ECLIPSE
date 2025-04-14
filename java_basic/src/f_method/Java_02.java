package f_method;

public class Java_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Java_02_sub sub = new Java_02_sub();
		int kor = 80;
		int eng = 90;
		
		String mat = "100";
		
		int total = sub.getTotal(kor,eng,mat);
		
		System.out.println("total : " +total);
		
		double ave = sub.getAve(total , 3);
		
		System.out.println("ave : " + ave);
		
		String result = sub.getResult(ave);
		
		System.out.println("grade : " + result);
	}

}
