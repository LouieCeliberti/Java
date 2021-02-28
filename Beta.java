package bot;
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class Beta {

		public static void main(String[] args) {
			 
			try {
			    Robot bot = new Robot();
			    
				bot.mouseMove(250, 100);
				bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
				bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
				
				bot.mouseMove(250, 230);
				bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
				bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
				
				bot.mouseMove(475, 55);
				bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
				bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
				
				bot.delay(500);
				bot.keyPress(KeyEvent.VK_R);
				bot.keyPress(KeyEvent.VK_O);
				bot.keyPress(KeyEvent.VK_B);
				bot.keyPress(KeyEvent.VK_O);
				bot.keyPress(KeyEvent.VK_T);
				bot.keyPress(KeyEvent.VK_ENTER);
			   
				bot.mouseMove(475, 700);
				bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
				bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
				bot.delay(1000);
				bot.keyPress(KeyEvent.VK_M);
				bot.keyPress(KeyEvent.VK_A);
				bot.keyPress(KeyEvent.VK_I);
				bot.keyPress(KeyEvent.VK_N);
				bot.delay(10);
				bot.keyPress(KeyEvent.VK_CONTROL);
				bot.keyPress(KeyEvent.VK_SPACE);
				bot.keyPress(KeyEvent.VK_ENTER);
				
			} catch (AWTException e) {
				// TODO Auto-generated catch 
				
				e.printStackTrace();
			}
			
		}
}
