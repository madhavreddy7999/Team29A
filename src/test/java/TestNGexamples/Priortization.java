package TestNGexamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Priortization {
	
	public static WebDriver driver;
	@Test(priority=1)
	public void openApplication() {
		
		driver=new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test(priority=2,dependsOnMethods= {"openApplication"})
	public void LoginFunctionality()
	{
		
		
		driver.findElement(By.id("username")).sendKeys("reddy7999");
		driver.findElement(By.id("password")).sendKeys("69JDF4");
		driver.findElement(By.id("login")).click();
	}
	
	@Test(priority=3,dependsOnMethods= {"LoginFunctionality"})
	public void LogoutFunction() {
		
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
	}
}
	
