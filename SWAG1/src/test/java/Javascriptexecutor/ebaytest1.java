package Javascriptexecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ebaytest1 {
	WebDriver driver;
  @Test
  public void ebaytest() {
	  
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://ebay.com");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  //enetr the text into search textbox
	  //driver.findElement(By.id("gh-ac")).sendKeys("books");
	  
	  //using javascriptexecutor
	  JavascriptExecutor js =(JavascriptExecutor)driver;
	  
	 //js.executeScript("document.getElementById('gh-ac').value='Selenium books';");
	  
	//or
	 WebElement search=driver.findElement(By.id("gh-ac"));
	 js.executeScript("arguments[0].value='LG phone'",search);
	 
	  
	  
	  
	  
	  
  }
}
