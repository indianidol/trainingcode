package basics;

public class examples extends parent{
	
	
	
	static int i = 20;
	
	public static void main(String[] args) {
		//whileexample();
		 int i = 70;
		
		 
		 examples myex = new examples();
		 System.out.println(myex.i);
	//	myex.whileexample();	 
		 System.out.println(i);
		 
		 
	/*	 parent parentinst = new parent();		 
		 System.out.println(parentinst.i);
		 */
		 parent exinst = new examples();
		 
		 System.out.println(exinst.i);
		
	}

	private static void whileexample() {
		boolean driving = true;
		int officedistance = 30;

		while (driving) {

			for (int i = 0; i <= 100; i++) {

				System.out.println("Driving miles " + i);
				if (i == officedistance) {
					System.out.println("Reached ofice ");
					driving = false;
					break;
				}
			}
			
			System.out.println(i); 
		}
	}
}
