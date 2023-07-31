package Edureka;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class SeleniumScript {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.edge.driver", "F:\\BrowserDriver\\msedgedriver.exe ");
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.edureka.co");
		System.out.println(driver.getTitle());
		driver.quit();
	}
}
