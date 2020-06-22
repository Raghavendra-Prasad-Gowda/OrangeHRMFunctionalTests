package stepDefinitions;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import Context.TestContext;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import orangeHRMPageObjects.OrangeHRMLoginPageObjects;

public class LoginPageSteps {
	private static Logger loginPageSteps=LogManager.getLogger(LoginPageSteps.class.getName());
	TestContext context;
	OrangeHRMLoginPageObjects loginPageObjects;
	
	 public LoginPageSteps(TestContext picoContext) {
		context=picoContext;
		loginPageObjects = context.getPageObjectManager().getLoginPageObjects();
	}
	
	
	@Given("^User is on OrangeHRM login page$")
	public void user_is_on_OrangeHRM_login_page() throws Throwable {
		  
	}

	@When("^User enters valid username and password$")
	public void user_enters_valid_username_and_password() throws Throwable {
	   loginPageObjects.setUsername("Admin");
	   loginPageSteps.info("UserName is entered");
	}

	@When("^User clicks on login button$")
	public void user_clicks_on_login_button() throws Throwable {
	    loginPageObjects.setPassword("admin123");
	}

	@Then("^User should navigate to dashboard page$")
	public void user_should_navigate_to_dashboard_page() throws Throwable {
	    loginPageObjects.clickLoginButton();
	}

}
