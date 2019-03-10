package advance;

public class testm {
	public static void main(String[] args) {
		testmethod();
	}
	public static void testmethod() {
		String name = new Object(){}.getClass().getEnclosingMethod().getName();
		System.out.println("Running test "+ name);
		
	}

}
