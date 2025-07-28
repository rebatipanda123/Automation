package sampleDemo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) throws Exception {
		WebDriver driver=new ChromeDriver();
 //get window handle
		driver.get("https://www.onlinesbi.sbi/");
		Thread.sleep(3000);
		//display the window id
		String winID=driver.getWindowHandle();
		System.out.println("Window ID is ::" + winID);
		//display the page title
		String pgtitle=driver.getTitle();
		System.out.println("SBI page Title::" + pgtitle);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
