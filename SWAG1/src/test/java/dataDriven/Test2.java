package dataDriven;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Test2 {

	public static void main(String[] args) throws InterruptedException,  IOException {
		
// create workbook object
		String strfile="C:\\Users\\dell\\Desktop\\testing files\\LoginData.xlsx";
		File filepath=new File(strfile);
		
		FileInputStream ifile=new FileInputStream(filepath);
		
		XSSFWorkbook wb=new XSSFWorkbook(ifile);
			
		
		XSSFSheet ws1=wb.getSheet("Sheet1");//data is available
		//XSSFSheet ws2=wb.getSheet("Sheet2");
		
		int rc=ws1.getPhysicalNumberOfRows();
//print the rowcount
		System.out.println(rc);
		
		for(int i=1;i<rc;i++ )
		{
//read the cell values and store them into a string variable
			String uid=ws1.getRow(i).getCell(0).getStringCellValue();
			String pwd=ws1.getRow(i).getCell(1).getStringCellValue();
			System.out.println(uid+" "+pwd);
		}
//		SwgMethods.LaunchBrowser("Edge");
//		SwgMethods.openURL("http://saucedemo.com");
//	
//	    SwgMethods.swgLogin(uid,pwd);
//		SwgMethods.swglogout();
//	    SwgMethods.swglogout();
//		
//		
//		

	}

}
