package keywordDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Flib {

	public String readPropertyData(String propPath, String keyValue) throws IOException {

		FileInputStream fis = new FileInputStream(propPath);
		Properties prop = new Properties();
		prop.load(fis);
		String value = prop.getProperty(keyValue);
		return value;

	}
	
	

}
