package Common;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;

public class CommonActions_Login {
	public static String URL="https://qa-pulse.gartner.com/Pulse/";
	public static WebElement Username;
	public static WebElement Password;
	public static String username="vbathija@cebglobal.com";
	public static String password="Sairam@34";
	public static WebElement Signin;
	public static WebElement Account;
	public static WebElement SelectAccount;
	public void Login(WebDriver driver)
	{
		driver.get(URL);
		driver.manage().window().maximize();
		Username=driver.findElement(By.id("j_username"));
		Password=driver.findElement(By.id("j_password"));
		Signin=driver.findElement(By.xpath("//button[@class='width-100 btn btn-primary pull-right']"));
		Username.sendKeys(username);
		Password.sendKeys(password);
		Signin.click();
	}
   public void Account_Select(WebDriver driver)
   {
	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 Account=driver.findElement(By.id("SelectedUserAccountCode"));
	 Select dropdown=new Select(Account);
	  dropdown.selectByVisibleText("Account_ test");
	  SelectAccount=driver.findElement(By.xpath("//button[contains(text(),'Select')]"));
	  SelectAccount.click();
   }
	
}
