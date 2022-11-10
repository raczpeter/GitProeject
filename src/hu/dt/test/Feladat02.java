package hu.dt.test;

import hu.dt.browser.WebBrowser;
import hu.dt.browser.WebBrowserType;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Feladat02 {

    WebDriver driver = null;
    ChromeOptions chromeOptions;

    @BeforeEach
    public void setup() {
//        System.setProperty("webdriver.chrome.driver","d:\\WebBrowsers\\ChromePortableDriver_106\\chromedriver.exe");
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.setBinary("d:\\WebBrowsers\\ChromePortableBin_106\\chrome.exe");
        driver = WebBrowser.createDriver(WebBrowserType.Chrome);
    }

    @Test
    public void testFeladat02() throws Exception {
        driver.get("https://raczpeterantal.hu");
        Thread.sleep(5000);
    }

    @AfterEach
    public void tearDown() throws Exception {
        driver.quit();
    }

}
