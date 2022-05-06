package Facebook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Facebook_sigup_page {

	public static void main(String[] args) throws Exception {

		WebDriver driver=Browser.open_chrome_browser("https://www.facebook.com/");
	//	WebDriver driver=Browser.open_chrome_browser("https://www.facebook.com/signup");
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("poonam");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("14556");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("poonamingoleW@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='reg_passwd__']")).sendKeys("45678987");
		
		WebElement wb = driver.findElement(By.xpath("//select[@id='day']"));
		Select day = new Select(wb);
		
		day.selectByIndex(2);
		
		driver.findElement(By.xpath("//input[@value='1']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='2']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@value='-1']")).click();
		Thread.sleep(3000);
		
		

	}

}
