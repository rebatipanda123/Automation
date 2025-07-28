package Testng1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.internal.annotations.BaseBeforeAfter;

public class Logintest1 extends BaseBeforeAfter{
	
	WebDriver driver;
  @Test
  public void Login() throws InterruptedException {
	  
	   driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")).sendKeys("standard_user");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
		Thread.sleep(4000);
  }
}
