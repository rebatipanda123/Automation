package captureScreenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		
	     double rnum=Math.random();//to generate random number
     	 System.out.println(rnum);
//convert double to string		
		String str1=String.valueOf(rnum);
		System.out.println(str1);
		
		
//print specified portion of a string
	//	String str2=(String)str1.subSequence(10, 18);
		String str2=str1.substring(10,18);
		System.out.println(str2);
		
		
//	convert double to int -typecating	
//         double rnum=10.2;
//		 int rnum1=(int)rnum;
//		 System.out.println(rnum1);
     	 
     	 
   	 
    	FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.com");
		Thread.sleep(3000);
//capture ss
	    File sfile=driver.getFullPageScreenshotAs(OutputType.FILE);
File dfile=new File("C:\\Users\\dell\\Downloads\\eclipse-java-2024-03-R-win32-x86_64\\SWAG1\\screenshot\\ebay"+str2+".png");
		
		sfile.renameTo(dfile);   
			
		
		
}

}
