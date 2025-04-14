package f_method;

public class Java_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Java_05_sub sub = new Java_05_sub();
		 String[] info = {"김윤원", "80" , "85" ,"75" ,"100"};
		 
		 String result = sub.getTotal(info);
		 
		 System.out.println(result);
		 
		 String[] member = sub.getArray("이상민" , "대전" , "35");
		 
		 for (int i = 0; i< member.length; i++) {
			 System.out.print(member[i] +"\t" );
		 }
	}

}
