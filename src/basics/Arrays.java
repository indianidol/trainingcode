package basics;

public class Arrays {

	public static void main(String[] args) {

		/*
		 * int arr[] = { 1, 2, 3 }; for (int i = 0; i < arr.length; i++) {
		 * System.out.println(arr[i]); }
		 */

		int twod[][] = { { 1, 2, 3 }, 
				{ 2, 3, 4 }, 
				{ 5, 6, 8 },
				{ 6, 6, 9 }};
		
		
		System.out.println(twod.length);
		for(int j=0;j<twod.length;j++) {
			for(int k=0;k<twod[j].length;k++) {
			System.out.print(twod[j][k] +" , ");
			}
			System.out.println("");
			
			
			
		}
		
	}

}
