package webTable;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PickDate2 {
	
	
	public void datepick(String strDay,String strMonth,String strYear)
	{
		WebDriver driver=new ChromeDriver();
        driver.get("https://www.redbus.in/buses/hyderabad-bus-tickets");
		   driver.manage().window().maximize();
		   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		   
		 
		   
	//cancat
	   
		   String expMY= strMonth+" "+strYear;
		   
	// to click on onboard date
		   driver.findElement(By.id("txtOnwardCalendar")).click();
		   
		   while (true) {
			 //capture the month and year
				  String monthyear= driver.findElement(By.className("calwid__year-month")).getText();
			      System.out.println(monthyear);
			      
	//case1
			      if(monthyear.equals(expMY))
			      {
			    	  break;
			      }
			      
			
/* case2	
				   String actualval=monthyear;
				  String[] str= actualval.split(" ");
				  
				   String actmonth=str[0];  //month
				   String actyear=str[1];  //year 
				   
				   if(actmonth.equals(expmonth) && actyear.equals(expyear))
				   {
					      break;
				   }
				*/  
				  WebElement next= driver.findElement(By.className("calwid__btn-next-month"));
				  next.click();
		}
		   
		   
	//select the date
		List<WebElement> dtList=driver.findElements(By.xpath("//*[@id=\'onward\']/div/div[3]/span"));
		System.out.println(dtList.size());
		
		for(WebElement i:dtList)
		{
			System.out.println(i.getText());
			if(i.getText().equals(strDay))
			{
				i.click();
			}
			
			
		}
		
		
	}

	public static void main(String[] args) {

		PickDate2 objDate=new PickDate2();
		 String expday="10";
		   String expmonth="Dec";
		   String expyear="2024";
		objDate.datepick(expday, expmonth, expyear);
		
		
		
		
		
		
		
		
		
		
		
           
		
		
		}

}
