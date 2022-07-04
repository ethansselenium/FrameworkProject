package QAautomationProject.FrameworkLearning;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HomePageTest extends Flipkart 
{
	WebDriver driver;
	Flipkart flip;
	
	@BeforeMethod
	public void Launchbrowser()
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		Flipkart.Browserlaunch(driver);
		//test
	}
	
	@Test
	public void LoginCred() throws InterruptedException
	{
		Flipkart.Login(driver);
		
		
	}
	
	@AfterMethod
	public void Logout() throws InterruptedException
	{
		
		Flipkart.LogoutBrowser(driver);
		Flipkart.BrowserQuit(driver);
	
		
	}
	
	
	
	
}
