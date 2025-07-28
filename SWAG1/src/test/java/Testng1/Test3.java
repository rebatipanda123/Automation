package Testng1;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Test3 {
  @Test
  public void Ebaylogin() {
	  
	    WebDriver driver=new  FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://ebay.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	  
	  
	  
	  
	  
	  
  }
}
