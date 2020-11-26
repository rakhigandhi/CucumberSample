package com.aso.qa.test.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class CaptureScreen {

public static void takeScreenShot(WebDriver webdriver, String fileWithPath) throws IOException {
		// Convert web driver object to TakeScreenshot

		TakesScreenshot scrShot = ((TakesScreenshot) webdriver);

		// Call getScreenshotAs method to create image file

		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

		File DestFile = new File(fileWithPath);

		// Copy file at destination
		try {
			FileUtils.copyFile(SrcFile, DestFile);
		}

		catch (IOException e) {
			System.out.println(e.getMessage());

		}
		SrcFile.delete();
	}


}
