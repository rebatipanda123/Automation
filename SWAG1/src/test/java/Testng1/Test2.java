package Testng1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test2 {

	@Test
	
	public void LaunchBrowser()
	{
		
		
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://mvnrepository.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}


