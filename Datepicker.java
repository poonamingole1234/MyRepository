package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Datepicker {

	public static void main(String[] args) {

		WebDriver driver=Browser.open_chrome_browser("http://demo.automationtesting.in/Datepicker.html");

		driver.findElement(By.xpath("//input[@id='datepicker2']")).click();
		
		WebElement year = driver.findElement(By.xpath("//select[@class='datepick-month-year'][2]"));
		year.click();
		
		
		
	}

}
