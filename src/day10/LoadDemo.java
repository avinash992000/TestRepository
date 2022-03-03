package day10;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class LoadDemo {
	private static Properties propertiesLoad(String s) {
		Properties props=new Properties();
		InputStream ip=null;
		try {
			ip=new FileInputStream(s);
			props.load(ip);
			ip.close();
		}catch(IOException e){
			System.out.println(e.getMessage());
			
		}
		return props;
		
	}

	public static void main(String[] args) {
		final String PROPERTIES_FILE = "MyApplication.properties";
		Properties myProps;
		myProps = propertiesLoad(PROPERTIES_FILE);
		System.out.println(myProps.get("user"));
		System.out.println(myProps.get("password"));

	}

}
