package com.cucumber.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

	public static Properties prop = new Properties();

	public ConfigurationReader() throws IOException {
		try {
			File f = new File(System.getProperty("user.dir")
					+ "\\src\\test\\resource\\com\\cucumber\\prop\\Configuration.properties");
			FileInputStream fin = new FileInputStream(f);

			prop.load(fin);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public String getUrl() throws Exception {
		String property = prop.getProperty("url");
		if (property == null) {
			throw new Exception("Not a valid name");
		}
		return property;
	}

	public String getBrowserName() throws Exception {
		String property = prop.getProperty("browserName");
		if (property == null) {
			throw new Exception("Not a valid name");
		}
		return property;

	}
}
