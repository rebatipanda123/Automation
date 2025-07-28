package appUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class ReusableMethods {
	
	
          ReusableMethods reusableMethods;
          WebDriver driver;
	//constructor
          public ReusableMethods(WebDriver driver)
          {
        	  this.driver=driver;
        	  
          }
          //open url
          public void openAppURL(String strURL)
          {
        	  driver.get(strURL);
          }
	
	//locating the element
          public static  By locatorvalue(String strlocator,String strlocatorValue)
          {
        	  By Loc;
        	  strlocator =strlocator.toUpperCase();
        	  switch (strlocator) {
			case "XPATH":
				Loc=By.xpath(strlocatorValue);
				break;
			case "CLASSNAME":
				Loc=By.className(strlocatorValue);
				break;
			case "CSS SELECTOR":	case "CSSSELECTOR":
				Loc=By.cssSelector(strlocatorValue);
				break;
			case "LINKTEXT":
				Loc=By.linkText(strlocatorValue);
                 break;
			case "PARTIALLINKTEXT": case "PARTIAL LINK TEXT":
				Loc=By.partialLinkText(strlocatorValue);
				break;
			case "TAGNAME":	case "TAG NAME":
				Loc=By.tagName(strlocatorValue);
				break;
			case "ID":
				Loc=By.id(strlocatorValue);
				break;
			case "NAME":
				Loc=By.name(strlocatorValue);
				break;
			default:
				Loc=null;
				break;
			}
        	  
        	  return Loc ;
          }
          
      //useractions method1:enter the text
          public void enterText(String strlocator,String strlocatorValue,String txtValue)
          
          {  
        	  
        	try {
        		  //locator the element
           	 By Locator= ReusableMethods.locatorvalue(strlocator, strlocatorValue); 
           	 
           	 //perform action on the element
           	 driver.findElement(Locator).sendKeys(txtValue);
			} catch (Exception e) {
				
			}  
        	  
        	  }
          
        //useractions method2: click webelement
      	public void  clickElement(String strlocator,String strlocatorValue)
      	{        	  
      		try {

      		  //locator the element
         	 By Locator= ReusableMethods.locatorvalue(strlocator, strlocatorValue); 
         	 
         	 //perform action on the element
         	 driver.findElement(Locator).click();
			} catch (Exception e) {
				
			}
      	}
      	
      	
      	//method3: select the value froem weblist/dropdown by using visibletext
      	public void  SelectValue(String strlocator,String strlocatorValue,String strVisibleText)
      	{        	  
      		try {

      		  //locator the element
         	 By Locator= ReusableMethods.locatorvalue(strlocator, strlocatorValue); 
         	 
         	 //perform action on the element
         	  WebElement dd = driver.findElement(Locator);
         	  Select sc=new Select(dd);
         	  sc.selectByVisibleText(strVisibleText);
			} catch (Exception e) {
				
			}
      	}
      	//close app
      	public void closeapp()
      	{
      		driver.quit();
      	}
      	
	
	

}
