package testNg2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class NewTest {
  @Test
  public void f1() {
	 System.out.println("This is Method1"); 
  }
  
  @Test
  public void f2() {
	  System.out.println("This is Method2");
  }
  
  @Test
  public void f3() {
	  System.out.println("This is Method3");
	  
  }
  
  
  
  
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("This is Before Method");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("This is After Method");
  }

}
