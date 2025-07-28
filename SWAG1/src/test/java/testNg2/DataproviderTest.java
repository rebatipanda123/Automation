package testNg2;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataproviderTest {
  @Test(dataProvider = "dp")
  public void swglogin(String uid, String pwd) throws Exception {
	  
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.saucedemo.com/");
	 driver.manage().window().maximize();
	 //username
	 driver.findElement(By.id("user-name")).clear();
	 driver.findElement(By.id("user-name")).sendKeys(uid);
	 //password
	 driver.findElement(By.id("password")).clear();
	 driver.findElement(By.id("password")).sendKeys(pwd);
	 //login
	 driver.findElement(By.id("login-button")).click();
	 Thread.sleep(3000);
	 
	  
	  
	}

  @DataProvider
  public Object[][] dp() {
	  
	  Object[][] data=new Object[3][2];
	  //row1
	  data[0][0]="standard_user";
	  data[0][1]="secret_sauce";
	  //row2
	  data[1][0]="locked_out_user";
	  data[1][1]="secret_sauce";
	 //row3 
	  data[2][0]="problem_user";
	  data[2][1]="secret_sauce";
	  
	  return data;
	  

  }
}
