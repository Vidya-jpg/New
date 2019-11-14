package Common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonActions_UI {
	public static void ClickElementwithXpath(WebDriver driver,String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
		
	}
	public static void ClickElementwithCssSelector(WebDriver driver, String selector)
	{
		driver.findElement(By.cssSelector(selector)).click();
	}

	public static void ClickElementwithID(WebDriver driver,String selector)
	{
		driver.findElement(By.id(selector)).click();
	}
}
