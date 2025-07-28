package pomSwgTest;

import org.testng.annotations.Test;

import pomPageObject.productsPage;
import pomPageObject.swgHomepage;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TC001 {
	WebDriver driver;
  @Test
  public void VerifyLogin() throws InterruptedException {
	  
	  swgHomepage swgHP=new swgHomepage(driver);
      swgHP.EnterUsername("standard_user");
      swgHP.Enterpassword("secret_sauce");
	  swgHP.clickLoginbutton();
	  
	  //step3 logout
	  productsPage swgPP=new productsPage(driver);
	  swgPP.logout();
	  
  }
  @BeforeClass
  public void beforeClass() {
	  //open the swg page
	  driver=new ChromeDriver();
	  driver.get("http://saucedemo.com");
	  driver.manage().window().maximize();
	  
  }

  @AfterClass
  public void afterClass() {
	  driver.quit();
  }

}
