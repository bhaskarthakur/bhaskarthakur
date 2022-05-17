package support;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	
	public static WebDriver driver;
	
	public static WebDriver createBrowser() {
		if(driver==null) {
		//System.setProperty("webdriver.chrome.driver", "chromedriver");
		driver = new ChromeDriver();
		}
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void closeBrowser() {
		driver.close();
	}
}
