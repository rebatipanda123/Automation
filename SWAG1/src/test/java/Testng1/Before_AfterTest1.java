package Testng1;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Before_AfterTest1 {
    WebDriver driver;
  @BeforeTest
  public void Launchwebsitet() {
	
	   driver=new ChromeDriver();
	  driver.get("http://saucedemo.com");
	  driver.manage().window().maximize();
	  	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }
  @Test(priority = 2)
   public void login() throws InterruptedException
   {
	   driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")).sendKeys("standard_user");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
		Thread.sleep(4000); 
   }
  @Test(priority = 1)
  public void verifyhomepage()
  {
	  
	  
	  Assert.assertTrue(driver.getTitle().equals("Swag Labs"), "test fail...");
  }
    
}
