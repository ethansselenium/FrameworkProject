package StepDefination;
import io.cucumber.java.en.Given

public class LoginStepDefination 

{
	@Given("^user is on login page$")
	public static void LaunchBrowser() 
	{
		
		System.out.println("I am in launchbrowser");
	}
	@When("^user enters credentials$")
	public static void Credentials()
	{
		System.out.println("I am adding credntials");	
	}
	
	@And ("^user click on login button$")
	public static void LoginButton()
	{
		System.out.println("I am in login button");
		
	}
	
	
	@Then ("^user is on home page$")
	public static void Homepage()
	{
		System.out.println("User is on homepage");
	}
	
	

	

}
