package Common;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public static WebElement Survey;
	public static WebElement SurveySearch;

	public static void NavigateToAnalyze(WebDriver driver,String SurveyName)
	{
		CommonActions_UI.ClickElementwithXpath(driver, "//a[contains(text(),'"+SurveyName+"')]");
	}
	public static void SearchInHomePage(WebDriver driver, String SurveyName)
	{
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		CommonActions_UI.ClickElementwithID(driver,"my-text-field" );
		//SurveySearch.sendKeys(SurveyName);
		SurveySearch=driver.findElement(By.id("my-text-field"));
		SurveySearch.sendKeys(SurveyName);
		CommonActions_UI.ClickElementwithCssSelector(driver, ".shl-icon_search");
	}
	
	
}
