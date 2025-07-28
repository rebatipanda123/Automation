package dataDriven;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		// calling the method in test
//		SwgMethods objMethods=new SwgMethods();
//		objMethods.LaunchBrowser("Chrome");
		
		
		SwgMethods.LaunchBrowser("Edge");
		SwgMethods.openURL("http://saucedemo.com");
		SwgMethods.swgLogin("standard_user", "secret_sauce");
		SwgMethods.swglogout();
		SwgMethods.closeApp();
		
		
		

	}

}
