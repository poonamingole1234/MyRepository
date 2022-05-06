package Facebook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DropDown_list {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=Browser.open_chrome_browser("https://www.facebook.com/signup");
		
		List<WebElement> days = driver.findElements(By.xpath("//select[@id='day']//option"));
		int size= days.size();
		System.out.println(size);
		String expected_result= "25";
		
		for(int i=0;i<size;i++)// 0 to 30=31
		{
			if(days.get(i).getText().equalsIgnoreCase(expected_result))//0,1.25==1
			{
				days.get(i).click();//1 click
				System.out.println("selected");
			}
		}
		
		List<WebElement> months = driver.findElements(By.xpath("//select[@id='month']//option"));
		int size_month = months.size();
		System.out.println(size_month);
		String expected_result1= "Jul";
		
		for(int i=0;i<size_month;i++)
		{
			if(months.get(i).getText().equalsIgnoreCase(expected_result1))
			{
				months.get(i).click();
				System.out.println("months clicked");
			}
		}
		
		List<WebElement> years = driver.findElements(By.xpath("//select[@id='year']//option")); 
        int size_years = years.size();
        System.out.println(size_years);
        String expected_result3 = "1995";
        
        for(int i=0; i<size_years; i++)
        {
        	if(years.get(i).getText().equalsIgnoreCase(expected_result3))
        	{
        		years.get(i).click();
            	System.out.println("Selected");
        	}	
        }
	}

}
