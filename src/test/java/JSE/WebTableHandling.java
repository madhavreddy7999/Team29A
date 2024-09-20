package JSE;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {

	public static WebDriver driver;
	public static void main(String[] args) {
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		
				List<WebElement>rows=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr"));
				
				int Rows=rows.size();
				
				
				List<WebElement>cols=driver.findElements(By.xpath("//table[@name='BookTable']/tbody/tr[1]/th"));
				int columns=cols.size();
				
		        System.out.println(Rows+"   "+columns);
				
					
			   	for(int i=0;i<=Rows-1;i++) {
					
				String values=rows.get(i).getText();
				
				System.out.println(values+"  ");
					
					
				}
				
				
				
				
				
			}

		
				
	}
			
		