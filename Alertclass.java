package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Alertclass {

	public static void main(String[] args) {


		WebDriver driver=Browser.open_chrome_browser("http://demo.guru99.com/test/simple_context_menu.html");
		
		WebElement rightclick=driver.findElement(By.xpath("//span[text()='right click me']"));
		WebElement doubleclick=driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		
		
		Actions act = new Actions(driver);
		act.contextClick(rightclick);
		act.perform();
		
		act.doubleClick(doubleclick);
		act.perform();

	}

}
