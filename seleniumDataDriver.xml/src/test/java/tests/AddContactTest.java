package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import pages.ContactPage;
import pages.DashboardPage;
import pages.LoginClass;
import util.BrowserFactory;

public class AddContactTest {
	// String username;
	// String password;

	@Test
	@Parameters({ "username", "Password", "name", "company" })
	public void AddingContact(String username, String Password, String name, String company, String email) {
		WebDriver driver = BrowserFactory.startBrowser();

		LoginClass loginwebsite = PageFactory.initElements(driver, LoginClass.class);
		loginwebsite.login(username, Password);

		String expectedTittle = "Dashbord- TechFios Test Application - Billing";
		String actualTittle = loginwebsite.getPageTittle();
		Assert.assertEquals(expectedTittle, actualTittle);

		DashboardPage Dashboard = PageFactory.initElements(driver, DashboardPage.class);
		Dashboard.ClickAddContact();

		ContactPage Contact = PageFactory.initElements(driver, ContactPage.class);
		Contact.FillupContactForm(name, company, email);

		driver.close();
		driver.quit();
	}

}
