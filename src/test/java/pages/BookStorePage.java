package pages;

import java.util.List;

import javax.naming.directory.SearchResult;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import support.CommonFunctions;

public class BookStorePage {
	public WebDriver driver;

	public BookStorePage(WebDriver driver) {
		this.driver = driver;

	}

	@FindBy(how = How.CSS, using = "#searchBox")
	WebElement searchInput;

	@FindBy(how = How.CSS, using = "#basic-addon2")
	WebElement searchButton;

	@FindBy(how = How.XPATH, using = "//span [starts-with(@id,'see-book')]")
	List<WebElement> resultsDocumentTitles;

	@FindBy(how = How.XPATH, using = "(//button [@id='addNewRecordButton'])[2]")
	WebElement addToCollection;

	WebElement backToBookStrore;

	public void clickBacktoToBookStore() {
		CommonFunctions.scrollToElements(backToBookStrore, driver);
		backToBookStrore.click();
	}

	public void enterbookname(String input) {
		searchInput.sendKeys(input);
	}

	public void clicksearchButton() {
		searchButton.click();
	}

	public void clickAddToCollection() {
		CommonFunctions.scrollToElements(addToCollection, driver);
		addToCollection.click();

	}

	public void clickDocumentTitle(String title) {
		WebElement documentTitle;
		for (WebElement result : resultsDocumentTitles) {
			if (result.getText().contains(title)) {
				result.click();
				break;
			}
		}
	}

}
