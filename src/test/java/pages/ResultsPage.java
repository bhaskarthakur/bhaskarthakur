package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ResultsPage {
	WebDriver driver;
	public ResultsPage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how = How.ID, using ="result-stats")
	public WebElement resultOutput;
}
