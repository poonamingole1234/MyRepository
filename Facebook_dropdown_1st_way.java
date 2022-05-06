package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Facebook_dropdown_1st_way {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=Browser.open_chrome_browser("https://www.facebook.com/signup");
		
		WebElement wb= driver.findElement(By.xpath("//select[@id='day']"));
		Select day = new Select (wb);
		
		Thread.sleep(3000);
		day.selectByVisibleText("25");
		
		Thread.sleep(3000);
		day.selectByIndex(0);
		
		Thread.sleep(3000);
		day.selectByValue("28");
		
		
		

	}

}
