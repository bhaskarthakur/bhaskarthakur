package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import support.CommonFunctions;

public class MainPage {
	public WebDriver driver;

	public MainPage(WebDriver driver) {
		this.driver=driver;
	}
	@FindBy(how = How.CSS, using = "#login")
	WebElement loginButton;
	@FindBy(how = How.XPATH, using = "(//*[@id='item-2']/span)[5]")
	WebElement bookStoreMenu;
	@FindBy(how = How.CSS, using = "#close-fixedban")
	WebElement profileMenu;
	
	public void clickLoginButton() {
		loginButton.click();

	}
	public void clickBookStoreMenu() {
		CommonFunctions.scrollToElements(bookStoreMenu, driver);
		bookStoreMenu.click();
		
	}
	public void clickProfileMenu() {
		CommonFunctions.scrollToElements(profileMenu, driver);
		profileMenu.click();
	}
}

