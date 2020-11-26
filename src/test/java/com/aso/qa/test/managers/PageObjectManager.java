package com.aso.qa.test.managers;

import org.openqa.selenium.WebDriver;

import com.aso.qa.test.Pages.Checkout;
import com.aso.qa.test.Pages.GlobalHeader;
import com.aso.qa.test.Pages.PDP;
import com.aso.qa.test.Pages.ViewCart;

public class PageObjectManager {
	
	private WebDriver driver;
	private GlobalHeader gblHeaderObj;
	private PDP pdpObj;
	private ViewCart viewCartObj;
	private Checkout checkOutObj;
	
	public PageObjectManager(WebDriver driver) {
		 
		 this.driver = driver;
		 
		 }
	
	public GlobalHeader getGlobalHeader(){
		 
		 return (gblHeaderObj == null) ? gblHeaderObj = new GlobalHeader(driver) : gblHeaderObj;
		 
		 }
	public PDP getPDP(){
		 
		 return (pdpObj == null) ? pdpObj = new PDP(driver) : pdpObj;
		 
		 }

	public ViewCart getViewCart(){
		 
		 return (viewCartObj == null) ? viewCartObj = new ViewCart(driver) : viewCartObj;
		 
		 }
	
	public Checkout getCheckOut(){
		 
		 return (checkOutObj == null) ? checkOutObj = new Checkout(driver) : checkOutObj;
		 
		 }

}
