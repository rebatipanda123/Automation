package usingRobot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) throws IOException, AWTException, InterruptedException {
		/**open notepad
		 * enter the text into the notepad
		 * save the notepad into specified location
		 * close the notepad
		 */
		

		
//step1
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter the some text");
		String str=sc.nextLine();
//step2		
		
		Runtime.getRuntime().exec("notepad.exe");	
		Thread.sleep(5000);
		
	//	copy and paste file path	
		StringSelection sel=new StringSelection(str);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel, null);//copy the text		
//contl +v
		Robot rb=new Robot();
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		
//control+s
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_S);
		rb.keyRelease(KeyEvent.VK_S);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		
		StringSelection sel1=new StringSelection("C:\\Users\\dell\\Documents\\selenium\\some text");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sel1, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		
//		
//press enter button using keyboard
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);

// to close the notepad window//alt+f4
		rb.keyPress(KeyEvent.VK_ALT);
		rb.keyPress(KeyEvent.VK_F4);
		rb.keyRelease(KeyEvent.VK_F4);
		rb.keyRelease(KeyEvent.VK_ALT);
		
			
		
		
		
		
		}

}
