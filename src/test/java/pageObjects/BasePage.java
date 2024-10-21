package pageObjects;

import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


import net.bytebuddy.asm.Advice.This;

public class BasePage {

	public Logger logger;
	WebDriver driver ;

	public BasePage(WebDriver driver)
	{
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}


}
