package captureScreenshot;
import java.io.File;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Test2 {

	public static void main(String[] args) throws InterruptedException {
		
		Calendar cd=Calendar.getInstance();
		Date dt=cd.getTime();
		System.out.println(dt);
		
//to remove spaces/gaps  in Fri Nov 15 18:44:51 IST 2024

		String dt1=dt.toString();
		String dt2=dt1.replace(" ", "");
		System.out.println(dt2);
		String dt3=dt2.replace(":", "");
		System.out.println(dt3);
		
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.com");

		//ebay image
		WebElement img1=driver.findElement(By.id("gh-logo"));
		File sfile=img1.getScreenshotAs(OutputType.FILE);
		//File dfile=new File("C:\\Users\\dell\\Downloads\\eclipse-java-2024-03-R-win32-x86_64\\SWAG1\\screenshot\\img1.png");
	//or
		File dfile=new File(System.getProperty("user.dir")+"\\screenshot\\img"+dt3+".png");
		sfile.renameTo(dfile);
		

	//or
	//	org.openqa.selenium.io.FileHandler.copy(sfile, dfile);
		
		
		
		
		
		
		
		
		
		
		
	}

}