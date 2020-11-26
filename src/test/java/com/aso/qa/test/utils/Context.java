package com.aso.qa.test.utils;

import com.aso.qa.test.managers.DriverManager;
import com.aso.qa.test.managers.PageObjectManager;

public class Context {
	
	DriverManager driverMgr;
	PageObjectManager pageObjMgr;
	
	public Context(){
		driverMgr = new DriverManager();
		pageObjMgr = new PageObjectManager(driverMgr.getDriver());
		 }	
	
	public DriverManager getDriverMgr()
	{
		return driverMgr;
	}

	public PageObjectManager getPageObjectMgr()
	{
		return pageObjMgr;
	}
	
}
