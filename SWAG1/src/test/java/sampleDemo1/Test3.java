package sampleDemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		
		
//		SBI APP LAUNCH DETAILS
//
//		url-https://www.onlinesbi.sbi/
//		click on some link - Block ATM Card//		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.onlinesbi.sbi/");
		driver.manage().window().maximize();
		// to locate the block atm card(locator name is linkedtext
		//driver.findElement(By.linkText("Block ATM Card")).click();
		driver.findElement(By.partialLinkText("Block")).click();
		//close window
		Thread.sleep(3000);
		//close the window
		driver.close();
		//close the application
		driver.quit();
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
