package testSCenario;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		/*
		 * project name :SWAGLABS
		 * login
		 * verify products page
		 * verify image cart
		 * add products to the cart
		 * checkout process
		 * 
		 */
		//login
        WebDriver driver =new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
    	driver.findElement(By.cssSelector("#user-name")).clear();
	    driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
		driver.findElement(By.cssSelector("#password")).clear();
		driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
		driver.findElement(By.cssSelector("#login-button")).click();
	    //verify products page
		String title=driver.findElement(By.cssSelector(".title")).getText();
		System.out.println(title);
		
		//checkpoint : expected :actual
		if(title.equals("Products"))
		{
			System.out.println("Login sucessfull");
		}
		else
		{
			System.out.println("Login failed");
		}
		//cart image
		//verify the image
		boolean isvisible=driver.findElement(By.cssSelector("a.shopping_cart_link")).isDisplayed();
		
		if(isvisible==true)
		{
			System.out.println("cart image exist");
		}
		else {
			System.out.println("cart image not exist");
		}

		//logout
	    // click menu
		driver.findElement( By.cssSelector("button[id='react-burger-menu-btn']")).click();
		Thread.sleep(2000);
		//click logout
		driver.findElement(By.cssSelector("#logout_sidebar_link")).click();
		
		//verify logout is sucessful or not
		String hometitle=driver.getTitle();
		if(hometitle.equalsIgnoreCase("Swag labs"))
		{
			System.out.println("Logout sucess");
		}
		
		else
		{
			System.out.println("Logout fail");
		}
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
