	package com.ClearPar.Utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Logs {

	private  static Logger logger=Logger.getLogger(Logs.class.getName());
	
		
	public static void info(String msg) {
		
		logger.info(msg);
	}
	public static void debug(String msg) {
		logger.debug(msg);
	}
}

