package Common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public static WebElement Survey;

	public void NavigateToAnalyze(WebDriver driver,String SurveyName)
	{
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		Survey=driver.findElement(By.xpath("//a[contains(text(),SurveyName)]"));
		Survey.click();
	}
	
	
}
