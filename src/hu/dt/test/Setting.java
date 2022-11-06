package hu.dt.test;

public class Setting {

	private static final String pathToGeckoDriver  = "d:\\DT\\WebBrowsers\\FirefoxPortableDriver_31\\geckodriver.exe";
	private static final String pathToFirefox      = "d:\\DT\\WebBrowsers\\FirefoxPortableBin_105\\firefox.exe";
	private static final String pathToChromeDriver = "d:\\DT\\WebBrowsers\\ChromePortableDriver_100\\chromedriver.exe";
	private static final String pathToChrome       = "d:\\DT\\WebBrowsers\\ChromePortableBin_100\\chrome.exe";
	private static final String baseURL       	   = "https://raczpeterantal.hu";
	
	private static final String pathToSceernShots = "d:\\DT\\Screenshots\\";
	private static final String pathToAccount = "d:\\DT\\SeleniumBasicTraining\\Feladatok\\45\\account.txt";

	private static final String emailAddress = "LR31LDDEYO@gmail.com";
	private static final String password = "password";
	public static String getPathtogeckodriver() {
		return pathToGeckoDriver;
	}
	public static String getPathtofirefox() {
		return pathToFirefox;
	}
	public static String getPathtochromedriver() {
		return pathToChromeDriver;
	}
	public static String getPathtochrome() {
		return pathToChrome;
	}
	public static String getPathtosceernshots() {
		return pathToSceernShots;
	}
	public static String getPathtoaccount() {
		return pathToAccount;
	}
	public static String getEmailaddress() {
		return emailAddress;
	}
	public static String getPassword() {
		return password;
	}
	public static String getBaseurl() {
		return baseURL;
	}

	
	
	
}