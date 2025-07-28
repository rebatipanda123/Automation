package sync;
import java.time.Duration;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// 
		WebDriver driver=new ChromeDriver();
//1-implicity wait
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//step1-explicitwait
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
//3-fluentwait step-declaration
		
		Wait<WebDriver> Wait=new FluentWait<WebDriver>(driver)
		//FluentWait fwait=new FluentWait(driver)
				
				.withTimeout(Duration.ofSeconds(15)) //max wait time
				.pollingEvery(Duration.ofSeconds(15))//check the element for every given no of seconds
				.ignoring(NoSuchElementException.class);//ignore exception untill given specified time
		driver.get("http://gmail.com");
		driver.manage().window().maximize();
		//driver.findElement(By.cssSelector("#identifierId")).sendKeys("ashnkapanda@gmail.com");
		//driver.findElement(By.cssSelector("#identifierNext > div > button > span")).click();
        driver.findElement(By.cssSelector("#yDmH0d > c-wiz > div > div.JYXaTc > div > div.FO2vFd > div > div > div:nth-child(1) > div > button > span")).click();
		driver.findElement(By.cssSelector("#yDmH0d > c-wiz > div > div.JYXaTc > div > div.FO2vFd > div > div > div:nth-child(2) > div > ul > li:nth-child(2) > span.VfPpkd-StrnGf-rymPhb-b9t22c")).click();
	    driver.findElement(By.cssSelector("#firstName")).sendKeys("ashnka");
	    driver.findElement(By.cssSelector("#lastName")).sendKeys("panda");
	    driver.findElement(By.cssSelector("#collectNameNext > div > button > span")).click();
	    //Thread.sleep(5000);
 //step 2- implementation-WebElement month= wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#month")));
//implementation fluent
	  WebElement month= Wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#month")));
//using select class
	     // WebElement month=driver.findElement(By.cssSelector("#month"));
	    //using select class object we will select option
	    Select sc=new Select(month);
	    sc.selectByVisibleText("June");
	    
		
		
		
		
		
		
		
		
		

	}

}
