package com.aso.qa.test.web.stepdefs;

import org.openqa.selenium.WebDriver;

import com.aso.qa.test.Pages.PDP;
import com.aso.qa.test.Pages.ViewCart;
import com.aso.qa.test.utils.Context;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class ViewCartStepDefs {

	WebDriver driver;
	ViewCart viewCartObj;
	
	Context testContext;

	public ViewCartStepDefs(Context context) {
		 testContext = context;
		 driver = testContext.getDriverMgr().getDriver();
		 viewCartObj = testContext.getPageObjectMgr().getViewCart();
		 }
	
	@Then("^Checkout button should be displayed on View cart page$")
	public void checkout_button_should_be_displayed_on_View_cart_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertTrue(viewCartObj.verifyCheckoutButton(driver));
	}
	
	
	@Then("^checkout button text is checkout$")
	public void checkout_button_text_is_checkout() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertTrue(viewCartObj.verifyCheckoutBtnText(driver));
	}

}
