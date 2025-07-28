package Testng1;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Test1 {
  @Test
  public void login() {
	  
	    WebDriver driver=new  EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://Sacuedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  
	  
	  
	  
	  
  }
}
