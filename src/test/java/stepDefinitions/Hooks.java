package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import support.Browser;

public class Hooks {

@Before	
public void startBrowser() {
	Browser.createBrowser();
}

@After
public void closeBrowser() {
	Browser.closeBrowser();
}
}
