package cssSelector;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {
	

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		driver.manage().window().maximize();
		//locate search textbox using cssselector
		//driver.findElement(By.cssSelector("#gh-ac")).sendKeys("selenium books");
		//or
		//driver.findElement(By.cssSelector("input#gh-ac")).sendKeys("selenium books");
	//	cssselector(tag[attributr='value'])
	driver.findElement(By.cssSelector("input[placeholder='Search for anything']")).sendKeys("selenium books");	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
