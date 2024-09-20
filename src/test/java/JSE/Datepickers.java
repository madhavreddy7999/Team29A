package JSE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Datepickers {
	
	public static WebDriver driver;
	
	public static void main (String[]args) {
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.hyrtutorials.com/p/calendar-practice.html#google_vignette");
		driver.manage().window().maximize();
				
		WebElement ele1=driver.findElement(By.id("first_date_picker"));
		ele1.sendKeys("17/09/2024");

}
	
}
