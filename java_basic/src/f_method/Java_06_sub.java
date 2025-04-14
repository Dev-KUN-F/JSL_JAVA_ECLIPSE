package f_method;

public class Java_06_sub {

	 int getPassCount(String[][] student) {
		 
		 
		int count = 0;
		for (int i = 0; i<student.length; i++) {
			int total = 0;
			for (int j = 1; j < student[i].length; j++) {
				total += Integer.parseInt(student[i][j]);
			}
			double ave = total / (double)(student[0].length - 1);
			
			if(ave >= 80) {
				count++; 
				
			}
		}
		
		return count;
	}

	int getPassCount(String name ,String[][] arr) {
		int count = 0;
		
		for (int i =0; i< arr.length; i++) {
			if(arr[i][0].indexOf(name) != -1) {
				count++;
			}
			
		}
		
		return count;
	}

}
