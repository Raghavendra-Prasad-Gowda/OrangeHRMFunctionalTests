package Context;

import java.io.IOException;

import managers.PageObjectManager;
import managers.PropertiesManager;
import managers.WebDriverManager;

public class TestContext {
	
	private PageObjectManager pageObjectManager;
	private PropertiesManager propertiesManager;
	
	public TestContext() throws IOException {
		//Getting the driver manager
		pageObjectManager = new PageObjectManager(WebDriverManager.getDriver());
		propertiesManager = new PropertiesManager();
	}
	
	public PageObjectManager getPageObjectManager() {
		return pageObjectManager;
	}
	
	public PropertiesManager getPropertiesManager() {
		return propertiesManager;
	}
	
}
