package Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Interaction;
import org.testng.annotations.Test;

import Pageobjects.Loginpage;
import Pageobjects.Registerpage;

public class TC_002_Register extends Baseclass{
	@Test
    	  
	public void RegisterTest() throws InterruptedException {
		Loginpage lp=new Loginpage(driver);
		
		lp.ClickNewUserregister();
		
		Registerpage rp=new Registerpage(driver);
	
		rp.setRegUsername();
		rp.setRegPassword();
		rp.setpassword();
	    rp.setFullname();
	    rp.setEmailAdd();
	   
	   Thread.sleep(10000);
	    
	    rp.clickprivacyPolicycBox();
	    rp.clickRegisterbtn();
	
}

	
	}
