package com.selenium.Selenium_Webdriver_project_Restart;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenNewTabOrOpenNewWindow_SeleniumWebdriver {

	public static void main(String[] args) {

		WebDriver driver = new EdgeDriver();
		driver.get("https://www.google.co.in/");
		System.out.println("Title of first page : " +driver.getTitle() );
		
		driver.switchTo().newWindow(WindowType.TAB);
		driver.get("https://www.facebook.com/");
		System.out.println("Title of second page : " +driver.getTitle());
		
		Set<String> windowHandle = driver.getWindowHandles();
		List<String> handles = new ArrayList<String>();
		handles.addAll(windowHandle);
		
		driver.close();

		driver.switchTo().window(handles.get(0));
		
		System.out.println("Tile of third page : "+driver.getTitle());
		
	}

}
