package com.selenium.Selenium_Webdriver_project_Restart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Handling_different_alert {

	public static void main(String[] args) {

		
		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/alerts");
		
		driver.manage().window().maximize();
		
		/*
		// Handling simple alert 
		driver.findElement(By.xpath("//button[@id='alertButton']")).click();
		
		driver.switchTo().alert().accept();
		*/
		
		/*
		// Handling confirmation alert
		driver.findElement(By.xpath("//button[@id='confirmButton']")).click();
		
		driver.switchTo().alert().accept(); // for accepting
		driver.switchTo().alert().dismiss(); // for dismissing
		*/
		
		// Handling prompt alert
		driver.findElement(By.xpath("//button[@id='promtButton']")).click();
		
		//Entering the string in the prompt alert
		driver.switchTo().alert().sendKeys("Amar");
		
		//Accepting the alert
		driver.switchTo().alert().accept();
	}

}
