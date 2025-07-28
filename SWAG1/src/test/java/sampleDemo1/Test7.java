package sampleDemo1;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 {

	public static void main(String[] args) throws InterruptedException {
		//getcurrenturl:it is used to return the current page url
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.ebay.com/");
		Thread.sleep(3000);
		//display the current url
//		String Actualurl =driver.getCurrentUrl();
//		
//		System.out.println(Actualurl);
//		//verify the url
//		String expurl="https://www.ebay.com/";
//		
//		if(expurl.equals(Actualurl))
//		{
//			System.out.println("matching");
//		}
//		else
//		{
//			System.out.println("not matching");
//		}
//		
		//maximize the window
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();//delete the history of the object
		//display the pagesourcecode
		
		String pgsrc=driver.getPageSource();
		
		System.out.println(pgsrc);
		
		
	
	}

}
