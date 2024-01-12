package com.selenium.Selenium_Webdriver_project_Restart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Upload_file_Webpage {

	public static void main(String[] args) {

		
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/upload-download"); 
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\bhumi\\OneDrive\\Desktop\\Hotel Bookings.csv");
	}

}
