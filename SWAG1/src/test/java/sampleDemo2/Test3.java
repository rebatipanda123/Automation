package sampleDemo2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.onlinesbi.sbi/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		List<WebElement> lst=driver.findElements(By.tagName("a"));
		//size
		System.out.println(lst.size());
		//to get the href links values
		for(WebElement i:lst)
		{
			System.out.println(i.getAttribute("href"));
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
