package basics;


public class space implements universe{
	
	
private	int stars=5;
public int getStars() {
	return stars;
}
public void setStars(int stars) {
	this.stars = stars;
}


public int moon=2;


		public void revolve() {
			
			
		
		System.out.println("All planets in space can revolve clockwise");
		
	}
	public boolean hasphysicalpresence() {
		return false;
	
	}	
// non param const
	space(){
		
		System.out.println("This is space constructor");
	}
	
	//parameterized constructor
	 space(int numberofstars){
		stars=numberofstars;
	}
	 
	 
	 
	 
// 2+3 * 6 -1
	int addtwonumber(int a, int b){
		
		
		return a+b;
	}
	int multiply(int a, int b) {
		
		
		return a*b;
		
	}
	/*
	void donothig(){
		System.out.println("I do nothing");
		return 1;
	}*/
	
	int deduct(int a , int b) {
		
		return a-b;
	}
	
	
	public static void main(String[] args) {
		System.out.println("hello");
	//	space myspace = new space();
		
		
		space milkyway;
		milkyway= new space(50);
	//	System.out.println(milkyway.addtwonumber(2, 3));
//		milkyway.addtwonumber(2, 3);
		
//		
		int addresult = 	milkyway.addtwonumber(2, 3);
		
		int multiply = milkyway.multiply(addresult, 6);
		
		int result = milkyway.deduct(multiply, 1);
		
		System.out.println(result);
				
				
		
	
		
		
	
	
	
	}

}
