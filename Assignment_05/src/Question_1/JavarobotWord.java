/*	IT16151420
 *  M.A.R.L Sankalpa
 * 	ASSIGNMENT 05. Question 01..
 * */

package Question_1;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class JavarobotWord {

	public static void main(String[] args) throws AWTException, InterruptedException{
		
		Robot rb = new Robot(); //constructor
		
		// open windows run
		rb.keyPress(KeyEvent.VK_WINDOWS); 
		rb.keyPress(KeyEvent.VK_R);
		rb.keyRelease(KeyEvent.VK_R);
		rb.keyRelease(KeyEvent.VK_WINDOWS);
		
		// in run type winword command.
		rb.keyPress(KeyEvent.VK_W);
		rb.keyRelease(KeyEvent.VK_W);
		rb.keyPress(KeyEvent.VK_I);
		rb.keyRelease(KeyEvent.VK_I);
		rb.keyPress(KeyEvent.VK_N);
		rb.keyRelease(KeyEvent.VK_N);
		rb.keyPress(KeyEvent.VK_W);
		rb.keyRelease(KeyEvent.VK_W);
		rb.keyPress(KeyEvent.VK_O);
		rb.keyRelease(KeyEvent.VK_O);
		rb.keyPress(KeyEvent.VK_R);
		rb.keyRelease(KeyEvent.VK_R);
		rb.keyPress(KeyEvent.VK_D);
		rb.keyRelease(KeyEvent.VK_D);
		
		Thread.sleep(2000); // time 2sec
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		Thread.sleep(2000);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	
		Thread.sleep(2000);
		//shift for upper case letter
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_H);
		rb.keyRelease(KeyEvent.VK_H);
		rb.keyRelease(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_E);
		rb.keyRelease(KeyEvent.VK_E);
		rb.keyPress(KeyEvent.VK_L);
		rb.keyRelease(KeyEvent.VK_L);
		rb.keyPress(KeyEvent.VK_L);
		rb.keyRelease(KeyEvent.VK_L);
		rb.keyPress(KeyEvent.VK_O);
		rb.keyRelease(KeyEvent.VK_O);
		
		rb.keyPress(KeyEvent.VK_SPACE);
		rb.keyRelease(KeyEvent.VK_SPACE);
	
		rb.keyPress(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_W);
		rb.keyRelease(KeyEvent.VK_W);
		rb.keyRelease(KeyEvent.VK_SHIFT);
		rb.keyPress(KeyEvent.VK_O);
		rb.keyRelease(KeyEvent.VK_O);
		rb.keyPress(KeyEvent.VK_R);
		rb.keyRelease(KeyEvent.VK_R);
		rb.keyPress(KeyEvent.VK_L);
		rb.keyRelease(KeyEvent.VK_L);
		rb.keyPress(KeyEvent.VK_D);
		rb.keyRelease(KeyEvent.VK_D);
		
		Thread.sleep(1000);
	
		// save file win+s
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_S);
		rb.keyRelease(KeyEvent.VK_S);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		
		Thread.sleep(1000);
		// word save file select option
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_DOWN);
		rb.keyRelease(KeyEvent.VK_DOWN);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		rb.keyPress(KeyEvent.VK_TAB);
		rb.keyRelease(KeyEvent.VK_TAB);
		
		Thread.sleep(1000);
		
		//file save name
		rb.keyPress(KeyEvent.VK_J);
		rb.keyRelease(KeyEvent.VK_J);
		rb.keyPress(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_A);
		rb.keyPress(KeyEvent.VK_V);
		rb.keyRelease(KeyEvent.VK_V);
		rb.keyPress(KeyEvent.VK_A);
		rb.keyRelease(KeyEvent.VK_A);
		rb.keyPress(KeyEvent.VK_R);
		rb.keyRelease(KeyEvent.VK_R);
		rb.keyPress(KeyEvent.VK_O);
		rb.keyRelease(KeyEvent.VK_O);
		rb.keyPress(KeyEvent.VK_B);
		rb.keyRelease(KeyEvent.VK_B);
		rb.keyPress(KeyEvent.VK_O);
		rb.keyRelease(KeyEvent.VK_O);
		rb.keyPress(KeyEvent.VK_T);
		rb.keyRelease(KeyEvent.VK_T);
		//dot mark
		rb.keyPress(KeyEvent.VK_PERIOD);
		rb.keyRelease(KeyEvent.VK_PERIOD);
		rb.keyPress(KeyEvent.VK_D);
		rb.keyRelease(KeyEvent.VK_D);
		rb.keyPress(KeyEvent.VK_O);
		rb.keyRelease(KeyEvent.VK_O);
		rb.keyPress(KeyEvent.VK_C);
		rb.keyRelease(KeyEvent.VK_C);	
		rb.keyPress(KeyEvent.VK_X);
		rb.keyRelease(KeyEvent.VK_X	);
		
		//time 2sec
		Thread.sleep(2000);
		
		//enter key
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	}

}
