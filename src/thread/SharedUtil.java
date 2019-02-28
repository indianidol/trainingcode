package thread;

public class SharedUtil {
	//private Integer tableFor;
	
/*	public Integer getTableFor() {
		return tableFor;
	}

	public void setTableFor(Integer tableFor) {
		this.tableFor = tableFor;
	}

	public void printMultiplicationTable() {
		for (int i = 1; i < 11; i++) {
			System.out
					.println(Thread.currentThread().getName() + " : " + tableFor + " X " + i + " = " + (tableFor * i));
			try {
				Thread.sleep(2000l);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}*/
	
	
	private ThreadLocal<Integer> tableFor = new ThreadLocal<Integer>();

	public Integer getTableFor() {
		return tableFor.get();
	}

	public void setTableFor(Integer tableFor) {
		this.tableFor.set(tableFor);
		}

	public void printMultiplicationTable() {
		for (int i = 1; i < 11; i++) {
			System.out
					.println(Thread.currentThread().getName() + " : " + tableFor.get() + " X " + i + " = " + (tableFor.get() * i));
			try {
				Thread.sleep(2000l);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

}
