package properties;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class CallProperties {

public static Properties intializeProperties() {
		
		Properties prop = new Properties();
		File proFile = new File(System.getProperty("user.dir")+"\\src\\test\\java\\dataConfig\\data.properties");
		
		try {
			FileInputStream fis = new FileInputStream(proFile);
			prop.load(fis);
		}catch(Throwable e) {
			e.printStackTrace();
		}
		
		return prop;
		
	}

}
