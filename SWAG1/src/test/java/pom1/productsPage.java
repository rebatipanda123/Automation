package pom1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class productsPage {
	WebDriver driver;
	public productsPage(WebDriver driver)
	{
		this.driver=driver;
	}
	//identify the locators of products page products page
	
	By menu=By.id("react-burger-menu-btn");
	By cartimg=By.xpath("//*[@id=\"shopping_cart_container\"]/a");
	By producttitle=By.xpath("//span[@class='title']");
	By addTCart_saucelabsbackpack=By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
	By addtoCart_saucelabsbikelight=By.xpath("//button[@id='add-to-cart-sauce-labs-bike-light']");
    By addcart_boltshirt=By.xpath("//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']");
    By logout=By.xpath("//a[@id='logout_sidebar_link']");
    By productsort= By.xpath("//select[@class='product_sort_container']");                    
    
   
    
     //devlop user actions method
	//step1: add products
    public void addProducts(String strProdName)
    {
    	strProdName=strProdName.toUpperCase();
    	switch (strProdName) {
		case "BACKPACK":
			driver.findElement(addTCart_saucelabsbackpack).click();
			break;
		case "TSHIRT":
			driver.findElement(addcart_boltshirt).click();
				
		default:
			break;
		}
    	
    }
    
	//step2:logout :menu>logout
    public void logout() throws InterruptedException
    {
    	driver.findElement(menu).click();
    	Thread.sleep(1000);
    	driver.findElement(logout);
    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
