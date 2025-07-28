package usingActions;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/selectable/");
//using frame
		WebElement iframe1=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(iframe1);
//locate selectable element	
		WebElement sel=driver.findElement(By.id("selectable"));
//get the items list
	    List<WebElement> items=sel.findElements(By.tagName("li"));
//get the items count
	    System.out.println(items.size());
//perform action on it	    
	Actions myAction=new Actions(driver);
//	myAction.click(items.get(0));
	//myAction.click(items.get(1));
	//myAction.click(items.get(3));
  //  myAction.build().perform();
 // to click on more than one item
    
	//press cntrl button(modifier key)keydown,keyup
//	myAction.keyDown(Keys.CONTROL);
//	myAction.click(items.get(0));
//	myAction.click(items.get(1));
//	myAction.click(items.get(2));
//	myAction.keyUp(Keys.CONTROL);
//	myAction.build().perform();
	
//select all items expect 2nd items
	for(int i=0;i<items.size();i++)
	{
		
		if(i==2 ||i==4)
		{
		continue;	
		}
		myAction.keyDown(Keys.CONTROL);
		myAction.click(items.get(i));
		myAction.build().perform();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
