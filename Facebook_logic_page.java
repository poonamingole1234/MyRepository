package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Facebook_logic_page {

	public static void main(String[] args) throws Exception {
		
		//call open_chrome_browser static method by using class name 
		WebDriver driver=Browser.open_chrome_browser("https://www.facebook.com/");// give login page url
		
		driver.manage().window().maximize(); // maximize the window
		Thread.sleep(3000);
	//	driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("poonam@gmail.com");
		driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("p1234567");
		driver.findElement(By.xpath("//button[@name='login']")).click();
		
	}

}
