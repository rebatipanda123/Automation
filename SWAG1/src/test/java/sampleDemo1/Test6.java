package sampleDemo1;

import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.onlinesbi.sbi/");
		Thread.sleep(3000);
	driver.findElement(By.linkText("RBI Retail Direct portal")).click();
	Thread.sleep(3000);
//	driver.findElement(By.linkText("Doorstep Banking")).click();
	driver.findElement(By.linkText("Block ATM Card")).click();
	//get window ids
	Set<String> winIds =driver.getWindowHandles();
	
	for(String id:winIds) {
		driver.switchTo().window(id); // it is used to switchto the windows
		System.out.println("Window ID ::" + id);
		System.out.println("Title::" +driver.getTitle());
	    String title=driver.getTitle();
	   // Thread.sleep(3000);
		/*
		//close the all the windows except:Doorstep Banking (window)
		if(title.equals("RBI Retail Direct portal"));
		{
		driver.close();
		
		}
		*/
//		if(title.equals("RBI Retail Direct portal")||title.equals("State Bank of India"))
//				{
//			driver.close();
//				}
		// close all windows except:Block ATM Card
   if(!title.equals("RBI Retail Direct portal"))
	    {
	    	driver.close();
	    	
    }
		// close the window associated to the browser (quit browser)
   driver.quit();

		
		}
	

	}

}
