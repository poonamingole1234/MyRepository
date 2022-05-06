package Facebook;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

public class Call_pan {

	public static void main(String[] args) throws IOException {

		WebDriver driver =Browser.open_chrome_browser("https://www.facebook.com/");
		Screenshot_pan.Takescreeshot(driver, "screenshot");
	}

}
