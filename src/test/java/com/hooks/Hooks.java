package com.hooks;

import java.util.Properties;


//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.BeforeMethod;

import com.driverfactory.DriverFactory;
import com.utils.Configreader;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks {

	 Properties prop;
	 
		@Before
		public void setUp() throws InterruptedException {
			
			prop = Configreader.getProperties();
			DriverFactory.setDriver().get(prop.getProperty("url"));
			Thread.sleep(1000);
		}
		@After
		public void tearDown() {
			DriverFactory.quitDriver();
		}
	}


