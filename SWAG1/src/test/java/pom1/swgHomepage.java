package pom1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class swgHomepage {
	WebDriver driver;
	//constructo
public	swgHomepage(WebDriver driver)
	{
		this.driver=driver;
	}
	//locaters
	//username
	
	By username=By.id("user-name");
	//password
	By password =By.id("password");
	//login
	By login=By.id("login-button");
	
    public void EnterUsername(String txtuid)
{
	driver.findElement(username).sendKeys(txtuid);
}
	
	public void Enterpassword(String txtpwd)
	{
		driver.findElement(password).sendKeys(txtpwd);
	}

	public void clickLoginbutton()
	{
		driver.findElement(login).click();
	}
	

	
	
}

