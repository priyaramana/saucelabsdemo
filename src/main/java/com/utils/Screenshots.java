package com.utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshots {

	WebDriver driver;
	
	public String captureScreenshot() throws IOException {
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		String destpath = "/Users/lt535j/Desktop/Screenshot 2025-06-18 at 1.03.53 PM.png";
		File dest = new File(destpath,driver.getTitle());
		FileUtils.copyFile(src, dest);
		System.out.println(dest.getAbsolutePath());
		return destpath;
	}
}
