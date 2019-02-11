package basics;
public class Planet extends space {

	String name;
	int moons;
	
	// Constructors
	// there no return type
	// name has to be same as class name
	// default constructor
	public Planet(){
		System.out.println("Only planet I know is earth");
	}
	// overloading
	public Planet(String name,int moons, int stars){
		//super();
		
		super(stars);
		this.name=name;
		this.moons=moons;
	}
	public void revolve() {
		
		System.out.println("this  planet can revolve anticlockwise");
		
	}
	public static void main(String[] args) {

		
		Planet mercurty = new Planet("mercury",0,2);		
		
		
mercurty.revolve();
		
	/*	System.out.println(mercurty.name);
		System.out.println("Moon "+mercurty.moons);*/
		/*Planet p4 = new Planet("Pluto",4,8);
		
		System.out.println(p4.name);
		System.out.println("Moon "+p4.moons);
		System.out.println("Stars "+p4.stars);

*/
		
		
		
		
	}

}
