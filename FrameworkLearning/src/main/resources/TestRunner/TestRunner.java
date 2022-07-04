package TestRunner;


import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		 features = "../FrameworkLearning/src/main/resources/Features"
		 ,glue = {"C:\\Users\\Ruchi Gupta\\eclipse-workspace\\FrameworkLearning\\src\\main\\resources\\StepDefination\\LoginStepDefination.java"}
		 ,plugin={"pretty","html:CucumberReport/cucumberhtml/destination.html","json:CucumberReport/cucumberjson/cucumber.json"
				 ,"junit:CucumberReport/cucumberxml/cucumber.xml","pretty:CucumberReport/cucumbertxt/cucumber-pretty.txt"}
		 ,monochrome=true
		 ,dryRun=true 
				 
		)


public class TestRunner {

}
