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
		System.out.println("Building target init");
		System.out.println("Building target compile");
		System.out.println("Building target dist");
		ConfigInterface ci1 = ConfigFactory.getAdapter("x");
		ci1.setConfigurationReader(new XMLBuildConfigurationReader(target));
	    ci1.buildTarget("build.xml", target);
	    ConfigInterface ci2 = ConfigFactory.getAdapter("y");
	    ci2.setConfigurationReader(new YamlBuildConfigurationReader(target));
	    ci2.buildTarget("build.yaml", target);
	    
		
	}
}
