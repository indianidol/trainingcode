package advance;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class filehandling {
	
	public static void main(String[] args) {
filehandling fh = new filehandling();
		
		
		fh.writefile();
		fh.readfile();		
		fh.readfilebufferedreader();	
	}
	
	
	
	public void writefile() {
		
		 try {
	            FileWriter writer = new FileWriter("MyFile.txt", true);
	            writer.write("This is new");
	            writer.write("\r\n");   // write new line
	            writer.write("Good Bye!");
	            writer.close();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
		
	}
	
	public void readfile() {
			 try {
		            FileReader reader = new FileReader("MyFile.txt");
		            int character;
		 
		            while ((character = reader.read()) != -1) {
		                System.out.print((char) character);
		            }
		            reader.close();
		 
		        } catch (IOException e) {
	            e.printStackTrace();
	        }
	}
	
	public void readfilebufferedreader() {
		  try {
	            FileReader reader = new FileReader("MyFile.txt");
	            BufferedReader bufferedReader = new BufferedReader(reader);
	 
	            String line;
	 
	            while ((line = bufferedReader.readLine()) != null) {
	                System.out.println(line);
	            }
	            reader.close();
	 
	        } catch (IOException e) {
	            e.printStackTrace();
	        }	
	}

}
