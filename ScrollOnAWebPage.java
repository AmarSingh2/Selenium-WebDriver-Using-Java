package com.selenium.Selenium_Webdriver_project_Restart;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class ScrollOnAWebPage {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.calculator.net/");
		driver.manage().window().maximize();
		
		/*
		//Thread.sleep(5000);
		// Scrolling the webpage vertically by 500 pixel 
		// Here we are using JavascriptExecutor for scrolling vertically in the webpage and we are creating instance of JavascriptExecutor interface 
		 * and WebDriver is also interface in selenium Webdriver so we have to typecast the driver instance 
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)");
		
		// Using Thread.sleep method for 5 seconds for synchronization
		Thread.sleep(5000);
		*/
		
		/*
		// Scrolling through webpage on the basis of visibility of webelement
		WebElement ele = driver.findElement(By.xpath("//a[normalize-space()='Sales Tax Calculator']"));
		JavascriptExecutor jse1 = (JavascriptExecutor) driver;
		jse1.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", ele);
		//jsExecutor.executeScript("arguments[0].scrollIntoView({block: 'center', inline: 'center'});", element);
		
		Thread.sleep(5000);
		*/
		
		/*
		// Scrolling to the bottom of the webpage 
		JavascriptExecutor jse2= (JavascriptExecutor) driver;
		jse2.executeScript("window.scrollTo(0, document.body.scrollHeight);");
		
		Thread.sleep(5000);
		*/
		
		// Scroll Horizontally to the web element in a webpage
		WebElement element = driver.findElement(By.xpath("xpath for web element present in the webpage"));
		JavascriptExecutor jse4=(JavascriptExecutor) driver;
		jse4.executeScript("arguments[0].scrollIntoView({behavior: 'auto', block: 'center', inline: 'center'});", element);
		//jsExecutor.executeScript("arguments[0].scrollIntoView({behavior: 'auto', block: 'center', inline: 'center'});", element);
		
		Thread.sleep(5000);
		driver.close();
	}

}
