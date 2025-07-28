package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Test4 {

	@Test(priority = 1)
	public void startup() 
	{
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.quit();		
	}
	
	
	@Test(priority = 3)
	public void login() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input")).sendKeys("standard_user");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[2]/input")).sendKeys("secret_sauce");
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input")).click();
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		driver.quit();		
	}
	
	@Test(priority = 2)
	public void verifyhomepage() throws InterruptedException
	{
		WebDriver driver=new ChromeDriver();	
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		
// to verify title
		Assert.assertTrue(driver.getTitle().equals("Swag Labs"), "test fail..");
		
		
		driver.quit();		
	}
	
	
	
	
	
	
	
}
