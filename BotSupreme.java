
package bot;
import java.awt.Desktop;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.net.URI;

public class BotSupreme {
	public static void main(String[] args) {
		try {
			Robot bot = new Robot();
			Desktop desk = Desktop.getDesktop();
			desk.browse(new URI("http://www.supremenewyork.com"));
			bot.delay(400);
			bot.mouseMove(700, 590);
			bot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
			bot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}
}
