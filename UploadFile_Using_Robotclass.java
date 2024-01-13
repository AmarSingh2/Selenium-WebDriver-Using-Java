package com.selenium.Selenium_Webdriver_project_Restart;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class UploadFile_Using_Robotclass {

	public static void main(String[] args) throws AWTException {

		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/upload-download");
		
		driver.manage().window().maximize();
		
		WebElement element = driver.findElement(By.xpath("//input[@id='uploadFile']"));
		
		Actions act = new Actions(driver);
		act.click(element).click().perform();
		
		Robot rb = new Robot();
		rb.delay(4000);
		
		//copy file to clipboard
		StringSelection ss = new StringSelection("C:\\Users\\bhumi\\OneDrive\\Desktop\\Hotel Bookings.csv");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
		
		
		
		
	}

}
