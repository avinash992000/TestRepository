package day10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesFile {
	private static Properties addProperties() {
		Properties props = new Properties();
		props.setProperty("user", "sample");
		props.setProperty("password", "sample123");
		props.setProperty("batch", "batchsample");
		props.setProperty("section", "s1");
		props.setProperty("new block", "new");
		return props;
	}
	private static void savePropertyFile(Properties properties,String filename) {
		try(OutputStream propsFile = new FileOutputStream(filename)) {
			properties.store(propsFile, "Properties File");
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		final String PROPERTIESFILE ="MyApplication.properties";
		Properties myprops;
		myprops = addProperties();
		savePropertyFile(myprops,PROPERTIESFILE);
	}
	

}
