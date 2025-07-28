package appTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import appUtils.ReusableMethods;
import pom1.BrowserFactory;

public class EbayTest2 {
  @Test
  public void search() {
	  
	  //launch browser
	   WebDriver driver=BrowserFactory.startBrowser("chrome");
	   //open url
	   ReusableMethods RMObj=new ReusableMethods(driver);
	   RMObj.openAppURL("http://ebay.com");
	    //enter text in searchbox
	   RMObj.enterText("id", "gh-ac", "Selenium books");
	  //click search button
	   RMObj.clickElement("id", "gh-btn");
	   									
	  RMObj.closeapp();
	  
	  
	  
	  
	  
	  
  }
}
