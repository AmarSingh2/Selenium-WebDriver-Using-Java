package com.selenium.Selenium_Webdriver_project_Restart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Count_number_Hyperlink_website {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.calculator.net/");
		
		driver.manage().window().maximize();
		List<WebElement> list =driver.findElements(By.tagName("a"));
		
		for(WebElement webele : list) {
			System.out.println(webele.getText());
		}
		System.out.println(list.size());	
	}
}
