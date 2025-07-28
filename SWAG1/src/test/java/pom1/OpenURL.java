package pom1;

import org.openqa.selenium.WebDriver;

public class OpenURL {
	
	
	  WebDriver driver;
	  //constructor
	  public OpenURL(WebDriver driver)
	  {
		  this.driver=driver;
	  }
	//launch the browser
	  public void open_URL(String strURL)
	  {
		  driver.get(strURL);
	  }
	
	
	

}
