package basicselenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class SeleniumPropertiesFile {
	public static void main(String [] args ) throws IOException
	{
		Properties p = new Properties();
		FileInputStream ip =new FileInputStream("C:/Personal/src/SeleniumJava/config.properties");
		p.load(ip);
		System.out.println(p.getProperty("name"));
		
		
		
		
	}

}
