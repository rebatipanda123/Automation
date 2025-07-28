package dataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new ChromeDriver();
    	//open swag url
    		driver.get(Constants.SWG_URL);
    		driver.manage().window().maximize();
    	//enter uid
    		driver.findElement(By.id("user-name")).clear();
    		
    		driver.findElement(By.id("user-name")).sendKeys(Constants.SWG_UID);
    	//enter pwd
    		driver.findElement(By.id("password")).clear();
    		
    		driver.findElement(By.id("password")).sendKeys(Constants.SWG_PWD);
    	//click login
    		driver.findElement(By.id("login-button")).click();
    		Thread.sleep(3000);
		
		
		
		
		

	}

}
