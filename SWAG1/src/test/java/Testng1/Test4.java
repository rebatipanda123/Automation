package Testng1;

import org.testng.annotations.Test;

public class Test4 {
  @Test(groups = {"FF"})
  public void FFbrowser() {
	  System.out.println("This is login of ebay site");
	  
  }
  
  @Test(groups = {"Chrome"})
  public void Chromebrowser() {
	 System.out.println("In this we are going into mvnrepository site"); 
  }
  
  @Test(groups = {"Edge"})
  public void Edgebrowser() {
	  System.out.println("in this we are launching Saucedemo app");
	  
  }
}
