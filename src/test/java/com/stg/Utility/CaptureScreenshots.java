package com.stg.Utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.Login_TestCase;

public class CaptureScreenshots {
	public static String capture(WebDriver driver, String screenshotName) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) Login_TestCase.driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String dest = System.getProperty("user.dir") + "/Errorscreenshot/ScreenShot" + screenshotName + ".png";
		File destination = new File(dest);
		FileUtils.copyFile(source, destination);
		return dest;

	}
}
