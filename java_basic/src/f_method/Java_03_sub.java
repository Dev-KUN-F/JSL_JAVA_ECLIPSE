package f_method;

public class Java_03_sub {

	
	int getMoney(String gender, int age) {
		int money = 30000;
		
		if (gender.equals("남")) {
			money += 10000;
		}else if(gender.equals("여")) {
			money += 20000;
		}
		
		if (age >= 25) {
			money += 10000;
		}
		
		
		return money;
	}
	
	String getResult(int stu, int score) {
		String result = "불합격";
		
		if(stu > 0 && stu < 7 ) {
			if(stu >= 1 && stu <= 3) {
				if(score >=60) {
					result = "합격";
				}
			}else {
				if(score >= 80) {
					result ="합격";
				}
			}
		}else {
			result ="잘못된 입력입니다.";
		}
		
		
		return result;
	}
}
