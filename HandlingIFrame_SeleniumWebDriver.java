package com.selenium.Selenium_Webdriver_project_Restart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingIFrame_SeleniumWebDriver {

	public static void main(String[] args) {

		// Creating instance of WebDriver interface 
		WebDriver driver = new EdgeDriver();
		
		// open url and maximize the window
		driver.get("https://demoqa.com/nestedframes");
		driver.manage().window().maximize();
		
		/*	
		List<WebElement> list	= driver.findElements(By.tagName("iframe"));
		System.out.println(list.size());
		//System.out.println(list.getClass());
		*/
		
		/*
		// switching in iframe using index of iframe
		driver.switchTo().frame(3);
		WebElement ele = driver.findElement(By.id("sampleHeading"));
		System.out.println(ele.getText());
		*/
		
		/*
		// switching in iframe by using webelement
		WebElement ele1 = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(ele1);
		
		WebElement ele2 = driver.findElement(By.id("sampleHeading"));
		System.out.println(ele2.getText());
		*/
		
		// Handling Nester iFrame
		// Switch to parent frame and then find element by tagname and print the text by using getText() method
		driver.switchTo().frame(3);
		WebElement ele3 = driver.findElement(By.tagName("body"));
		System.out.println(ele3.getText());
		
		// Now switch to child frame inside the parent frame and we used here frame index and by using tagname "p" and we are printing the text in it
		driver.switchTo().frame(0);
		WebElement ele4 = driver.findElement(By.tagName("p"));
		System.out.println(ele4.getText());
		
	    driver.close();
		
	}

}
