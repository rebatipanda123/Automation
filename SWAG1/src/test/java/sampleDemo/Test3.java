package sampleDemo;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		
	WebDriver driver = new ChromeDriver();
	driver.get("https://stage-1.alivius.in/login");	
	driver.manage().window().maximize();
	Thread.sleep(3000);
	
	driver.findElement(By.id("input-email")).sendKeys("royalharish100@gmail.com");
	driver.findElement(By.id("input-password")).sendKeys("Test@123");
	driver.findElement(By.xpath(" //button[text()=\" Log In \"]")).click();
	WebElement logo= driver.findElement(By.className("Alivius Logo"));	
	System.out.println("logo alt text::"+ logo.getAttribute("alt"));
	

		
	}

}
