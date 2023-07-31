package Edureka;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class TestCaseForGmailautomation {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.edge.driver", "F:\\\\BrowserDriver\\\\msedgedriver.exe");
	WebDriver driver = new EdgeDriver();
	driver.get("http://www.gmail.com");
	driver.manage().window().maximize();
	driver.findElement(By.id("identifierId")).sendKeys("amar877057@gmail.com");
	Thread.sleep(7000);
	driver.findElement(By.id("identifierNext")).click();
	Thread.sleep(8000);
	String at=driver.getTitle();
	String jt="gmail";
	driver.close();
	
	if(at.equalsIgnoreCase(jt)) {
		System.out.println("Test Successful");
	}
	else {
		System.out.println("Test Failure");
	}
}
}
