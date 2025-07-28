package testNg2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

   /*
    * method1: verify ebay home page
    * step1  : launch browser and open ebaybapp
    * step2  : verify home page
    * step3  : close app
    * 
    * method2: verify ebay search textbox
    * step1  : launch browser and open ebaysite
    * step2  : verify ebay search textbox
    * step3  : close app
    * 
    * method3:search <SELENIUM BOOKS>and click search button
    * step1  :launch browser and open ebaysite
    * step2  :enter the text in search textbox
    * step3  :click search button
    * step4  :close app
    */

    

public class NewTest1 {
	WebDriver driver;
  @Test
  public void Verifyhomepage() {
	String title=driver.getTitle();
	 Assert.assertTrue(title.equalsIgnoreCase("Electronics, Cars, Fashion, Collectibles & More | eBay"));
	   
	  }
  @Test
  public void Verifysearchtextbox() {
	 WebElement search= driver.findElement(By.id("gh-ac"));
	 Assert.assertEquals(search.isDisplayed(), true);
	  
	  }
  @Test
  public void clicksearchtextbox() throws InterruptedException  {
	 WebElement search= driver.findElement(By.id("gh-ac"));
	  search.sendKeys("Selenium books");
	  Thread.sleep(3000);
	  driver.findElement(By.id("gh-ac")).click();
	  
	  }
  @BeforeMethod
  public void beforeMethod() {
	  driver=new ChromeDriver();
	  driver.get("https://www.ebay.com/");
	  driver.manage().window().maximize();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  driver.quit();
  }

}
