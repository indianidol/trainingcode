package exceptions;

public class Exception_Stack {

	public static void main(String[] args) {
		clickLink();

	}

	public static void clickLink() {

		loadPage();
	}

	public static void loadPage() {

		try {
			// int i[]=new int[3];
			// i[3]=303;
			System.out.println("A");
			Thread.sleep(5000L);
			System.out.println("B");
			Thread.sleep(5000L);
			System.out.println("C");
			Thread.sleep(5000L);

			boolean serverisdown = true;
			System.out.println("Open Broewser");
			System.out.println("login to with valid user/ pass");
			if (serverisdown) {
				throw new Exception("Server 500 error");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}