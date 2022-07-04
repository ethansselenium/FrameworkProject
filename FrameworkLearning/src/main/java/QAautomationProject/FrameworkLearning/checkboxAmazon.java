package QAautomationProject.FrameworkLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class checkboxAmazon {

	public static void main(String[] args)
	{
		

WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		WebElement Mobiles = driver.findElement(By.xpath("//a[text()='Mobiles']"));
		Mobiles.click();
		//WebElement samsung = driver.findElement(By.xpath("//span[text() = 'Samsung' and @class = 'a-size-base a-color-base']"));
		
	WebElement samsung = driver.findElement(By.cssSelector("#s-refinements > div:nth-child(5) > ul > li:nth-child(7) > span > a > span"));
	//in above we can do with css selector also rathar then xpath.both working	
	if (samsung.isSelected())
		{
			System.out.println("checkbox on");
		}
		else 
			
		{System.out.println("checkbox off");
		}
			samsung.click();
			
	}

}
