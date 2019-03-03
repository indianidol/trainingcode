package basics;

import java.util.Arrays;
import java.util.Iterator;

public class test {
	
	public static void main(String[] args) {
		
		String file=",Loop to update the estimated cost of all crop products,loop,1,0,0,number::$$datacount,,,,,,";
				//",store sa user credntials,storeVar,1,0,0,varName1::sa_username|varValue1::sa@granular.ag|varName2::sa_password|varValue2::Granular1,,,,,,";
		 //String ty = file.substring(0, file.indexOf(".csv"));
		System.out.println(file.substring(file.indexOf("number::") + 8).replace(",", ""));
	//	System.out.println(file.split(",")[6].substring(10));
//		System.out.println(file.substring(file.indexOf("number::") + 8).startsWith("$$"));
		  String[] tcSplit = file.split(",", -1);
		  for(int i=0; i<tcSplit.length;i++) {
		 //System.out.println(tcSplit[i]);
		  }
	/*	 Iterator<String> tcStk = Arrays.stream(tcSplit).iterator();
		    if (tcStk.hasNext()) {
		      String tcid = (String)tcStk.next();
		      
		      System.out.println(tcid);
		  }
		    
		    if (tcStk.hasNext()) {
			      String tcid = (String)tcStk.next();
			      
			      System.out.println(tcid);
			  }
		    if (tcStk.hasNext()) {
			      String tcid = (String)tcStk.next();
			      
			      System.out.println(tcid);
			  }
		    if (tcStk.hasNext()) {
			      String tcid = (String)tcStk.next();
			      
			      System.out.println(tcid);
			  }*/
	}

}
