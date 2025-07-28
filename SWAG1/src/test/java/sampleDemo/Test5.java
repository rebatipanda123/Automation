package sampleDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver= new ChromeDriver();
		
		driver.get("https:\\www.saucedemo.com");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		driver.findElement(By.id("react-burger-menu-btn")).click();
		Thread.sleep(2000);
		//driver.findElement(By.id("logout_sidebar_link")).click();
		
		
		
		
		
		

	}

}
