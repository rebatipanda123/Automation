package sampleDemo2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		//iteration 1
        //enter the username
//		driver.findElement(By.name("user-name")).sendKeys("hjkfre");
//		//enter the password
//		driver.findElement(By.name("password")).sendKeys("sdfggh");
//		//click the login button
//		driver.findElement(By.name("login-button")).click();
//		Thread.sleep(3000);
		//interation 2
		 //enter the username
		driver.findElement(By.name("user-name")).clear();	
		driver.findElement(By.name("user-name")).sendKeys("standard_user");
		//enter the password
        driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		//click the login button
		driver.findElement(By.name("login-button")).click();  
		
		//verify the text is visible or not in the products page
		 Thread.sleep(3000);
		String txtval= driver.findElement(By.className("title")).getText();
		 System.out.println(txtval);
		 boolean istrue=driver.findElement(By.className("title")).isDisplayed();
		 System.out.println(istrue);
		 if(istrue==true)
		 {
			 System.out.println("pass");
		 }
		 else
		 {
			 System.out.println("fail");
		 }
		 //or
		 //verify login is sucessful or not
//		 if(txtval.equals("products"))
//				 {
//			 System.out.println("login sucessful");
//				 }
//		
//		 else
//			 
//		 {
//			 System.out.println("login is not sucessful");
//		 }
//			 
//			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
