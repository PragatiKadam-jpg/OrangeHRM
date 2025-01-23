package Reader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class PropertyReader {

	public static String readProperty(String keyName) throws FileNotFoundException 
	{
		Properties prop = new Properties();
		String path = System.getProperty("user.dir")+"\\src\\main\\resources\\ConfigLayer\\config.properties";
		FileReader file = new FileReader(path);
		try {
			prop.load(file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return prop.getProperty(keyName);
	
	}
}
