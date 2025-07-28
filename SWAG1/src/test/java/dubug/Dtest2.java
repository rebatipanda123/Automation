package dubug;

import dataDriven.SwgMethods;

public class Dtest2 {

	public static void main(String[] args) throws InterruptedException {
		
		// calling the method in test
//		SwgMethods objMethods=new SwgMethods();
//		objMethods.LaunchBrowser("Chrome");
		
		SwgMethods.LaunchBrowser("Edge");
		SwgMethods.openURL("http://saucedemo.com");
		String username="standard_user";
		String password="secret_sauce";
		SwgMethods.swgLogin(username,password);
		SwgMethods.swglogout();
		SwgMethods.closeApp();
		
		

	}

}
