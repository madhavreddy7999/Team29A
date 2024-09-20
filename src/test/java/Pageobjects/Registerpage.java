package Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Registerpage {

	public  static WebDriver driver;
	public Registerpage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
		 
@FindBy(id="username")
WebElement txtUserName;

@FindBy(id="password")
WebElement txtpassword;

@FindBy(id="re_password")
WebElement txt_Cpass;

@FindBy(id="full_name")
WebElement txtFname;

@FindBy(id="email_add")
WebElement txtEmail;

@FindBy(id="tnc_box")
WebElement Box_Privacy;

@FindBy(xpath="//a[text()='Terms & Conditions']")
WebElement InkTerms;

@FindBy(id="submit")
WebElement btnRegister;

@FindBy(id="Reset")
WebElement btnReset;

public void setRegUsername() {
	txtUserName.sendKeys("Madhav2799");
}
	
public void setRegPassword() {
		txtUserName.sendKeys("Reddy2799");
}
		
		public void setpassword() {
			txt_Cpass.sendKeys("Reddy2799");
			
		}
		
		public void setFullname() {
			txtFname.sendKeys("Madhavreddy");
		}
		
			public void setEmailAdd() {
				txtEmail.sendKeys("madhavreddy2799@gmail.com");	
			}
				 
				public void clickprivacyPolicycBox() {
					Box_Privacy.click();
				}
				public void clickInkTerms () {
					InkTerms.click();
				}
				public void clickRegisterbtn() {
					btnRegister.click();
				}
				public void clickResetbtn() {
					btnReset.click();
					
					
					
					
			
		}






	}
