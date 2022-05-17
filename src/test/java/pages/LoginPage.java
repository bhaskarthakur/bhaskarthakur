package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.CSS, using = "#userName")
	WebElement userNameInput;
	@FindBy(how = How.CSS, using = "#password")
	WebElement userPassword;
	@FindBy(how = How.CSS, using = "#login")
	WebElement loginButton;

	public void enterUsername(String input1) {
		userNameInput.sendKeys(input1);
	}

	public void enterPassword(String input2) {
		userPassword.sendKeys(input2);
	}

	public void clickLoginButton() {
		loginButton.click();
	}

}
