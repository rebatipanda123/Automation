package appTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import appUtils.ReusableMethods;
import pom1.BrowserFactory;

public class GoogleTest2 {
  @Test
  public void search() {
	  
	  //launch browser
	   WebDriver driver=BrowserFactory.startBrowser("edge");
	   //open url
	   ReusableMethods RMObj=new ReusableMethods(driver);
	   RMObj.openAppURL("http://google.com");
	    //enter text in searchbox
	   RMObj.enterText("name", "q", "Selenium books");
	  //click search button
	   RMObj.clickElement("name", "btnK");
	   									
	  RMObj.closeapp();
	  
	  
	  
	  
	  
	  
  }
}
