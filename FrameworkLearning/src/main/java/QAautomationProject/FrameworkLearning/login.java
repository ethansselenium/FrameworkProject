package QAautomationProject.FrameworkLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login {

	public static void main(String[] args)
	{
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		WebDriver driver1 = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver1.get("https://www.poki.com/");
		

	}

}
