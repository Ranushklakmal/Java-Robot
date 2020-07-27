/*	IT16151420
 *  M.A.R.L Sankalpa
 * 	ASSIGNMENT 05. Question 02..
 * */

package Question_2;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class JavarobotExel {

	public static void main(String[] args) throws AWTException, InterruptedException{
		
		
		Robot ex = new Robot(); //constructor
		
		// open windows run 
		ex.keyPress(KeyEvent.VK_WINDOWS); 
		ex.keyPress(KeyEvent.VK_R);
		ex.keyRelease(KeyEvent.VK_R);
		ex.keyRelease(KeyEvent.VK_WINDOWS);
		
		// in run type excel
	
		ex.keyPress(KeyEvent.VK_E);
		ex.keyRelease(KeyEvent.VK_E);
		ex.keyPress(KeyEvent.VK_X);
		ex.keyRelease(KeyEvent.VK_X);
		ex.keyPress(KeyEvent.VK_C);
		ex.keyRelease(KeyEvent.VK_C);
		ex.keyPress(KeyEvent.VK_E);
		ex.keyRelease(KeyEvent.VK_E);
		ex.keyPress(KeyEvent.VK_L);
		ex.keyRelease(KeyEvent.VK_L);
		
		Thread.sleep(2000); // time 2sec
		
		ex.keyPress(KeyEvent.VK_ENTER);
		ex.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(1000); // time 1sec
		
		ex.keyPress(KeyEvent.VK_ENTER);
		ex.keyRelease(KeyEvent.VK_ENTER);

		Thread.sleep(2000); // time 2sec
		
		ex.keyPress(KeyEvent.VK_1);
		ex.keyRelease(KeyEvent.VK_1);
		ex.keyPress(KeyEvent.VK_0);
		ex.keyRelease(KeyEvent.VK_0);
		
		ex.keyPress(KeyEvent.VK_DOWN);
		ex.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(1000); // time 1sec
	
		ex.keyPress(KeyEvent.VK_2);
		ex.keyRelease(KeyEvent.VK_2);
		ex.keyPress(KeyEvent.VK_0);
		ex.keyRelease(KeyEvent.VK_0);
		
		ex.keyPress(KeyEvent.VK_DOWN);
		ex.keyRelease(KeyEvent.VK_DOWN);
		
		Thread.sleep(1000); // time 1sec
		
		ex.keyPress(KeyEvent.VK_EQUALS);
		ex.keyRelease(KeyEvent.VK_EQUALS);
		ex.keyPress(KeyEvent.VK_S);
		ex.keyRelease(KeyEvent.VK_S);
		ex.keyPress(KeyEvent.VK_U);
		ex.keyRelease(KeyEvent.VK_U);
		ex.keyPress(KeyEvent.VK_M);
		ex.keyRelease(KeyEvent.VK_M);
		
		//open bracket '('
		ex.keyPress(KeyEvent.VK_SHIFT);
		ex.keyPress(KeyEvent.VK_9);
		ex.keyRelease(KeyEvent.VK_9);
		ex.keyRelease(KeyEvent.VK_SHIFT);
	
		//set column A1 and A2 
		ex.keyPress(KeyEvent.VK_A);
		ex.keyRelease(KeyEvent.VK_A);
		ex.keyPress(KeyEvent.VK_1);
		ex.keyRelease(KeyEvent.VK_1);
		ex.keyPress(KeyEvent.VK_COMMA);
		ex.keyRelease(KeyEvent.VK_COMMA);
		ex.keyPress(KeyEvent.VK_A);
		ex.keyRelease(KeyEvent.VK_A);
		ex.keyPress(KeyEvent.VK_2);
		ex.keyRelease(KeyEvent.VK_2);

		//close ')'
		ex.keyPress(KeyEvent.VK_SHIFT);
		ex.keyPress(KeyEvent.VK_0);
		ex.keyRelease(KeyEvent.VK_0);
		ex.keyRelease(KeyEvent.VK_SHIFT);
	
		Thread.sleep(1000);
		
		ex.keyPress(KeyEvent.VK_ENTER);
		ex.keyRelease(KeyEvent.VK_ENTER);
	
	}
	
}
