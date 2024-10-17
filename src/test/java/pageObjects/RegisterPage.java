package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends BasePage {
	
	
	//constructor
	public RegisterPage(WebDriver driver) 
	{
		super(driver);	
	}
	
	//loactors
	@FindBy(xpath = "//input[@id='input-firstname']") WebElement txt_firstname;
	@FindBy(xpath = "//input[@id='input-lastname']")WebElement txt_lastname;
	@FindBy(xpath = "//input[@id='input-email']")WebElement txt_email;
	@FindBy(xpath = "//input[@id='input-telephone']") WebElement txt_telephone;
	@FindBy(xpath = "//input[@id='input-password']") WebElement txt_password;
	@FindBy(xpath = "//input[@id='input-confirm']") WebElement txt_confirmpassword;
	@FindBy(xpath = "//input[@name='agree']") WebElement clickpolicy;
	@FindBy(xpath = "//input[@type='submit']") WebElement continuebtn;
	
	//Actions
	
	public void setfirstname(String fname)
	{
		txt_firstname.sendKeys(fname);
	}
	public void setlastname(String lname)
	{
		txt_lastname.sendKeys(lname);
	}
	public void setemail(String email)
	{
		txt_email.sendKeys(email);
	}
	public void settelephone(String tphone)
	{
		txt_telephone.sendKeys(tphone);
	}
	public void setpassword (String password)
	{
		txt_password.sendKeys(password);
	}
	public void setcpassword(String cpassword)
	{
		txt_confirmpassword.sendKeys(cpassword);
	}
	public void setpolicy()
	{
		clickpolicy.click();
	}
	public void setcontinue()
	{
		continuebtn.click();
	}
}
