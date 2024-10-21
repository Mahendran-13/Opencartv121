package testcases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.RegisterPage;

public class Tc_001TestRegsitaration extends BaseTestCase {
	
	@Test
	public void testreg() throws InterruptedException
	{
		HomePage hp = new HomePage(driver);
		hp.clickmyaccount();
		Thread.sleep(2000);
		hp.clickregister();
		
		RegisterPage rp = new RegisterPage(driver);
		rp.setfirstname("mahendran");
		rp.setlastname("velu");
		rp.setemail(randomgenstring() +"@gmail.com");
		rp.settelephone("9876543210");
		rp.setpassword("abc123");
		rp.setcpassword("abc123");
		rp.setpolicy();
		rp.setcontinue();
	}
	
	
}
