package com.selenium.Selenium_Webdriver_project_Restart;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait_Selenium_Webdriver {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		
		// Open url and maximize the window 
		driver.get("https://www.amazon.in/?tag=msndeskstdin-21&ref=pd_sl_7n32aeqqe4_e&adgrpid=1315017564951826&hvadid=82188862025546&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=156924&hvtargid=kwd-82189528219307:loc-90&hydadcr=14452_2334185");
		driver.manage().window().maximize();
		
		// Using fluent wait with the maximum time of 10 seconds and after every 2 seconds interval it will for the web element present in the web page  
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(10))
				.pollingEvery(Duration.ofSeconds(2))
				.ignoring(NoSuchElementException.class);
		
		// Using until method for checking the visibility of the web element 
			WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='nav-link-accountList']")));
			ele.click();
			
		// Closing the driver 
			driver.close();
	}

}
