package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class Test5 {

	public static void main(String[] args) throws Exception {
	//to work with multiple set of data//using excel file//data driven test
	//inputfile	
	//String xl="C:\\Users\\dell\\Desktop\\testing files\\LoginData.xlsx";	
		File file1=new File(Constants.SWG_XLFILE1);
		FileInputStream ifile=new FileInputStream(file1);
		
//outputfile
		
		String strfile="C:\\Users\\dell\\Desktop\\testing files\\LoginResult1.xlsx";
		File file2=new File(strfile);
		FileOutputStream oFile=new FileOutputStream(file2);
		
		
		XSSFWorkbook wb=new XSSFWorkbook(ifile);
		XSSFSheet ws1=wb.getSheet("Sheet1");
		
	//get the row count	
	    int rc=	ws1.getPhysicalNumberOfRows();
	    System.out.println(rc);	
	//start for loop
	    for(int i=1;i<rc;i++)
	    {
	    	
	  //read the celldata of username and password fields
	    	String uid=ws1.getRow(i).getCell(0).getStringCellValue();
	    	String pwd=ws1.getRow(i).getCell(1).getStringCellValue();
	    	
	  //devlop the test script
	    	
	    	WebDriver driver=new ChromeDriver();
	    	//open swag url
	    		driver.get("http://saucedemo.com");
	    		driver.manage().window().maximize();
	    	//enter uid
	    		driver.findElement(By.id("user-name")).clear();
	    		
	    		driver.findElement(By.id("user-name")).sendKeys(uid);
	    	//enter pwd
	    		driver.findElement(By.id("password")).clear();
	    		
	    		driver.findElement(By.id("password")).sendKeys(pwd);
	    	//click login
	    		driver.findElement(By.id("login-button")).click();
	    		Thread.sleep(3000);
	    		
	    		//varify product page	
	    		try {
	    			
	    			String actvalue=driver.findElement(By.xpath("//span[@class='title']")).getText();
	    			System.out.println(actvalue);
	    		    if(actvalue.equals("Products"))
	    		    {
	    		    	System.out.println("this test is pass");
	    		    	ws1.getRow(i).getCell(2).setCellValue("This test is pass");
	    		    }

	    			
	    			
	    		} catch (Exception e) {
	    			System.out.println("this test is fail");
	    			ws1.getRow(i).getCell(2).setCellValue("This test is fail");
	    		}
	    		
	    		
	    	 
	    		driver.quit();
	    		
	    	
	    }
	    
	    wb.write(oFile);
		wb.close();		
		}
	
		}
		
		
	 
    
		
		
		
				
		
		
		
		
		
		
		
		

	


