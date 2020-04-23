package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	static WebDriver driver;

	public static WebDriver startBrowser() {

		System.setProperty("webdriver.chrome.driver", "/driver/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("http://techfios.com/test/billing/?ng=admin");

		driver.manage().window().maximize();

		return driver;
	}

}
