package Facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Closedriver {


		public static void main(String[] args) throws Exception {
			System.setProperty("webdriver.chrome.driver", "F:\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://accounts.google.com/ServiceLogin/signinchooser?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
			driver.manage().window().maximize();
			Thread.sleep(5000);
			
			driver.findElement(By.xpath("//a[@href='https://support.google.com/accounts?hl=en-GB']")).click();
	
			
			Thread.sleep(4000);
		    driver.close();


	}

}
