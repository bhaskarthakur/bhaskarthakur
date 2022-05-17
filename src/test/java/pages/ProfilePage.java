package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ProfilePage {
	public WebDriver driver;

	public ProfilePage(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.CSS, using = "#submit")
	WebElement logoutButton;
	
	@FindBy(how = How.XPATH, using = "//span [starts-with(@id,'see-book')]")
	List<WebElement> documenttitles;
	
	public void clickLogOut() {
		logoutButton.click();
	}
	public int getTotalNoofdocuments() {
		int count= documenttitles.size();
		return count;
	}
}
