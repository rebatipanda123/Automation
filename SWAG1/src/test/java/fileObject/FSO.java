package fileObject;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FSO {
  @Test
  public void fso() throws IOException {
	  
	  
	File fso=new File("C:\\Users\\dell\\Documents\\selenium\\some text\\test1.txt");  
//	if(fso.exists())
//	{
//		System.out.println("File exist");
//	}
//	else {
//		System.out.println("Filenot exit");
//			fso.createNewFile();
//	}	
//	
//	FileWriter wfile=new FileWriter(fso);
//	wfile.write("This is a sample text");
//	wfile.close();
	
	//read the data from file
	if(fso.exists())
	{
		System.out.println("file exist");
		Scanner sc=new Scanner(fso);
		while(sc.hasNextLine())
		{
		String line	=sc.nextLine();
		System.out.println(line);
		 String [] str =  line.split("##");
		String uid=str[0];
		String pwd=str[1];
		
		//launch browser
		WebDriver driver=new ChromeDriver();
	    //open url
		
		//login:uid,pwd
		
		//logout
		//close
		
		
		
		
		
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
 }
  
  
}
