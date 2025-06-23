package com.utils;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class LoggerClass {

	static Logger logger;
	static{
	PropertyConfigurator.configure("/Users/lt535j/eclipse-workspace/FrameworkwithBDD1/log4j.properties");	
	logger= Logger.getLogger(LoggerClass.class);
	}
	public void info(String message) {
		logger.info(message);
	}
}
