package Facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Drag_drop_list2 {

	public static void main(String[] args) {

		WebDriver driver = Browser.open_chrome_browser("https://www.globalsqa.com/demo-site/draganddrop/");
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']")));
		
		List<WebElement> source = driver.findElements(By.xpath("//li[contains(@class,'ui-widget-content ui-corner-tr ui-draggable ')]"));
		
		WebElement destination = driver.findElement(By.xpath("//div[@id='trash']"));
		
		Actions act = new Actions(driver);
		
		for(int i=0;i<source.size();i++)
		{
			act.dragAndDrop(source.get(i), destination);
			act.perform();
		}
		
		

	}

}
