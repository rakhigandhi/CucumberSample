package com.aso.qa.test.utils;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Selenium_Functions
{
	public static void waitForPageToLoad(WebDriver driver) {
        ExpectedCondition<Boolean> pageLoadCondition = new
                ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor)driver).executeScript("return document.readyState").equals("complete");
                    }
                };
        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(pageLoadCondition);
    }
	
	public static void enterText(WebDriver driver, WebElement elem, String text) {
		if (elem.isDisplayed()) {
		    elem.clear();
		    Selenium_Functions.sleepCode("100");
		    // Selenium_Functions.fireEventBlur(driver, elemLocator);
		    elem.sendKeys(text);
		    System.out.println("The text entered is: " + text);
		} else {
		    System.err.println("The object " + elem
			    + " is not available on the current page");
		    throw new IllegalStateException("The object " + elem
			    + " is not available on the current page");
		}
	    }
	
	public static void clickElement(WebDriver driver, WebElement elem) {
		
			try {
				if (elem.isDisplayed()) 
			    elem.click();
				else
				{
					WebDriverWait wait = new WebDriverWait(driver, 30);
					wait.until(ExpectedConditions.visibilityOf(elem));
					elem.click();
				}
				
			} catch (Exception e) {System.err.println("The object " + elem
				    + " is not available on the current page");
			    throw new IllegalStateException("The object " + elem
				    + " is not available on the current page");
		}
		
		}

	public static void sleepCode(String slTime) {
		try {
		    long L = Long.parseLong(slTime);
		    Thread.sleep(L);
		} catch (Exception e) {
		    System.err.println(e);
		}
	    }
	
	public static boolean isElementPresent(WebDriver driver, WebElement elem) {
		
		try {
			if (elem.isDisplayed()) 
		    return true;
			
		} catch (Exception e) {System.err.println("The object " + elem
			    + " is not available on the current page");
		    throw new IllegalStateException("The object " + elem
			    + " is not available on the current page");
	}
		return false;
	}

	public static void launchSite(WebDriver driver, String url) {
		if(url!=null)
			driver.get(url);
	}

}