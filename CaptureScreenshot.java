package com.selenium.Selenium_Webdriver_project_Restart;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/text-box");
		
		driver.manage().window().maximize();
		
		/* Taking the whole screen as screenshot
		// Using the takesScreenshot class 
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		
		// Using getScreenshotAs and store it in a file 
		File src = screenshot.getScreenshotAs(OutputType.FILE);
		
		// Getting the file destination by using the file class 
		File dest = new File("D:\\GOT\\Selenium_Webdriver_project_Restart\\Screenshot\\ScreenshotFile1");
		
		// Using the fileUtils class and copy the file src and dest file for taking the screenshot 
		FileUtils.copyFile(src, dest);
		*/
		
		/* Taking the screenshot of particular web element
		WebElement ele = driver.findElement(By.xpath("//div[@id='userName-wrapper']"));
		TakesScreenshot screenshot1 = (TakesScreenshot) ele ;
		
		File src1 = screenshot1.getScreenshotAs(OutputType.FILE);
		
		File dest1 = new File("D:\\GOT\\Selenium_Webdriver_project_Restart\\Screenshot\\ScreenShot2");
		
		FileUtils.copyFile(src1, dest1);
		
		*/
		
		driver.close();
	}
}
