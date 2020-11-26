package com.aso.qa.test.web.stepdefs;

import org.openqa.selenium.WebDriver;

import com.aso.qa.test.Pages.GlobalHeader;
import com.aso.qa.test.managers.FileReaderManager;
import com.aso.qa.test.testDataType.SKU;
import com.aso.qa.test.utils.Context;
import com.aso.qa.test.utils.Selenium_Functions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class HomeStepDefs {

	Context testContext;
	GlobalHeader gblHeaderObj;
	WebDriver driver;

	public HomeStepDefs(Context context) {
		 testContext = context;
		 driver = testContext.getDriverMgr().getDriver();
		 gblHeaderObj = testContext.getPageObjectMgr().getGlobalHeader();
		 }
	
	
	@Given("^user navigates to site$")
	public void user_navigates_to_site() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Selenium_Functions.launchSite(driver, FileReaderManager.getInstance().getConfigReader().getApplicationUrl());
		Selenium_Functions.waitForPageToLoad(driver);
	}
	
	@When("^search for a product and view PDP page$")
	public void search_for_a_product_and_view_PDP_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    gblHeaderObj.enterValueInSearchTxtbx(driver, "109383210");   
	    gblHeaderObj.clickOnSearchBtn(driver);
	    Selenium_Functions.waitForPageToLoad(driver);
	}

	@When("^search for a (\\d+) and view PDP page$")
	public void search_for_a_and_view_PDP_page(String id) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    SKU product = FileReaderManager.getInstance().getJsonReader().getSkuById(id);   
	    gblHeaderObj.enterValueFromDataJSON(driver, product);   
	    gblHeaderObj.clickOnSearchBtn(driver);
	    Selenium_Functions.waitForPageToLoad(driver);
	    
	}
}
