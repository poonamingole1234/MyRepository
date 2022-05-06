package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop_list {

	public static void main(String[] args) {

		WebDriver driver = Browser.open_chrome_browser("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		
		WebElement source =driver.findElement(By.xpath("(//li[contains(@class,'ui-widget-content ui-corner-tr ui-draggable ')])[1]"));
		
		WebElement destination = driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(source, destination);
		act.perform();
		
		

	}

}
