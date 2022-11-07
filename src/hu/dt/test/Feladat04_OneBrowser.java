package hu.dt.test;


import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Feladat04_OneBrowser {

    public static WebDriver driver = null;
    ChromeOptions chromeOptions;

    @BeforeAll
    public static void setup() {
        System.setProperty("webdriver.chrome.driver","d:\\WebBrowsers\\ChromePortableDriver_106\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setBinary("d:\\WebBrowsers\\ChromePortableBin_106\\chrome.exe");
        driver = new ChromeDriver(chromeOptions);
    }

    @RepeatedTest(value = 5, name = "{displayName} {currentRepetition}/{totalRepetitions}")
    @DisplayName("RepeatingTest")
    public void testFeladat04OneBrowser() throws Exception {
        driver.get("https://raczpeterantal.hu");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Chapter1")).click();
        Thread.sleep(2000);
    }

    @AfterAll
    public static void tearDown() throws Exception {
            driver.quit();

    }

    public static class Feladat02 {

        WebDriver driver = null;
        ChromeOptions chromeOptions;

        @BeforeEach
        public void setup() {
            System.setProperty("webdriver.chrome.driver","d:\\WebBrowsers\\ChromePortableDriver_106\\chromedriver.exe");
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.setBinary("d:\\WebBrowsers\\ChromePortableBin_106\\chrome.exe");
            driver = new ChromeDriver(chromeOptions);
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
}
