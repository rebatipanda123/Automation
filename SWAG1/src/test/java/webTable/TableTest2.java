package webTable;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableTest2 {

	public static void main(String[] args) {
		
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//get the rowcount of customer table
	List<WebElement> lst= driver.findElements(By.xpath("//*[@id='customers']/tbody/tr"));
		int rc=lst.size();
		System.out.println(rc);
		
	//heading  
		WebElement comp=driver.findElement(By.xpath("//*[@id='customers']/tbody/tr[1]/th[1]"));
		WebElement cont=driver.findElement(By.xpath("//*[@id=\'customers\']/tbody/tr[1]/th[2]"));
		WebElement cntry=driver.findElement(By.xpath("//*[@id=\'customers\']/tbody/tr[1]/th[3]"));
		System.out.println(comp.getText()+"##"+cont.getText()+"##"+cntry.getText());
		
		for(int i=2;i<=rc;i++)
		{
		
			WebElement str=driver.findElement(By.xpath("//*[@id=\'customers\']/tbody/tr["+i+"]/td[1]"));
		
	//print all rows first column values
	//		System.out.println(str.getText());
		if(str.getText().equals("Island Trading"))
		{
		//pribt country
		WebElement str1=driver.findElement(By.xpath("//*[@id=\'customers\']/tbody/tr["+i+"]/td[3]"));
		System.out.println(str1.getText());
		break;
		}
			
		}
			
			
	}		
		
}	


		
		
		
		
		
		
		
		
		
		
		

	


