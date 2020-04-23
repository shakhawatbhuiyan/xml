package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;


import util.BrowserFactory;

public class LoginClass {
	WebDriver driver;

	public LoginClass(WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.ID, using = "username")
	WebElement Username;

	@FindBy(how = How.ID, using = "password")
	WebElement Passwoard;

	@FindBy(how = How.NAME, using = "login")
	WebElement signingButton;

	public void login(String username,String Password) {
		Username.sendKeys(username);
		Passwoard.sendKeys(Password);
		signingButton.click();
	}

	public String getPageTittle() {
		return driver.getTitle();
	}
}
