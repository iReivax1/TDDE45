package main;

import xml.XMLAdapter;
import xml.XMLBuildConfigurationReader;
import yaml.YAMLAdapter;
import yaml.YamlBuildConfigurationReader;

public class ConfigFactory {
	Object configurationReader = null;

	public static ConfigInterface getAdapter(String configOption) {
		ConfigInterface ci = null;
		
		if(configOption.equals("X") || configOption.equals("x")) {
			ci = new XMLAdapter();
		} 
		else if(configOption.equals("Y") || configOption.equals("y")) {
			ci = new YAMLAdapter();
		} else {
			// XML by default
			ci = new XMLAdapter();
		}
		return ci;
	}
}
