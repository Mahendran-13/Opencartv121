package testcases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTestCase {

	public WebDriver driver;
	@BeforeClass
	public void setup()
	{
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();
	}

	@AfterClass
	public void teardown()
	{
		driver.quit();
	}

	public String randomgenstring()
	{
		String	generatestring = RandomStringUtils.randomAlphabetic(7);// randomstringutis is inbuild class 
		return generatestring;  //we can call differenet method in same class
	}

}
