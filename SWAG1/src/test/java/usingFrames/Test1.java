package usingFrames;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Test1 {

	public static void main(String[] args) {
		// 
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//implicitwait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//url
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
//switchto iframe using name
		//driver.switchTo().frame("login_page");//switch to specific frame
//switchto iframe using index
		//driver.switchTo().frame(0);
//switchto iframe using webelement
		WebElement iframe1=driver.findElement(By.name("login_page"));
		driver.switchTo().frame(iframe1);
//enter the customer id
		driver.findElement(By.xpath("//input[@name='fldLoginUserId']")).sendKeys("12345");
		driver.switchTo().defaultContent();//go back to main page//comeout of all frames
		driver.switchTo().frame("login_page");
		driver.findElement(By.xpath("//a[normalize-space()='CONTINUE']")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
