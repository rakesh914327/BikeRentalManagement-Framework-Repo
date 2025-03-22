package com.bikerentalapp.genric.fileutility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileUtility {
	
	public String getDataFromPropertyFile(String key) throws IOException {
		
		// Read Common Data From Properties files
		String path = "./configAppData/commondata.properties";
		FileInputStream fis =  new FileInputStream(path);
		Properties prop = new Properties();
		prop.load(fis);
		
		String value = prop.getProperty(key);
		
		return value;
		
	}

}
