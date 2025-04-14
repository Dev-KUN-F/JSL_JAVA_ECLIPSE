package c_switch;

public class Java_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String month = "0";
		
		
		String season = "";
		
		switch(month) {
			case "3" : case "4" : case "5" :
				season = "봄";
				break;
			case "6" : case "7" : case "8" :
				season = "여름";
				break;
			case "9" : case "10" : case "11" :
				season = "가을";
				break;
				
			case "12" : case "1" : case "2" :
				season = "겨울";
				break;	
				
			default:
				season="없다";
		}
		
		System.out.println("계절 : " + season);
		
	}

}
