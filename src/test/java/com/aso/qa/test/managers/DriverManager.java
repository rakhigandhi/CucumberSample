package com.aso.qa.test.managers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {
	private WebDriver driver;

	private String env = FileReaderManager.getInstance().getConfigReader().getEnv();
	private String driverType = FileReaderManager.getInstance().getConfigReader().getBrowser();
	private Long implicit_Wait = FileReaderManager.getInstance().getConfigReader().getImplicitWait();

	public WebDriver getDriver() {
		if (driver == null)
			driver = createDriver();
		return driver;
	}

	private WebDriver createDriver() {
		switch (env.toUpperCase()) {
		case "LOCAL":
			driver = createLocalDriver();
			break;
		case "REMOTE":
			driver = createRemoteDriver();
			break;
		}
		return driver;
	}

	private WebDriver createRemoteDriver() {
		throw new RuntimeException("RemoteWebDriver is not yet implemented");
	}

	private WebDriver createLocalDriver() {
		switch (driverType.toUpperCase()) {
		case "CHROME":
			createChromeDriver();
			break;
		}
		driver.manage().timeouts().implicitlyWait(implicit_Wait, TimeUnit.SECONDS);
		return driver;
	}

	private void createChromeDriver() {
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();

		options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		options.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
		options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
		options.addArguments("start-maximized");
		options.addArguments("enable-automation");
		options.addArguments("--disable-popup-blocking");
		options.addArguments("-incognito");

		driver = new ChromeDriver(options);
		System.out.println("Browser Opened");
	}

	public void closeDriver() {
		if (driver == null) {
			System.out.println("no Browser opened");
		} else {
			driver.close();
			driver.quit();
		}

	}

}
