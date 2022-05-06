package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Explicit_wait_code {

	public static void main(String[] args) {

        WebDriver driver=Browser.open_chrome_browser("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[@id='alert']")).click();
		WebDriverWait wait=new WebDriverWait(driver,3);
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
		

	}

}
