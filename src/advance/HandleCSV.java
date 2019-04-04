package advance;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

import com.opencsv.CSVReader;

public class HandleCSV {
	
	public static void main(String[] args) throws IOException {
		
		
		
		//	FileInputStream fs = new FileInputStream(System.getProperty("user.dir")+"//resources//data.csv");
		
	
		BufferedReader  reader = Files.newBufferedReader(Paths.get(System.getProperty("user.dir")+"//resources//data.csv"));
	//	System.out.println(reader.lines());
		String sCurrentLine;
		String [] line;
		while ((sCurrentLine = reader.readLine()) != null) {
			//System.out.println(sCurrentLine);
			line=sCurrentLine.split(",");
			for(String s:line) {
				System.out.print(s+"  ");
			}
			System.out.println("");
			
			
		}

		          /*  CSVReader csvReader = new CSVReader(reader);
		            String[] nextRecord;
		         
		            while ((nextRecord = csvReader.readNext()) != null) {
		            	 //System.out.println(nextRecord);
		            	 for(String s:nextRecord) {
		            		System.out.println(s); 
		            	 }
		            	
		            	
		            }*/
			
		
			
	}

}
