package dataDriven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SwgMethods {

	public static WebDriver driver;
	
	// launch browser
	public static void LaunchBrowser(String strbrowser)
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
		case "FF":
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			break;
		default:
			driver=null;
			break;
		}
	}
//open url
	
	    public static void openURL(String URL)
	    {
	    	
	    driver.get(URL);	
	  
}
	//login
	    public static void swgLogin(String uid,String pwd)
	    {
	   //username
	    	driver.findElement(By.id("user-name")).clear();
	    	driver.findElement(By.id("user-name")).sendKeys(uid);
	   //password 	
	    	driver.findElement(By.id("password")).clear();
	    	driver.findElement(By.id("password")).sendKeys(pwd);
	    //login
	    	driver.findElement(By.id("login-button")).click();
	    }
	
	
	//logout
	    public static void swglogout() throws InterruptedException
	    {
	    	Thread.sleep(3000);
	    	try {
	  //click on menu button
	    	driver.findElement(By.id("react-burger-menu-btn")).click();
	  //click on logout button
	    	driver.findElement(By.id("logout_sidebar_link")).click();
	    }
	   catch (Exception e) {
		System.out.println("Exception occured..");
	}

	    }
	    
	//close the app
	    public static void closeApp() throws InterruptedException
	    {
	    	Thread.sleep(3000);
	    	driver.close();
	    }
	    
	    
}




