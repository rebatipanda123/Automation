package usingActions;

import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test4 {

	public static void main(String[] args) throws InterruptedException {
		
		
		
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
  //control+c
        String txt="Selenium";
        StringSelection str=new StringSelection(txt);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
        
        WebElement search=driver.findElement(By.name("q"));
      Actions ac=new Actions(driver);
//        ac.contextClick(search).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.RETURN);
//        ac.build().perform();
//        
        ac.click(search).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
        

	}

}
