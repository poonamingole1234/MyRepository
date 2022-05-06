package Facebook;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alert1 {

	public static void main(String[] args) throws InterruptedException   {

         WebDriver driver=Browser.open_chrome_browser("https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		
		Alert a=driver.switchTo().alert();
		
		Thread.sleep(3000);
		//a.accept();
		
		//a.dismiss();
		
		System.out.println(a.getText());
	}

}
