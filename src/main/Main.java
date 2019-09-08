package main;

import java.util.Scanner;

import domain.BuildConfig;
import domain.Project;
import xml.Build;
import xml.XMLAdapter;
import xml.XMLBuildConfigurationReader;
import yaml.Compile;
import yaml.YAMLAdapter;
import yaml.YamlBuildConfigurationReader;

public class Main {
	
	public static void main(String[] args) {
		
		ConfigFactory factory = new ConfigFactory();
		final String target = "dist";
		System.out.println("Building myProject");
		ConfigInterface ci1 = ConfigFactory.getAdapter("x");
		//should replace build.xml and build.yaml with file name
		ci1.setConfigurationReader(new XMLBuildConfigurationReader("build.xml"));
	    ci1.buildTarget("build.xml", target);
	    ConfigInterface ci2 = ConfigFactory.getAdapter("y");
	    ci2.setConfigurationReader(new YamlBuildConfigurationReader("build.yaml"));
	    ci2.buildTarget("build.yaml", target);
	    
		
	}
}
