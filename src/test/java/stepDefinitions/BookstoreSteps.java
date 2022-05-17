package stepDefinitions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BookStoreApplication;
import pages.MainPage;

public class BookstoreSteps {
	BookStoreApplication bookstoreApplication = new BookStoreApplication();

	@Given("I navigate to Bookstore application")
	public void i_navigate_to_bookstore_application() {
		bookstoreApplication.driver.navigate().to("https://demoqa.com/books");
	}

	@Given("I logged into bookstore application using the credentials")
	public void i_logged_into_bookstore_application_using_the_credentials(DataTable dataTable) {

		List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
		bookstoreApplication.mainPage.clickLoginButton();
		bookstoreApplication.loginPage.enterUsername(rows.get(0).get("UserName"));
		bookstoreApplication.loginPage.enterPassword(rows.get(0).get("Password"));
		bookstoreApplication.loginPage.clickLoginButton();
	}

	@Given("I click on BookStore option from the menu")
	public void i_click_on_book_store_option_from_the_menu() {
		try {
			bookstoreApplication.mainPage.clickBookStoreMenu();
		} catch (Exception e) {

		}
	}

	@Given("I search below list of documents and add it to my collection")
	public void i_search_below_list_of_documents_and_add_it_to_my_collection(DataTable dataTable) {
		List<String> rows = dataTable.asList();

		for (String title : rows) {
			bookstoreApplication.bookStorePage.enterbookname(title);
			bookstoreApplication.bookStorePage.clicksearchButton();
			bookstoreApplication.bookStorePage.clickDocumentTitle(title);
			bookstoreApplication.bookStorePage.clickAddToCollection();
			bookstoreApplication.driver.switchTo().alert().accept();
			bookstoreApplication.bookStorePage.clickBacktoToBookStore();
		}
	}

	@When("I go back to my profile")
	public void i_go_back_to_my_profile() {
		bookstoreApplication.mainPage.clickProfileMenu();
	}

	@Then("I should see {string} documents under my collection")
	public void i_should_see_documents_under_my_collection(String val) {
		int expectedNumber = Integer.parseInt(val);
		Assert.assertTrue("Total number  of documents are not correct",
				bookstoreApplication.profilepage.getTotalNoofdocuments() == expectedNumber);
	}

	@Then("I Logoff from the bookstore appication")
	public void i_logoff_from_the_bookstore_appication() {
		bookstoreApplication.profilepage.clickLogOut();
	}
}
