package managers;

import java.io.IOException;

import ConfigurationProperties.ConfigurationProperties;

public class PropertiesManager {
	
	private ConfigurationProperties confProp;
	
	public PropertiesManager() throws IOException {
		
		confProp=new ConfigurationProperties();
	}
	
	
	public ConfigurationProperties getConfigurationValues() {
		
		return confProp;
	}
	

}
