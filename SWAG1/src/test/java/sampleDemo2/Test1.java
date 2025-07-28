package sampleDemo2;
import java.util.List;



import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
	driver.get("http://google.com");	
	driver.manage().window().maximize();
	//find the search textbox
	//driver.findElement(By.name("q")).sendKeys("Testing Tools");
	//get the<>attribute values of googlr page:using tagname
	//using find elements
	List<WebElement> list =driver.findElements(By.tagName("textarea"));
	//get the size
	System.out.println(list.size());
	//to return the attribute values
	for(int i=0;i<list.size();i++)
	{
		String idval=list.get(i).getAttribute("id");
		if(idval.equals("q"))
		{
			list.get(i).sendKeys("Testing tools");
			break;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
		
		
		
		
		
		
		
		
		
		

	}

}
