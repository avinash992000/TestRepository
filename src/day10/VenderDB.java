package day10;
import java.util.Properties;
import java.io.*;

public class VenderDB {
	
	public static void main(String[] args) {
		VenderDB v = new VenderDB();
		Properties props = v.check();
		System.out.println(props.getProperty("1"));
		
	}
	
	private Properties check() {
		InputStream io = null;
		Properties prop = new Properties();
		
		try {
			io = this.getClass().getClassLoader().getResourceAsStream("index.properties");
			if(io == null) {
				throw new IOException("Not Found");
			}
			prop.load(io);
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(io != null) {
					io.close();
				}
			}catch(IOException e) {
				e.printStackTrace();
			}
		
		}
		return prop;
	}
}
