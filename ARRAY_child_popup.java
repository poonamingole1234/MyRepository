package Facebook;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ARRAY_child_popup {

	public static void main(String[] args)
	{
		WebDriver driver = Browser.open_chrome_browser("https://vctcpune.com/");
		
		WebElement selenium=driver.findElement(By.xpath("//a[text()='Start Selenium Practice'][1]"));
		selenium.click();
		selenium.click();
		selenium.click();
		

		ArrayList<String> list = new ArrayList(driver.getWindowHandles());
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		
		driver.switchTo().window(list.get(1));
		
		driver.findElement(By.xpath("//input[@value='Radio1']")).click();
	}

}
