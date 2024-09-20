package TestNGexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class Parameterization {
	
	public static WebDriver driver;
	@BeforeClass
	@Parameters({"browser","URL"})
	public void openApplication(String br,String url) {
		
		if(br.equals("chrome")) {  
			driver=new ChromeDriver();
		}
		else if(br.equals("edge")) {
			driver=new EdgeDriver();
		}
		else if(br.equals("firefox")) {
			driver=new FirefoxDriver();
		}
		
		//"https://adactinhotelapp.com/"
		driver.get(url);
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void LoginFunctionality()
	{
		
		
		driver.findElement(By.id("username")).sendKeys("reddy7999");
		driver.findElement(By.id("password")).sendKeys("69JDF4");
		driver.findElement(By.id("login")).click();
	}
	
	@AfterClass
	public void LogoutFunction() {
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
}
