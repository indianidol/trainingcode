	package exceptions;



public class Exception_Handling{
	
	public static void main(String[] args) {

		
		System.out.println("A");
		try{
			System.out.println("A1");
			Login l=null;
			int i =8/0;
		//	l.name="A";
			// click on a button
		//	System.out.println("B1");
		}catch(Exception a){
			// report the error
			// take a screenshot
			System.out.println("error "+ a.getMessage());
			a.printStackTrace();
	}
		
	//	System.out.println("B");
		
		
		
		
	}

}
