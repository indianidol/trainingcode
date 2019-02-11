package basics;

public class functionOverLoading {
	
	
	
	public static void main(String[] args) {
	
		
		functionOverLoading myinstance = new functionOverLoading();
	
		
		myinstance.addsomenumbers(1,2,3,4);
		
	}
	
	
	public void addsomenumbers(int a, int b, int c) {
		int d= a+b+c;
		
		System.out.println("total is "+ d);
		//System.out.println("total is "+ a+b+c);
		
	}

	
/*	public int addsomenumbers(int a, int b, int c) {
		int d= a+b+c;
		
		System.out.println("total is "+ d);
		//System.out.println("total is "+ a+b+c);
		return d;
		
	}
	*/
	public void addsomenumbers(int a, int b, int c, int z) {
		int d= a+b+c+z;
		
		System.out.println("total is "+ d);
		//System.out.println("total is "+ a+b+c);
		
	}
	
	public int  addsomenumbers(int a, int b, int c, String x) {
		int d= a+b+c;
		
		System.out.println("total is "+ d);
		//System.out.println("total is "+ a+b+c);
		return d;
		
	}
}
