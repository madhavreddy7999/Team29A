package JSE;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class alert {

	public static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		 driver = new ChromeDriver();
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		 
		 driver.manage().window().maximize();
		 driver.getTitle();
		 
		 By JsAlertProperty = By.xpath("//*[@class='example']/ul/li/button[@onclick='jsAlert()']");
		 WebElement JsAlert = driver.findElement(JsAlertProperty);
		 JsAlert.click();
		 
		 Alert Windowpop01 = driver.switchTo().alert();
		 Thread.sleep(4000);
		 Windowpop01.accept();
		 
 By JsConfirmProperty = By.xpath("//*[@class='example']/ul/li[2]/button");
			 WebElement JsConfirm = driver.findElement(JsConfirmProperty);
			 JsConfirm.click();
			 Thread.sleep(5000);

Windowpop01.accept();
 Windowpop01.dismiss(); 



 By JsPromptProperty = By.xpath("//*[@class='example']/ul/li[3]/button");
			 WebElement JsPrompt = driver.findElement(JsPromptProperty);
			 JsPrompt.click();
			 Thread.sleep(6000);
 Windowpop01.sendKeys("All The Buttons Are Working Fine");
				 Windowpop01.accept();
 Windowpop01.dismiss();
		

	}


	}

