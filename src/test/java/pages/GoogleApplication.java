package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import support.Browser;

public class GoogleApplication {
	public WebDriver driver = Browser.createBrowser();
	public Homepage homepage=PageFactory.initElements(driver, Homepage.class);
	public ResultsPage resultspage=PageFactory.initElements(driver, ResultsPage.class);

}
