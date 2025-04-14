package f_method;

public class Java_05_sub {
	 

	String getTotal(String[] info) {
		int total = 0;
		
		for (int i =1; i< info.length; i++) {
			total += Integer.parseInt(info[i]);
		}
		
		String result = info[0] + "님 총점 : " + total+"점";
		return result;
		
	}

	String[] getArray(String string, String string2, String string3) {
		// TODO Auto-generated method stub
		
		String[] result = {string, string2, string3};
		
		return result;
	}
	 
}
