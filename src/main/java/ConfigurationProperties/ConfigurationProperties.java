package ConfigurationProperties;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationProperties {

	private static FileInputStream fis;
	private static Properties prop;
	private static String browserName;

	public ConfigurationProperties() throws IOException {
		fis = new FileInputStream(System.getProperty("user.dir")
				+ "\\src\\test\\resources\\Configurations\\ProjectConfigurations.properties");
		prop = new Properties();
		prop.load(fis);
	}

	
	
	public String getAppURL() {
		return prop.getProperty("testURL");
	}

	
	public String getBrowserName() {
		return prop.getProperty("browser");
	}

	
	public String getDriverPath() {

		if (getBrowserName().equals("chrome")) {
			return prop.getProperty("chromeDriverPath");
		} 
		
		else if (getBrowserName().equals("firefox")) {
			return prop.getProperty("firefoxDriverPath");
		}
		
		else if (getBrowserName().equals("internetexplorer")) {
			return prop.getProperty("internetexplorerDriverPath");
		} 
		
		else {
			return prop.getProperty("chromeDriverPath");
		}

	}
	
	public String getDriverEnvironment() {
		return prop.getProperty("environment");
	}
	

}
