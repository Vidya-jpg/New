package Driver;
import Common.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ReportTest {
	@Test
	public void AddComparisonCheck()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\vbathija\\source\\git repository\\packages\\Selenium.WebDriver.ChromeDriver.2.45.0\\driver\\win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		CommonActions_Login cl=new CommonActions_Login();
		cl.Login(driver);
		cl.Account_Select(driver);
		HomePage hp=new HomePage();
		hp.NavigateToAnalyze(driver, "Benchmark Bug Validation");
		CommonActions_Analyze ca=new CommonActions_Analyze();
		ca.AddMySurveyComparison(driver);
	}

}
