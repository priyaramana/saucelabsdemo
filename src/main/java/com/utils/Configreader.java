package com.utils;

import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configreader {

	private static Properties properties;
	
	static {
		try {
			FileInputStream fis = new FileInputStream("/Users/lt535j/eclipse-workspace/FrameworkwithBDD1/config.properties");
			properties = new Properties();
			properties.load(fis);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	public static Properties getProperties() {
		return properties;
	}
	public String getProperty(String key) {
		return properties.getProperty(key);
	}
}
