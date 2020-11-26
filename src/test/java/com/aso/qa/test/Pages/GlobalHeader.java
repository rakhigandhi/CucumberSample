package com.aso.qa.test.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aso.qa.test.testDataType.SKU;
import com.aso.qa.test.utils.Selenium_Functions;

public class GlobalHeader {

	WebDriver driver;
	
	@FindBy(id = "search")
	private WebElement txtbx_Search;

	@FindBy(xpath = "//span[@class='academyicon icon-search']")
	private WebElement btn_Search;

	public GlobalHeader(WebDriver driver) 
	{
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	public void enterValueInSearchTxtbx(WebDriver driver, String text) {

		Selenium_Functions.enterText(driver, txtbx_Search, text);

	}

	public void clickOnSearchBtn(WebDriver driver) {

		Selenium_Functions.clickElement(driver, btn_Search);

	}

	public void enterValueFromDataJSON(WebDriver driver, SKU sku) {
		String text = sku.sku;
		Selenium_Functions.enterText(driver, txtbx_Search, text);

	}
}
