package sampleDemo1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		//login test scenarios
		//step1 open url
		WebDriver driver=new ChromeDriver();
		//step2: launch the url
		driver.get("https://www.saucedemo.com/v1/");
		Thread.sleep(3000);
	driver.manage().window().maximize();
		//step3:usernaname
	//WebElement username = driver.findElement(By.id("user-name"));
	//username.sendKeys("standard_user");
	
	//or
	driver.findElement(By.id("user-name")).sendKeys("standard_user");
	driver.findElement(By.id("password")).sendKeys("secret_sauce");
	driver.findElement(By.id("login-button")).click();
	//get the titel
	String titlename=driver.getTitle();
	System.out.println(titlename);
	
	//verify login sucessful or not
	;
		if(titlename.equals("Swag Labs")) {
			System.out.println("Login sucess");
		}
		
		else {
		System.out.println("Login not sucessfull");
		}
		
		
		
		//to close the application
		Thread.sleep(3000);
		driver.quit();
		
		
		
		
		
	}

}
