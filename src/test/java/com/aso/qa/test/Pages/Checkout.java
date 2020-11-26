package com.aso.qa.test.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aso.qa.test.utils.Selenium_Functions;

public class Checkout {
	WebDriver driver;
	
	public Checkout(WebDriver driver) 
	{
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//*[@data-auid='checkout_shipping_address_first_name']")
	private WebElement txtbx_ShippingAddressFirstName;

	@FindBy(xpath = "//*[@data-auid='checkout_shipping_address_last_name']")
	private WebElement txtbx_ShippingAddressLastName;

	@FindBy(xpath = "//*[@data-auid='checkout_shipping_address_phone_number']")
	private WebElement txtbx_ShippingAddressPhoneNbr;

	@FindBy(xpath = "//*[@data-auid='checkout_shipping_address_address']")
	private WebElement txtbx_ShippingAddressLine1;

	@FindBy(xpath = "//*[@data-auid='checkout_shipping_address_zip_code']")
	private WebElement txtbx_ShippingAddressZipCode;

	@FindBy(xpath = "//*[@data-auid='btncheckout_goto_shipping_method_btn']")
	private WebElement btn_GoToPayment;

	
	
	public void enterValueInShippingAddressFirstName(WebDriver driver, String text) {

		Selenium_Functions.enterText(driver, txtbx_ShippingAddressFirstName, text);

	}

	public void enterValueInShippingAddressLastName(WebDriver driver, String text) {

		Selenium_Functions.enterText(driver, txtbx_ShippingAddressLastName, text);

	}

	public void enterValueInShippingAddressPhoneNbr(WebDriver driver, String text) {

		Selenium_Functions.enterText(driver, txtbx_ShippingAddressPhoneNbr, text);

	}

	public void enterValueInShippingAddressLine1(WebDriver driver, String text) {

		Selenium_Functions.enterText(driver, txtbx_ShippingAddressLine1, text);

	}

	public void enterValueInShippingAddressZipCode(WebDriver driver, String text) {

		Selenium_Functions.enterText(driver, txtbx_ShippingAddressZipCode, text);

	}

}
