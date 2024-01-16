package com.selenium.Selenium_Webdriver_project_Restart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Handling_ToolTip {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.facebook.com/login/?privacy_mutation_token=eyJ0eXBlIjowLCJjcmVhdGlvbl90aW1lIjoxNzA1NDA5ODAyLCJjYWxsc2l0ZV9pZCI6MzgxMjI5MDc5NTc1OTQ2fQ%3D%3D");     // //img[@alt='Tower Bridge']     images/tower-bridge.jpg
		
		driver.manage().window().maximize();
		
		 WebElement ele = driver.findElement(By.xpath("//a[@title='Sign up for Facebook']"));
		 String str = ele.getAttribute("title");
		 if(str.equals("Sign up for Facebook")) {
			 System.out.println("The test is passed");
		 }
		 
		 else {
			 System.out.println("The test is not passed");
		 }
	}

}
