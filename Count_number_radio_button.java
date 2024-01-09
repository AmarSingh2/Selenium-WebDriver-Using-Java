package com.selenium.Selenium_Webdriver_project_Restart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Count_number_radio_button {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.get("https://demo.seleniumeasy.com/basic-radiobutton-demo.html");
		
		driver.manage().window().maximize();
		
		List<WebElement> list = driver.findElements(By.tagName("input"));
		System.out.println("Total number of radio button " +list.size());
		
		driver.close();
		
	}

}
