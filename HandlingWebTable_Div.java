package com.selenium.Selenium_Webdriver_project_Restart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class HandlingWebTable_Div {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.get("https://demoqa.com/webtables");
		
		// Extracting the column name from web table
		String str = driver.findElement(By.xpath("//div[@class='rt-tr']")).getText();
		System.out.println(str);
		
		System.out.println();
		
		// Extracting the First row and First column data
		String str1 = driver.findElement(By.xpath("//body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[@class='web-tables-wrapper']/div[@class='ReactTable -striped -highlight']/div[@role='grid']/div[@class='rt-thead -header']/div[@role='row']/div[1]")).getText();
		System.out.println(str1);
		
		System.out.println();
		
		// Extracting all the data from web table
		String str2 = driver.findElement(By.xpath("//div[@class='rt-tbody']")).getText();
		System.out.println(str2);
		
		
	}

}
