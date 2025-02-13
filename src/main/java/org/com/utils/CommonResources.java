package org.com.utils;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

public class CommonResources {

	private static final String propertyPath = System.getProperty("user.dir")
			+ "/src/main/resources/properties/userDetails.properties";

	public static String readProperty(String key) {

		Properties po = new Properties();
		try {
			InputStream input = new FileInputStream(propertyPath);
			po.load(input);
			po.getProperty(key);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return po.getProperty(key);

	}

}
