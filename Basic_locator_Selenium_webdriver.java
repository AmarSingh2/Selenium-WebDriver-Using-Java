package com.selenium.Selenium_Webdriver_project_Restart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Basic_locator_Selenium_webdriver {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.saucedemo.com/v1/");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.className("btn_action")).click();
		
		String str = driver.getWindowHandle();
		driver.switchTo().window(str);
		
		List<WebElement> elementSize =driver.findElements(By.partialLinkText("Sauce"));
		System.out.println("Toatl element size in sauce lab website : " +elementSize.size());
		
		
	}

}
