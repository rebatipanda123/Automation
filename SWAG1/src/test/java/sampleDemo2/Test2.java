package sampleDemo2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.onlinesbi.sbi/");
		driver.manage().window().maximize();
		//list of links
//		List<WebElement> lst=driver.findElements(By.tagName("li"));
		List<WebElement> lst=driver.findElements(By.tagName("a"));
		//size
		System.out.println(lst.size());
		for(int i=0;i<lst.size();i++)
		{		
			//String lkname=lst.get(i).getText();
			String hrf=lst.get(i).getAttribute("hrf");
			//System.out.println("index :: " +i+""+lkname);
		System.out.println("index :: " +i+""+hrf);

		
			//if(lkname.equals("Block ATM Card"))
		//	{
				
		//	}
		//		lst.get(i).click();
			
	}		


	}

}
