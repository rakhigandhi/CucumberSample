package com.aso.qa.test.web.stepdefs;

import org.openqa.selenium.WebDriver;
import com.aso.qa.test.Pages.PDP;
import com.aso.qa.test.utils.Context;
import com.aso.qa.test.utils.Selenium_Functions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PDPStepDefs {
	
	PDP pdpObj;
	Context testContext;
	WebDriver driver;

	public PDPStepDefs(Context context) {
		 testContext = context;
		 driver = testContext.getDriverMgr().getDriver();
		 pdpObj = testContext.getPageObjectMgr().getPDP();
		 }
	
	@When("^click Home Delivery button on PDP$")
	public void click_Home_Delivery_button_on_PDP() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   pdpObj.clickOnHomeDeliveryBtn(driver);
	   Selenium_Functions.waitForPageToLoad(driver);
	}

	@When("^Click on View Cart button$")
	public void click_on_View_Cart_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	  pdpObj.clickOnViewCartBtn(driver);
	  Selenium_Functions.waitForPageToLoad(driver);
	}

}
