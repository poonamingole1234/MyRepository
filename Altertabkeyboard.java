package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Altertabkeyboard {

	public static void main(String[] args) {

		WebDriver driver=Browser.open_chrome_browser("https://demoqa.com/text-box");
		
		Actions act = new Actions(driver);
		
		WebElement fullname = driver.findElement(By.xpath("//input[@placeholder='Full Name']"));
		fullname.sendKeys("poonam");
		
		act.sendKeys(Keys.TAB);
		act.perform();
		
		act.sendKeys("poonam@gmail.com");
		act.perform();
		
		act.sendKeys(Keys.TAB);
		act.perform();
		
		act.sendKeys("Amravati");
		act.perform();
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("a");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		act.keyDown(Keys.CONTROL);
		act.sendKeys("c");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		act.sendKeys(Keys.TAB);
		act.keyDown(Keys.CONTROL);
		act.sendKeys("v");
		act.keyUp(Keys.CONTROL);
		act.perform();
		
		
		
		
	}

}
