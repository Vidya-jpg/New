package Common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CommonActions_UI {
	public void ClickElementwithXpath(WebDriver driver,String xpath)
	{
		driver.findElement(By.xpath(xpath)).click();
		
	}

}
