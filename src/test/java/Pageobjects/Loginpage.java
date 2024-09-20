package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	   public WebDriver driver;
	   public Loginpage(WebDriver driver) {
		   this.driver=driver;
		   PageFactory.initElements(driver, this);
	   }
	   @FindBy(id="username")
	   WebElement txtusername;
	   @FindBy(id="password")
	   WebElement txtpassword;
	   @FindBy(id="login")
	   WebElement btnlogin;
	   @FindBy(xpath="//a[text()='Forgot Password?']")
	   WebElement lnkForgot;
	   @FindBy(xpath="//a[text()='New User Register Here']")
	   WebElement lnkNewuser;
	   
	   public void SetUsername() {
		   txtusername.sendKeys("reddy7999");
	   }
	   public void SetPassword() {
		   txtpassword.sendKeys("69JDF4");
	   }
	   public void ClickLoginbutton() {
		   btnlogin.click();
	   }
	   public void ClickForgotpassword() {
		   lnkForgot.click();
	   }
	   public void ClickNewUserregister() {
		   lnkNewuser.click();
	   }

}