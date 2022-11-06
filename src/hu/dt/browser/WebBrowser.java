package hu.dt.browser;

import hu.dt.test.Setting;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxDriverLogLevel;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

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
		case ChromeWDM:
			WebDriverManager.chromedriver().setup();
			chromeOptions = new ChromeOptions();
			chromeOptions.setExperimentalOption("excludeSwitches", new String[]{"enable-automation"});

			driver = new ChromeDriver(chromeOptions);
			break;
		case FirefoxWDM:
			WebDriverManager.firefoxdriver().setup();
			System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "false");

			ffOptions = new FirefoxOptions();
			ffOptions.setProfile(new FirefoxProfile());
			ffOptions.setLogLevel(FirefoxDriverLogLevel.DEBUG);
			
			driver = new FirefoxDriver(ffOptions);
			break;
			
		case EdgeWDM:
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		case SafariWDM:
			WebDriverManager.safaridriver();
			driver = new SafariDriver();
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
