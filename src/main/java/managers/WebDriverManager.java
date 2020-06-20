package managers;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class WebDriverManager {
	
	public static WebDriver driver;
	
	static PropertiesManager propManager;
	
	private static String CHROME_DRIVER_PROPERTY="webdriver.chrome.driver";
	private static String FIREFOX_DRIVER_PROPERTY="webdriver.gecko.driver";
	private static String INTERNETEXPLORER_DRIVER_PROPERTY="webdriver.ie.driver";
	
	
	public WebDriverManager() throws IOException {
		propManager = new PropertiesManager();
	}
	
	
	
	public  WebDriver getDriver() {
		
		if(driver==null) {
			driver=createDriver();
			driver.get(propManager.getConfigurationValues().getAppURL());
			return driver;
		}else {
			return driver;
		}
	}
	
	public static WebDriver createDriver() {
		
		if(propManager.getConfigurationValues().getDriverEnvironment().equals("local")) {
			driver = createLocalDriver();
		}else if (propManager.getConfigurationValues().getDriverEnvironment().equals("remote")) {
			driver = createRemoteDriver();
		}		
		return driver;
	}
	
	
	private static WebDriver createRemoteDriver() {
		driver=null;	
		return driver;
	}
	
	
	private static WebDriver createLocalDriver() {
		
		if(propManager.getConfigurationValues().getAppURL().equals("chrome")) {
			
			System.setProperty(CHROME_DRIVER_PROPERTY, "G:\\Projects\\SDET\\OrangeHRMApplication\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}else if(propManager.getConfigurationValues().getAppURL().equals("firefox")) {
			
			System.setProperty(FIREFOX_DRIVER_PROPERTY, propManager.getConfigurationValues().getDriverPath());
			driver = new FirefoxDriver();
			
		}else if(propManager.getConfigurationValues().getAppURL().equals("internetexplorer")) {
			
			System.setProperty(INTERNETEXPLORER_DRIVER_PROPERTY, propManager.getConfigurationValues().getDriverPath());
			driver = new InternetExplorerDriver();
			
		}else {
			System.setProperty(CHROME_DRIVER_PROPERTY, propManager.getConfigurationValues().getDriverPath());
			driver = new ChromeDriver();
		}
		
		return driver;
	}
	

}
