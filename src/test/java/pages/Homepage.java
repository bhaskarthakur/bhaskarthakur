package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class Homepage {
	public WebDriver driver;
	
	public Homepage(WebDriver driver) {
		this.driver=driver;
	}
	
	@FindBy(how = How.CSS, using = "input[name='q']")
	WebElement searchInputBox;
	
	@FindBy(how = How.CSS, using = "input[name='btnK']")
	WebElement searchbutton;
	
	@FindBy(how = How.CSS, using = "input[name='btnI']")
	WebElement searchbutton2;
	
	@FindBy(how = How.CSS, using = "#L2AGLb")
	WebElement googleCookieagreement;
	
	public void enterSearchCriteria(String inputValue) {
		searchInputBox.sendKeys(inputValue);
		
	}
	public void clickgooglecookieagreement() {
		googleCookieagreement.click();
	}
	public void clickSearchButton() {
		searchbutton.click();
	}
	public void clickIamluckyButton() {
		searchbutton2.click();
	}
}
