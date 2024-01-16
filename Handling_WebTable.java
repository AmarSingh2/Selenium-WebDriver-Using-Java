package com.selenium.Selenium_Webdriver_project_Restart;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Handling_WebTable {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/");
		
		driver.manage().window().maximize();
		
		/*
		// finding the word cierra from webtable and print it in the console
		String str = driver.findElement(By.xpath("//div[normalize-space()='Cierra']")).getText();
		System.out.println(str);
		*/
		
		// counting the number of rows and column in web table
		List<WebElement> rows =driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println("Total numbers of rows " +rows.size());
		
		List<WebElement> column =driver.findElements(By.xpath("//table/tbody/tr[1]/td"));
		System.out.println("Total numbers of columns " +column.size());
		
		// Traversing through different data present in webtable
		for(int r=2;r<=rows.size();r++) {
			for(int c=2;c<=column.size();c++) {
				String str = driver.findElement(By.xpath("//table/tbody/tr["+ r +"]/td["+ c +"] ")).getText();
				System.out.print(str);
				
				System.out.println();
				System.out.println();

			}
		}
	}

}
