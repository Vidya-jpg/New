package Common;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class CommonActions_Analyze {
	public void AddMySurveyComparison(WebDriver driver)
	{
		CommonActions_UI c=new CommonActions_UI();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		c.ClickElementwithXpath(driver, "//button[contains(text(),'Add Comparison Segments')]");
		c.ClickElementwithXpath(driver, "(//div[contains(text(),'My Survey')])[2]");
		c.ClickElementwithXpath(driver, "(//button[@class='mdc-button mdc-button--dense mdc-button--raised'])[3]");
	}

}
