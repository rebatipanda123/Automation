package Usingxpath;

import java.util.List;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test3 {

	public static void main(String[] args) throws InterruptedException {
		// 
		
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[5]/a")).click();	
		
		//name-//*[@id="u_0_8_Td"]
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/input")).sendKeys("rebati");
		//surname-//*[@id="u_0_a_ob"]
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[2]/div/div[1]/input")).sendKeys("panda");
		
		//day
		WebElement day =driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div[2]/span/span/select[1]"));
		//create select class object
		Select DD1=new Select(day);
		//DD.select by index
	//	DD.selectByIndex(3);
		//or using selectby value
		
		//DD.selectByValue("4");
		//or using selectby visible text
		DD1.selectByVisibleText("12");
		//month
		WebElement month=driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[2]/div[2]/span/span/select[2]"));
		Select DD2=new Select(month);
		//DD1.selectByIndex(0);
		//or
		//DD1.selectByValue("2");
		//DD1.selectByVisibleText("Feb");

	//display all the option available in the dropdown
	List<WebElement> lstoptions= DD2.getOptions();
	// to display the no of items available in dropdown
	System.out.println(lstoptions.size());
	// display the option available in dropdown
//	for(WebElement i:lstoptions)
//	{
//		System.out.println(i.getText());
//	}
//	
//		
	//if the text is matching with june then select
//	
//	for(WebElement i:lstoptions)
//	{
//		String Month=i.getText();
//		System.out.println(Month);
//		
//		if(Month.equals("June"))
//		{
//		DD2.selectByVisibleText(Month);
//		break;
//		}
//	}
		for(int i=0;i<lstoptions.size();i++)
		{
			
			String txtname=lstoptions.get(i).getText();
			if(txtname.endsWith("June"))
			{
				DD2.selectByIndex(i);
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

	
		
	}


