package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage  extends BasePage{
	
	//constructor
	public HomePage(WebDriver driver)
	{
	super(driver);  //calls the constructor of base page 
	}
	
	
	//locator
	@FindBy(xpath = "//span[text()='My Account']") 
	WebElement myaccount;
	
	@FindBy(xpath = "//a[text()='Register']")
	WebElement register;
	
	//Action
	public void clickmyaccount()
	{
		myaccount.click();
	}
	
	public void clickregister()
	{
		register.click();
	}
	
	
	
	
	

}
