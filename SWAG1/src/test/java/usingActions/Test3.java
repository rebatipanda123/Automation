package usingActions;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://jqueryui.com/droppable/");
//using frame
		WebElement iframe1=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(iframe1);
//FIRSTELEMENT ; DARGELEMENT
		
		WebElement element1= driver.findElement(By.id("draggable"));
// SECONDELEMENT ; DROPPABLE
		WebElement element2= driver.findElement(By.id("droppable"));
 //drag and drop      
		Actions ac=new Actions(driver);
		ac.dragAndDrop(element1, element2);
		ac.build().perform();
//if you wanted to switch in this code then you can use this
		//driver.switchTo().defaultContent();
		}

}
