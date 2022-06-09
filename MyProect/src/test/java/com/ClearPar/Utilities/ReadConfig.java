package com.ClearPar.Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig(){
		File src=new File("./config.properties");
		try {
			FileInputStream fis=new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);		
		}catch(Exception e)
		{
			System.out.println("Message"+e.getMessage());
		}
	}
	public String getPropertyName(String name)
	{
		return pro.getProperty(name); 
	}
	
}
