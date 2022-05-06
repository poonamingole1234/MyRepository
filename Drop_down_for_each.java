package Facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Drop_down_for_each {

	public static void main(String[] args) {

		WebDriver driver=Browser.open_chrome_browser("https://www.facebook.com/signup");
		List<WebElement> days = driver.findElements(By.xpath("//select[@id='day']//option"));
		int size= days.size();
		System.out.println(size);
//		String expected_result= "10";
		
		for(WebElement alldays : days)
		{
			if(alldays.getText().equals("10"))
			alldays.click();
		}
	
		List<WebElement> months = driver.findElements(By.xpath("//select[@id='month']//option"));
		int size1= months.size();
		System.out.println(size1);
//		String expected_result= "Jan";
		
		for(WebElement allmonths : months)
		{
			if(allmonths.getText().equals("Jan"))
				allmonths.click();
		}
		
		List<WebElement> years = driver.findElements(By.xpath("//select[@id='year']//option"));
		int size2= years.size();
		System.out.println(size2);
//		String expected_result= "1995";
		
		for(WebElement allyears : years)
		{
			if(allyears.getText().equals("1995"))
				allyears.click();
		}
	}
}