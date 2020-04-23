package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.LoginClass;
import util.BrowserFactory;


public class LoginTest {


	@Test
	@Parameters({"username","password"})
	public void TechfiosLogin(String username, String Password) {
		WebDriver driver = BrowserFactory.startBrowser();
		LoginClass loginwebsite = PageFactory.initElements(driver, LoginClass.class);
		loginwebsite.login(username, Password);
		driver.close();
		driver.quit();

	}
}
