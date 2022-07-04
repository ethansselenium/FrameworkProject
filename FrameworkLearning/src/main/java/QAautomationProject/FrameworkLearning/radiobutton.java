package QAautomationProject.FrameworkLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class radiobutton {

	public static void main(String[] args)
	
	{

		
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
	
		driver.get("https://demoqa.com/radio-button");
		driver.manage().window().maximize();
		
		WebElement Radio = driver.findElement(By.xpath("//label[@for = 'impressiveRadio']"));
		Boolean selectstate = Radio.isSelected();
		   System.out.println(selectstate                                      );

	}

}
