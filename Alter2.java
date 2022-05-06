package Facebook;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Alter2 {
	
	public static void main(String[] args) throws InterruptedException {
		
	

	WebDriver driver=Browser.open_chrome_browser("https://the-internet.herokuapp.com/javascript_alerts");
	
	driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
	Thread.sleep(3000);
	
	Alert a=driver.switchTo().alert();
	
	Thread.sleep(5000);
	//a.accept();
	a.sendKeys("velocity");
//	Thread.sleep(3000);
	a.accept();
	//Thread.sleep(3000);

}

}