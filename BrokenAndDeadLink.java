package com.edureka.testing;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URL;
import java.time.Duration;
import java.util.List;import java.util.concurrent.TimeUnit;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenAndDeadLink {


public static void main(String[] args) {
	WebDriverManager.edgedriver().setup();
	WebDriver driver=new EdgeDriver();
	
//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	
	driver.get("http://www.deadlinkcity.com/");
	int resCode=200;
	int brokenLink=0;
	
	List<WebElement> list=driver.findElements(By.tagName("a"));
//	int resCode=200;
//	int brokenLink=0;
	
	System.out.println("total link " +list.size());
	
	for(WebElement e1 : list) {
//		String url=e1.getAttribute("href");
		try {
		String url=e1.getAttribute("href");
		
		URL urlLink=new URL(url);
		
		HttpURLConnection huc=(HttpURLConnection) urlLink.openConnection();
		huc.setRequestMethod("HEAD");
		huc.connect();
		
		resCode=huc.getResponseCode();
		
		if(resCode >= 400) {
			System.out.println("Broken Link "+ url);
			brokenLink++;
		}	
		}
		
		catch (MalformedURLException e) {
			// TODO: handle exception
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}
	System.out.println("total broken link count " +brokenLink );
	
}
}
