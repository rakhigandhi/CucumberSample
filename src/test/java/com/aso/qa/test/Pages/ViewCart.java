package com.aso.qa.test.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aso.qa.test.utils.Selenium_Functions;

public class ViewCart {
WebDriver driver;
	
	public ViewCart(WebDriver driver) 
	{
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@data-auid='btnCheckout']")
	private WebElement btn_Checkout;

	public void clickOnViewCartBtn(WebDriver driver) {

		Selenium_Functions.clickElement(driver, btn_Checkout);

	}

	public boolean verifyCheckoutButton(WebDriver driver)
	{
		return Selenium_Functions.isElementPresent(driver, btn_Checkout) ;		
	}
	
	public boolean verifyCheckoutBtnText(WebDriver driver)
	{
		return btn_Checkout.getText().equalsIgnoreCase("checkout") ;		
	}
	
}
