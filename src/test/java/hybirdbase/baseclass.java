package hybirdbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class baseclass {
public static WebDriver driver;
@BeforeClass
public void openapp() {
	driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
}
@AfterClass
public void closeapp() {
	driver.close();
}
}

