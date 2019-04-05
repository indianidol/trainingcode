package thread;

public class TestThreads {
	
	public static void main(String[] args) {
		
	
	final SharedUtil util = new SharedUtil();
	
	Thread t1 = new Thread(()->{		util.setTableFor(3);		util.printMultiplicationTable();	});
	t1.setName("Thread 1 : ");
		
	Thread t2 = new Thread(()->{		util.setTableFor(5);		util.printMultiplicationTable();     });
	t2.setName("Thread 2 : ");
	
	t1.start();
	
	
	t2.start();
	
	}
}
