package appTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import appUtils.ReusableMethods;
import pom1.BrowserFactory;

public class EbayTest1 {
  @Test
  public void search() throws InterruptedException {
	  
	  //launch browser
	   WebDriver driver=BrowserFactory.startBrowser("chrome");
	   //open url
	   ReusableMethods RMObj=new ReusableMethods(driver);
	   RMObj.openAppURL("http://ebay.com");
	   Thread.sleep(3000);
	 //select the value from DD
	   RMObj.SelectValue("id", "gh-cat", "Books & Magazines");
	   
	    //enter text in searchbox
	   RMObj.enterText("id", "gh-ac", "Selenium books");
	  //click search button
	   RMObj.clickElement("id", "gh-btn");
	   Thread.sleep(3000);
	   									
	  RMObj.closeapp();
	  
	  
	  
	  
	  
	  
  }
}
