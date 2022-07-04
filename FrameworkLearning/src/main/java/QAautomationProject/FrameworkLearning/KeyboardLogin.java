package QAautomationProject.FrameworkLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class KeyboardLogin {

	public static void main(String[] args) throws InterruptedException 
	
	{

WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		Thread.sleep(20);
	
		Select Allitems = new Select(driver.findElement(By.id("searchDropdownBox")));
		
		Allitems.selectByIndex(1);
		
		WebElement Searchicon = driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		Searchicon.click();
	
	}

}
