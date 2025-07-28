package testNg2;

import org.testng.annotations.Test;


import java.io.File;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class DataproviderTest2 {
  @Test(dataProvider = "Login")
  public void SwgLogin(String uid, String pwd) throws Exception {
	  
	 WebDriver driver=new ChromeDriver();
	 driver.get("https://www.saucedemo.com/");
	 driver.manage().window().maximize();
	 //username
	 driver.findElement(By.id("user-name")).clear();
	 driver.findElement(By.id("user-name")).sendKeys(uid);
	 //password
	 driver.findElement(By.id("password")).clear();
	 driver.findElement(By.id("password")).sendKeys(pwd);
	 //login
	 driver.findElement(By.id("login-button")).click();
	 Thread.sleep(3000);
	 driver.quit();
	  
	  
	}

  @DataProvider(name="Login")
  public Object[][] dp() throws InvalidFormatException, IOException {
	  File xlfile=new File("C:\\Users\\dell\\Desktop\\testing files\\LoginData.xlsx");
	  XSSFWorkbook wb=new XSSFWorkbook(xlfile);
	  XSSFSheet ws1=wb.getSheet("Sheet1");
	  //rowcountn
	 int rowcount= ws1.getPhysicalNumberOfRows();
	  
	  Object[][] data=new Object[rowcount][2];
	for(int i=0;i<rowcount;i++) {
		//row1
		  data[i][0]=ws1.getRow(i).getCell(0).getStringCellValue();
		  data[i][1]=ws1.getRow(i).getCell(1).getStringCellValue();
	   }
	  
	  
	  
	 
	  
	  return data;
	  

  }
}
