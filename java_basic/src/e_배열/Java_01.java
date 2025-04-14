package e_배열;

public class Java_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a= new String[3];
		a[0] = "ddd";
		a[1] = "sss";
		a[2] = "www";
		
		for (int i= 0; i<a.length; i++) {
			System.out.println("a"+ "["+i+"] : " + a[i] );
		}
		
		String[] aa = {"fff","ggg","hhh"};
		int[] num = {15,13,78,56,456,65,45,88,65,44,52,
						542,755,15,138,745,462,765,45,45,78,55,
						6,7,87,84,95,21,45,65,87,49,94,54,324,
						456,78,321,45,48,78,45,21,35,48,21,32,
						48,46,13,78,45,86};	
		int total = 0;
		int count = 0;
		for (int i =0; i< num.length; i++) {
			total += num[i];
			if(num[i] > 50) {
				count++;
			}
		}
		
		System.out.println("num 총합 : " + total);
		System.out.println("50보다 큰수 : " + count +"개");
	}

}
