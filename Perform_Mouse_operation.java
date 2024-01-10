package com.selenium.Selenium_Webdriver_project_Restart;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Perform_Mouse_operation {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/buttons");
		
//		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		
		//WebElement element = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));  
		
		//WebElement element = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		
		WebElement element = driver.findElement(By.xpath("//button[@id='h2PYO']"));
		Actions act = new Actions(driver);
		
		// Double click on web element
		//act.doubleClick(element).perform();
		
		// Right click on web element
		//act.contextClick(element).perform();
		
		// Click on web element
		act.click(element).perform();
		
//		driver.manage().timeouts().implicitlyWait(6000, TimeUnit.SECONDS);

		
//		Thread.sleep(5000);
		
//		driver.close();
	}

}
