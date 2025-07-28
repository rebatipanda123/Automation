package sampleDemo1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		//back to original page
//		driver.navigate().to("https://google.com");
//		//moveback
//		driver.navigate().back();
//		//move forward
//		driver.navigate().forward();// move to the next page
//		//refresh the page
//		driver.navigate().refresh();
//		
//or
     Navigation move=driver.navigate();
		move.to("https://google.com");
		move.back();
		move.forward();
		move.refresh();
		
		
	}

}
