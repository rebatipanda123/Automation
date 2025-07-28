package sampleDemo;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Test2 {

	public static void main(String[] args) throws InterruptedException {
	//step1	
	//open the browser in(edge)	
		EdgeDriver driver = new EdgeDriver();
    //step2
     driver.get("https://www.saucedemo.com/");
     //step3
     driver.manage().window().maximize();
     //step4
     Thread.sleep(5000);
     //step5
     driver.findElement(By.id("user-name")).sendKeys("standard_user");
     //step6
     driver.findElement(By.id("password")).sendKeys("secret_sauce");
     
     //step7
     driver.findElement(By.id("login-button")).click();
   //step
     Thread.sleep(5000);
     //step8
     //driver.close();
     

     
     
     
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
