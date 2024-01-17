package com.selenium.Selenium_Webdriver_project_Restart;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Stopwatch;

public class ExplicitWait_SeleniumWebdriver {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		
		// Open url of amazon site
		driver.get("https://www.amazon.in/?tag=msndeskstdin-21&ref=pd_sl_7n32aeqqe4_e&adgrpid=1315017564951826&hvadid=82188862025546&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=156924&hvtargid=kwd-82189528219307:loc-90&hydadcr=14452_2334185");
		
		//After opening the url we maximize the window 
		driver.manage().window().maximize();
		
		// Here we are using explicit wait for particular web element to be stop for 5 seconds 
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		// For checking if the exception is thrown after 5 second we are using stopwatch class
		Stopwatch watch = null;
		
		// Here we are using try catch block because we purposely using wrong xpath for the webelement and calculating the time 
		try {
			watch = Stopwatch.createStarted();
			WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[id='nav-link-accountList']")));
			element.click();
		}
		
		catch(Exception e) {
			System.out.println(e);
			watch.stop();
			System.out.println(watch.elapsed(TimeUnit.SECONDS) + "Seconds"); // Here we can get the exact time of the webelemnt is visible or not 
			
		}
		
		driver.close();
	}

}
