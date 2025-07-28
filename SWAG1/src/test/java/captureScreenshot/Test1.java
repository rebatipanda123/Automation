package captureScreenshot;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
// full page screenshot
//in firefox browser
		FirefoxDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://ebay.com");
		Thread.sleep(3000);
//capture ss
	    File sfile=driver.getFullPageScreenshotAs(OutputType.FILE);
		File dfile=new File("C:\\Users\\dell\\Downloads\\eclipse-java-2024-03-R-win32-x86_64\\SWAG1\\screenshot\\ebay.png");
		
		sfile.renameTo(dfile);
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
