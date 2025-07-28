package usingActions;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Test1 {

	public static void main(String[] args) {
		//
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.ebay.com/");
//locate the search textbox element and enter txt init
		driver.findElement(By.id("gh-ac")).sendKeys("books");
//working with action class
		Actions ac=new Actions(driver);
		
//using modifier key (keydown,keyup)
		ac.keyDown(Keys.CONTROL); //press control btn
	    ac.sendKeys(Keys.F5); //f5
		ac.keyUp(Keys.CONTROL); //release control btn
     	ac.build().perform(); //execut the command
		
	//or	
	//	ac.sendKeys(Keys.F5).perform();
		
     	//ac.keyDown(Keys.CONTROL).sendKeys(Keys.F5).keyUp(Keys.CONTROL).perform();	
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
