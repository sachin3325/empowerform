package runnerpack;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Sachithanandhan.S\\eclipse-workspace3\\Testing\\src\\test\\resources\\featurefiles\\parent_Reg.feature",
                 glue="stepdefinitions",plugin= {"pretty","json:target/cucumber-reports/Cucumber.json"},
                 publish=true)


public class Runnerclass 
{
	
	//plugin= {"pretty","html:target/parentreg.html",
 	 // "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
	 
}
