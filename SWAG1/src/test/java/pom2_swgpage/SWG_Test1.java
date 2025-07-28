package pom2_swgpage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import pom1.BrowserFactory;
import pom1.OpenURL;
import pom1.swgHomepage;
import pomPageObject.productsPage;


public class SWG_Test1 {
  @Test
  public void Login() throws InterruptedException {
	  
//	 step1:LaunchHandler Browser
	WebDriver driver= BrowserFactory.startBrowser("Chrome");
//	 step2:OpenURL URL
	OpenURL swgobj=new OpenURL(driver);
	        swgobj.open_URL("http://saucedemo.com");
	        Thread.sleep(3000);
//	 step3:verify home page
	        String strtitle=driver.getTitle();
	        Assert.assertEquals(strtitle, "Swag Labs");
//   step4:login
	        swgHomepage swgHomepage=new swgHomepage(driver);
	                    swgHomepage.EnterUsername("standard_user");
	                    swgHomepage.Enterpassword("secret_sauce");
	                    swgHomepage.clickLoginbutton();
 //verify product page
	        String strval   =  driver.findElement(By.className("title")).getText();
	        Assert.assertEquals(strval, "Products");     
	                    
//	   	 step4:LogOut	
	   productsPage productsPage=new productsPage(driver);
	   productsPage.logout();
	                    
//	 step5:closeapp
	   
	  driver.quit();
	  
	  
	  
	  
  }
}
