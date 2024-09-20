package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadData {
	
	Properties pro;
	public ReadData() {
		
		File f=new File("C:\\mavenproject\\framework\\Configuration\\configure.properties");
		
		try {
			FileInputStream fis=new FileInputStream(f);
			pro=new Properties();
			pro.load(fis);		
		}catch (Exception e) {
			e.printStackTrace(); 
		}
	}
		
		public String getUsername() {
			
			String uname=pro.getProperty("username");
			return uname;
		}
		
		public String getpassword()	{
		String pword=pro.getProperty("password"); 
		return pword;
		}
}
			
		
		
	
		
