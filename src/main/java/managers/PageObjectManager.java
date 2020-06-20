package managers;

import org.openqa.selenium.WebDriver;

import orangeHRMPageObjects.OrangeHRMLoginPageObjects;

public class PageObjectManager {
	
	private WebDriver driver;
	private OrangeHRMLoginPageObjects loginPageObjects;
	
	public PageObjectManager(WebDriver driver) {	
		this.driver=driver;
	}
	
	public OrangeHRMLoginPageObjects getLoginPageObjects() {
		if(loginPageObjects==null) {
			loginPageObjects=new OrangeHRMLoginPageObjects(driver);
		}
		return loginPageObjects;
	}

}
