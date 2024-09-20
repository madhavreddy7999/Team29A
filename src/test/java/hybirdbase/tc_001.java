package hybirdbase;

import org.testng.annotations.Test;

import hybird.hrmpage;

public class tc_001 extends baseclass {
@Test
	
	
	public void logintest() throws InterruptedException {
	Thread.sleep(3000);
		hrmpage hp=new hrmpage(driver);
		hp.setusername();
		hp.setpassword();
		hp.clicklogin();
	}
}