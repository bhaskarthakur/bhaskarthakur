package support;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonFunctions {
	public static void scrollToElements(WebElement ele, WebDriver driver) {
		try {
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", ele);
		Thread.sleep(500);
		} catch(Exception e) {
			
		}
	}

}
