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
		
		final String target = "dist";
		System.out.println("Building myProject");
		System.out.println("Building target init");
		System.out.println("Building target compile");
		System.out.println("Building target dist");
		ConfigInterface ci1 = ConfigFactory.getAdapter("X");
	    ci1.buildTarget("build.xml", target);
	    ConfigInterface ci2 = ConfigFactory.getAdapter("Y");
	    ci2.buildTarget("build.yaml", target);
		
	}
}
