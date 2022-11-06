package hu.dt.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Feladat03_OneBrowser {

    public static WebDriver driver = null;
    ChromeOptions chromeOptions;

    @BeforeAll
    public static void setup() {
        System.setProperty("webdriver.chrome.driver","d:\\WebBrowsers\\ChromePortableDriver_106\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBinary("d:\\WebBrowsers\\ChromePortableBin_106\\chrome.exe");
        driver = new ChromeDriver(chromeOptions);
    }


    @ParameterizedTest
    @ValueSource(strings = { "Chapter1", "Chapter2", "Chapter3", "Chapter4", "Chapter5" })
    public void testFeladat03(String chapter) throws Exception {
        driver.get("https://raczpeterantal.hu");
        Thread.sleep(2000);
        driver.findElement(By.linkText(chapter)).click();
        Thread.sleep(2000);
    }

    @AfterAll
    public static void tearDown() throws Exception {
        driver.quit();
    }
}
