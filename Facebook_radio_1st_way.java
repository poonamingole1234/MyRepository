package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebook_radio_1st_way {

	public static void main(String[] args) throws Exception {
		WebDriver driver=Browser.open_chrome_browser("https://www.facebook.com/signup");
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		Thread.sleep(3000);
		

	}

}
