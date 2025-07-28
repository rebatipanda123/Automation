package sampleDemo2;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/checkboxradio/");
		driver.manage().window().maximize();
		Thread.sleep(4000);
		driver.switchTo().frame(0);
		//to check the element is enabled or disabled
		boolean istrue=driver.findElement(By.xpath("/html/body/div/fieldset[1]/label[1]")).isEnabled();		
		System.out.println("istrue");
		//to check the element displayed or not
		boolean disply=driver.findElement(By.xpath("/html/body/div/fieldset[1]/label[1]")).isDisplayed();	
		System.out.println("istrue");
		//to check the element is selected or not
		
		boolean sel=driver.findElement(By.xpath("/html/body/div/fieldset[1]/label[1]")).isSelected();	
		System.out.println("sel");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
