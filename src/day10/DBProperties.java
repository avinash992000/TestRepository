package day10;
import java.io.*;

import java.util.Properties;

public class DBProperties {
	private Properties loadProperties() {
		InputStream iStream = null;
		Properties props = new Properties();
		try {
			iStream = this.getClass().getClassLoader().getResourceAsStream("mycity.properties");
			if(iStream == null) {
				throw new IOException("File not found");
			}
			props.load(iStream);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(iStream != null) {
					iStream.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
		return props;
	}
	
	private void readProperties(Properties props) {
		System.out.println("User:"+props.getProperty("hyd"));
	}
	public static void main(String[] args) {
		DBProperties p = new DBProperties();
		Properties props = p.loadProperties();
		p.readProperties(props);
	}

}
