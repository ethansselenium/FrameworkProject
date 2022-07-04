package QAautomationProject.FrameworkLearning;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Flipkart {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();
		Browserlaunch(driver);
		Login(driver);
		Grocery(driver);
		Addtocart(driver);
		Removecart(driver);
		Searchbox(driver);
		LogoutBrowser(driver);
		
	}
	
	
	
	public static void Browserlaunch(WebDriver driver)
	{
	
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}

	public static void Login(WebDriver driver) throws InterruptedException
	{
		
		WebElement login = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		login.sendKeys("7722032847");
		WebElement password = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		password.sendKeys("flipkart@123");
		
	
		WebElement logbutton = driver.findElement(By.xpath("//button[@type='submit' and @class = '_2KpZ6l _2HKlqd _3AWRsL']"));
		logbutton.click();
		/*WebElement disclaimer =  driver.findElement(By.className("_1Ijv5h"));
		String actual = disclaimer.getText();
		String expected = "By continuing, you agree to Flipkart's";
		
		Assert.assertEquals(expected, actual);*/
		
		Thread.sleep(1000);
	}
		    
	public static void Grocery(WebDriver driver) throws InterruptedException
	{
	
		WebElement gr = driver.findElement(By.xpath("//img[@alt = 'Grocery']"));
		gr.click();	
	
		Thread.sleep(2000);
		
		Boolean isPresent = driver.findElements(By.xpath("//div[@class='eFQ30H']/a/div[@class='_1psGvi SLyWEo']/div/div[@class='xtXmba' and text()='Packaged Food']")).size()>0;
		System.out.println(isPresent);
		System.out.println("helloNew");
	      //identify children
	    List<WebElement> ch = driver.findElements(By.xpath("//div[@id='container']/div/div[@class='_331-kn _2tvxW']/div[@class='InyRMC _3Il5oO']/div[@class='_37M3Pb']/div[@class='eFQ30H']"));
	      // iterate through sub elements
	      for ( WebElement i : ch ) {
	         // get text for children
		         //System.out.println(i.getText());
	    	  if(i.getText().equals("Packaged Food"))
	    	  {   	  
				Actions ac = new Actions(driver);
				System.out.println(i.getText());
				ac.moveToElement(i).build().perform();
	         //i.click();
	    	  }
	      }
		
	     
	    Thread.sleep(2000);
	    
		//Boolean isPresent1 = driver.findElements(By.xpath("//div[@class='_3XS_gI _7qr1OC']/a[@class='_6WOcW9' and text()='Jams & Honey']")).size()>0;
	//	System.out.println(isPresent1);
		System.out.println("hello");
		WebElement jam = driver.findElement(By.xpath("//div[@class='_3XS_gI _7qr1OC']/a[@class='_6WOcW9' and text()='Jams & Honey']"));
		jam.click();
		

	}
	
	
	
	public static void Addtocart(WebDriver driver ) throws InterruptedException
	{
		 
		//WebElement addd = driver.findElement(By.xpath("//div[@data-id='HNYEU6MGSMBZ45Z8']//div[@class='_2OvUl0 _1ZK7VC']//div[@class='_35mN4f']//div[@class='_3BhXPZ']//button[@class='_2KpZ6l GX4Kov']"));
		//addd.click();	
		// Thread.sleep(5000);
		WebElement add2 = driver.findElement(By.xpath("//div[@data-id='JASEUHE3RX6RAVFG']/div[@class='_2OvUl0 _1ZK7VC']/div[@class='_35mN4f']/div[@class='_3BhXPZ']/button[@class='_2KpZ6l GX4Kov']"));
		add2.click();
		 Thread.sleep(5000);
	WebElement addtocart = driver.findElement(By.xpath("//div[@class='_1psGvi']/div[@class='YUhWwv']/a[@class='_3SkBxJ']"));
		addtocart.click();
		Thread.sleep(5000);
		
	}
	
	public static void Removecart(WebDriver driver) throws InterruptedException
	{
		WebElement removcart =	driver.findElement(By.xpath("//div[@class='_3dsJAO' and text() = 'Save for later']"));
		removcart.click();
		Thread.sleep(5000);
	}
	public static void Searchbox(WebDriver driver) throws InterruptedException
	{
		WebElement searchbox = driver.findElement(By.xpath("//input[@class=\"_3704LK\"]"));
		searchbox.sendKeys("soap");
		
		WebElement searchicon = driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\" and @type = 'submit']"));
		searchicon.click();
		
		
		Thread.sleep(5000);
	}
	
	public static void LogoutBrowser(WebDriver driver) throws InterruptedException
		{
		
		//String profilename = "vinay";
		
		WebElement Profile = driver.findElement(By.xpath(("//div[@class= 'exehdJ' and text()='vinay']")));
		Actions ac1 = new Actions(driver);
		ac1.moveToElement(Profile).build().perform();
		//ac1.click();
		
		
		Thread.sleep(5000);
		
		WebElement Logout = driver.findElement(By.xpath("//div[@class='_3vhnxf' and text()='Logout']"));
		Logout.click();
		
		}
	
	public static void BrowserQuit(WebDriver driver)
	{
	driver.close();
		
	}
	
}
	
	
