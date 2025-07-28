package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test1 {
	@Test
	public void Login() throws InterruptedException {
		
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
	
	

}
