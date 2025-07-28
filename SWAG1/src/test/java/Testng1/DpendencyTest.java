package Testng1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DpendencyTest {
	
	WebDriver driver;
  @Test(dependsOnMethods = "verifyEbaysite")
  public void search() {
	  
	driver.findElement(By.id("gh-ac")).sendKeys("Selenium Books");
	driver.findElement(By.id("gh-ac")).click();
	System.out.println("Search functionality executed");
  }	
	
@Test
public void verifyEbaysite() throws InterruptedException
{
   String url="https://www.ebay.com/";
	
	driver=new ChromeDriver();
	driver.get(url);
	Thread.sleep(3000);
	//WebElement ebayimage=driver.findElement(By.id("gh-logo"));
	//String txt=ebayimage.getText();
	String txt=driver.getTitle();
	System.out.println(txt);
	String exptitle="Electronics, Cars, Fashion, Collectibles & More | eBay";
     Assert.assertTrue(txt.equalsIgnoreCase(exptitle), "this test is failed");

}
		 
	
	
  }

