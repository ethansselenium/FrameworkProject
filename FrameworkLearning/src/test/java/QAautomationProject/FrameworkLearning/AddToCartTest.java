package QAautomationProject.FrameworkLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AddToCartTest extends Flipkart
{
	WebDriver driver;
	Flipkart flip;
	
	@BeforeMethod
	public void Launchbrowser() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		Flipkart.Browserlaunch(driver);
		Flipkart.Login(driver);
	}
	
	@Test
	public void AddtoCart() throws InterruptedException
	{
		Flipkart.Grocery(driver);
		Flipkart.Addtocart(driver);	
	}
	

	@AfterMethod
	public void Logout() throws InterruptedException
	{
		
		Flipkart.LogoutBrowser(driver);
		Flipkart.BrowserQuit(driver);
	
		
	}
	
	
	
	
	

}
