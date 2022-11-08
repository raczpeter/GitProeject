package hu.dt.browser;

import hu.dt.test.Setting;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.RemoteWebDriver;

public class WebBrowser {

	public static WebDriver createDriver(WebBrowserType type) {
		WebDriver driver = null;
		FirefoxOptions ffOptions;
		ChromeOptions chromeOptions;
		
		switch (type) {
		case Chrome:
			System.setProperty("webdriver.chrome.driver",
					Setting.getPathtochromedriver());
			chromeOptions = new ChromeOptions();
			chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"}); 
			chromeOptions.setBinary(Setting.getPathtochrome());

			driver = new ChromeDriver(chromeOptions);
			break;
		case Firefox:
			System.setProperty("webdriver.gecko.driver", Setting.getPathtogeckodriver());
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "false");

			ffOptions = new FirefoxOptions();
			ffOptions.setProfile(new FirefoxProfile());
			ffOptions.setLogLevel(FirefoxDriverLogLevel.DEBUG);
//			ffOptions.setCapability("marionette", true);
			
			ffOptions.setBinary(Setting.getPathtofirefox());
			driver = new FirefoxDriver(ffOptions);
			break;
		default:
			break;
		}
		Capabilities caps = ((RemoteWebDriver) driver).getCapabilities();
		String browserName = caps.getBrowserName();
		String browserVersion = caps.getBrowserVersion();
		System.out.println("Browser is: " + browserName+" "+browserVersion);
		return driver;
	}
}
