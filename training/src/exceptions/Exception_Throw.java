package exceptions;

public class Exception_Throw {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		exceptiontest();
		
		
	}

	private static void exceptiontest() throws Exception  {
		boolean serverisdown = true;
		
		try {
			
			System.out.println("Open Broewser");
			System.out.println("login to with valid user/ pass");
			if(serverisdown) {
			throw new Exception("Server 500 error");
			
			
			}else {
				System.out.println("Login is success");
				
				System.out.println("Logout");
			}
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw e;
			
		}finally {
			System.out.println("Close the broesr");
		}
	}

}
