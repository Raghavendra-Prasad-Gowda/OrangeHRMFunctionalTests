package Context;

import java.io.IOException;

import managers.PageObjectManager;
import managers.PropertiesManager;
import managers.WebDriverManager;

public class TestContext {
	
	private PageObjectManager pageObjectManager;
	private PropertiesManager propertiesManager;
	private WebDriverManager webDriverManager;
	
	public TestContext() throws IOException {
		webDriverManager = new WebDriverManager();
		pageObjectManager = new PageObjectManager(webDriverManager.getDriver());
		propertiesManager = new PropertiesManager();
	}
	
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}
	
	public WebDriverManager getWebDriverManager() {
		return webDriverManager;
	}

	public PropertiesManager getPropertiesManager() {
		return propertiesManager;
	}
	
}
