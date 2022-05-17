package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import support.Browser;

public class BookStoreApplication {
	public WebDriver driver = Browser.createBrowser();
	public MainPage mainPage = PageFactory.initElements(driver, MainPage.class);
	public LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
	public BookStorePage bookStorePage = PageFactory.initElements(driver, BookStorePage.class);
	public ProfilePage profilepage = PageFactory.initElements(driver,ProfilePage.class);

}
