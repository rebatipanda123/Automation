package usingFrames;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
//implicitwait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//url
		driver.get("https://netbanking.hdfcbank.com/netbanking/");

//switchto iframe using webelement
		WebElement iframe1=driver.findElement(By.name("login_page"));
		driver.switchTo().frame(iframe1);
//click on continue button		
		driver.findElement(By.xpath("//a[normalize-space()='CONTINUE']")).click();
//working with alerts	
//case1
	Alert myalert= driver.switchTo().alert();
	String txt=myalert.getText();
	System.out.println(txt);
//case2
//		String txt=driver.switchTo().alert().getText();
//		System.out.println(txt);
// to click on ok use accept()method
       // driver.switchTo().alert().accept();
	myalert.accept();
		
//to click on cancel use dismiss()		
		
		
		
		
			}

}
