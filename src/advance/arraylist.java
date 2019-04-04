package advance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class arraylist {
	static int duplicateCount=0;
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("USA"); // 0
		list.add("UK");// 1
		list.add("Australia");// 2
		list.add("Australia");// 2
		list.add("UK");// 1
		for(String s:list) {
		System.out.println(s);
		}
		duplicateCount=	countDuplicates(list);
		
		
	System.out.println("Duplicate Count " + duplicateCount);
	
	ArrayList<String> newlist= removeDuplicates(list);
	
	for(String s: newlist) {
		System.out.println(s);
	}
	
	
	
	}
		public static  ArrayList<String> removeDuplicates(ArrayList<String> list) 
	    { 
	  
	        // Create a new ArrayList 
	        ArrayList<String> newList = new ArrayList<String>(); 
	  
	        // Traverse through the first list 
	        for (String element : list) { 
	  
	            // If this element is not present in newList 
	            // then add it 
	            if (!newList.contains(element)) { 
	  
	                newList.add(element); 
	            } 
	        } 
	  
	        // return the new list 
	        return newList; 
	    } 

		public static int countDuplicates(ArrayList<String> list)
	    {
	        int duplicates = 0;
	         
	 
	        // TODO: Write the code to get the number of duplicates in the list
	         
	        for (int i = 0; i < list.size()-1;i++)
	        {
	            boolean found = false;
	             
	            for (int j = i+1; !found && j < list.size(); j++)
	            {
	                if (list.get(i).equals(list.get(j)))
	                {
	                found = true;
	                duplicates++;
	                }
	            }
	        }
	 
	        return duplicates;
	    }
}
