package fileandFolderOperations;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadFoldersforFiles {
	 static File folder;
	 static ArrayList<String> fileList;	 
	public static void main(String[] args) {
		 folder = new File("C:\\testDownload");
		listFilesForFolder(folder);
		
		System.out.println(fileList.size());
		
		String filename="";
		if(fileList.size()==1) {
			 filename= fileList.get(0);
			
			
		}
		
		System.out.println(filename);
		
	//	deleteMatchingFilesinFolder(fileList,"xml");
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		String baseUrl = "http://demo.guru99.com/test/upload/";
		WebDriver driver = new ChromeDriver();

		driver.get(baseUrl);
		WebElement uploadElement = driver.findElement(By.id("uploadfile_0"));

		// enter the file path onto the file-selection input field
		uploadElement.sendKeys(folder+"\\"+filename);
		
		
	}

	private static void deleteMatchingFilesinFolder(ArrayList<String> fileList, String matcher) {
		for(String s:fileList) {
			File myfile= new File(folder+"\\"+s);
			if(s.contains(matcher)){
			if(myfile.exists()) {
			
				myfile.delete();
			}
			}
		}
	}
	
	public static void listFilesForFolder(final File folder) {
		fileList = new ArrayList<>();
	    for (final File fileEntry : folder.listFiles()) {
	        if (fileEntry.isDirectory()) {
	            listFilesForFolder(fileEntry);
	        } else {
	        	String file=fileEntry.getName();
	        	fileList.add(file);
	        	System.out.println(file);
	        }
	    }
	}

	

}
