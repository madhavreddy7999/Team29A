package JSE;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement ele1=driver.findElement(By.xpath("//input[@name='username']"));
		ele1.sendKeys("reddy7999");
		WebElement ele2=driver.findElement(By.xpath("//input[@name='password']"));
		ele2.sendKeys("69JDF4");
		WebElement ele3=driver.findElement(By.xpath("//input[@id='login']"));
		ele3.click();
		Thread.sleep(1000);
		WebElement dropdown1=driver.findElement(By.xpath("//select[@name='location']"));
		Select dropdown=new Select(dropdown1);
	
		dropdown.selectByVisibleText("London");
	
				WebElement dropdown2 =driver.findElement(By.xpath("//select[@name='hotels']"));
				Select dropdowna=new Select(dropdown2);
				dropdowna.selectByValue("Hotel Sunshine");
		
				WebElement dropdown3 =driver.findElement(By.xpath("//select[@name='room_type']"));
				Select dropdownb=new Select(dropdown3);
				
				dropdownb.selectByIndex(3);
				
				WebElement dropdown4 =driver.findElement(By.xpath("//select[@name='room_nos']"));
				Select dropdownc=new Select(dropdown4);
				
				dropdownc.selectByIndex(2);
				driver.findElement(By.xpath("//input[@name='datepick_in']")).sendKeys("15/09/2024");
				Thread.sleep(1000);
				driver.findElement(By.xpath("//input[@name='datepick_out']")).sendKeys("17/09/2024");
				
				
				
				dropdownc.selectByValue("2");
				driver.findElement(By.xpath("//input[@id='Submit']")).click();
				
				
				
				
				
				
				
				
				

			}

		

		
		
	
		
	}
	
