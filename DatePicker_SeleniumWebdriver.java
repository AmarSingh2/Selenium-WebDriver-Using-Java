package com.selenium.Selenium_Webdriver_project_Restart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class DatePicker_SeleniumWebdriver {

	public static void main(String[] args) {
		
		// Creating the instance of WebDriver interface and opening the url and maximizing the window
		WebDriver driver = new EdgeDriver();
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();
		
		// Now switching to iframe window because the date picker is inside the iframe 
		driver.switchTo().frame(0);
		
		// Now clicking on the webelement of date picker
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		// Navigating to next month of feb by clciking on the next button
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
		
		// Clicking on the desired date
		driver.findElement(By.xpath("//body[1]/div[1]/table[1]/tbody[1]/tr[3]/td[6]")).click();
		
		driver.close();
	}

}
