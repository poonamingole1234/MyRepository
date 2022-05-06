package Facebook;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alert_operation {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=Browser.open_chrome_browser("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		
		Alert a = driver .switchTo().alert();
		
		Thread.sleep(3000);
		
		//a.accept();
		
		Thread.sleep(3000);
		
		a.dismiss();
		
	}

}
