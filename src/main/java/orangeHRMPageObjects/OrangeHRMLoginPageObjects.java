package orangeHRMPageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRMLoginPageObjects {
	
	WebDriver driver;
	
	@FindBy(how=How.XPATH, using="//input[@id='txtUsername']")
	private  WebElement username;
	
	@FindBy(how=How.XPATH, using="//input[@id='txtPassword']")
	private  WebElement password;
	
	@FindBy(how=How.XPATH, using="//input[@id='btnLogin']")
   private WebElement loginButton;	
	
	
	
	public OrangeHRMLoginPageObjects(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	public void setUsername(String usernameValue) {
		username.sendKeys(usernameValue);
	}
	
	public void setPassword(String passwordValue) {
		password.sendKeys(passwordValue);
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}

}
