package sampleDemo;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// driver object methods.
		
		//step1: open the browser.
		
		ChromeDriver driver=new ChromeDriver();

		
		//step2: launched the website // open specified url
		
		//driver.get("https://www.google.com");
		// url:https://www.saucedemo.com/
		
		// get (url): it is used to launch the specificed url in a window.
		
		
	    driver.get("https://www.saucedemo.com/");
	    //step3
	    // to maximize the window.
	     driver.manage().window().maximize();
	     
	     Thread.sleep(5000); 
	// username
	     driver.findElement(By.id("user-name")).sendKeys("standard_user");
	//password
	     driver.findElement(By.id("password")).sendKeys("secret_sauce");
	//login button
	     driver.findElement(By.id("login-button")).click();
	 // close the application
	     
	     Thread.sleep(5000);
	    // close the application window 
	    driver.close();
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
	     
		
		

	}

}
