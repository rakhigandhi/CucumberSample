package com.aso.qa.test.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aso.qa.test.utils.Selenium_Functions;

public class PDP {

WebDriver driver;
	
	public PDP(WebDriver driver) 
	{
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//div[@data-auid='PDP_OnlineMessage']")
	private WebElement btn_HomeDelivery;

	@FindBy(xpath = "//*[@data-auid='btnviewCart']")
	private WebElement btn_ViewCart;

	public void clickOnHomeDeliveryBtn(WebDriver driver) {

		Selenium_Functions.clickElement(driver, btn_HomeDelivery);

	}

	public void clickOnViewCartBtn(WebDriver driver) {

		Selenium_Functions.clickElement(driver, btn_ViewCart);

	}

}
