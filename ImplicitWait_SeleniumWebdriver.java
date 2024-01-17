package com.selenium.Selenium_Webdriver_project_Restart;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.google.common.base.Stopwatch;

public class ImplicitWait_SeleniumWebdriver {

	public static void main(String[] args) throws Exception {
		
		WebDriver driver = new EdgeDriver();
		
		driver.get("https://www.amazon.in/?tag=msndeskstdin-21&ref=pd_sl_7n32aeqqe4_e&adgrpid=1315017564951826&hvadid=82188862025546&hvnetw=o&hvqmt=e&hvbmt=be&hvdev=c&hvlocint=&hvlocphy=156924&hvtargid=kwd-82189528219307:loc-90&hydadcr=14452_2334185");
		driver.manage().window().maximize();
		
		
		//This method is used before selenium 4 and now it is deprecated 
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//The implicit wait is used as of newer version of selenium 4 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Thread.sleep(4000);
		Stopwatch watch = null;
		
		try {
			watch = Stopwatch.createStarted();
		driver.findElement(By.xpath("//a[@id='nav-link-accountList'")).click();
		}
		
		catch(Exception e) {
			watch.stop();
			System.out.println(e);
			System.out.println(watch.elapsed(TimeUnit.SECONDS));
		}
		//System.out.println(watch.elapsed(TimeUnit.SECONDS));

		driver.close();
	}

}
