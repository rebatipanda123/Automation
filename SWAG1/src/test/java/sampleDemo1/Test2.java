package sampleDemo1;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
/**
 * open edgebrowser
 * launch url : http//ebay.com
 * and get the title of the page
 */

public class Test2 {

	public static void main(String[] args) {
	WebDriver driver=new EdgeDriver();
	driver.get("https://www.ebay.com/");
	driver.manage().window().maximize();
	String ebaytitle=driver.getTitle();
	System.out.println("Ebay title is::" + ebaytitle);
	
		

	}

}
