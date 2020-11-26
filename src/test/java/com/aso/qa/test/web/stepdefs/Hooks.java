package com.aso.qa.test.web.stepdefs;

import org.openqa.selenium.OutputType;
import com.aso.qa.test.utils.Context;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

	Context testContext;
	
	public Hooks(Context context) {
		 testContext = context;
		 }
	
	@Before
    public void setUp() {        
		testContext.getDriverMgr().getDriver();
    }

	@After
	public void closeBrowser() {
		testContext.getDriverMgr().closeDriver();
	}
	
	@After
	public void takeScreenshot(Scenario scenario) {
		scenario.log("scenario status --->" + scenario.getStatus());	
		scenario.log("Testing Thread  --->" + Thread.currentThread().getId());
//		   if (scenario.isFailed())
		   if(true){
			      // Take a screenshot...
			      final byte[] screenshot = ((TakesScreenshot) testContext.getDriverMgr().getDriver()).getScreenshotAs(OutputType.BYTES);
			   // embed it in the report.
			      scenario.attach(screenshot, "image/png", scenario.getName()); 
			      
			    }
	}
	
}
