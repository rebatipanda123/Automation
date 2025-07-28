package appUtils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory {

	
	public static WebDriver driver;
	//create a method to launch the browser
	
	public static WebDriver startBrowser(String strbrowser)
	{
	   strbrowser=strbrowser.toUpperCase();
	   
	   switch (strbrowser) {
	case "CHROME":
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		break;
	case "EDGE":
	      driver=new EdgeDriver();
	      driver.manage().window().maximize();
	      break;
	case "FIREFOX": case "FF": case "FIRE FOX":
		  driver=new FirefoxDriver();
		  driver.manage().window().maximize();
		  break;
		  
	default:
		driver=null;
		break;
	}
		
		return driver;
		
	}
	
//end browser
	public void endBrowser()
	{
		driver.quit();
	}
	
	
	
	
	
	
	
	
}
