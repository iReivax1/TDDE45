package main;

import xml.XMLAdapter;
import yaml.YAMLAdapter;

public class ConfigFactory {
	
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
