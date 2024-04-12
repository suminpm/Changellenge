package screentest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.time.Duration;

abstract public class WebDriversTest {

    public static final WebDriver DRIVER_CHROME;
    public static final WebDriver DRIVER_FIREFOX;
    private static final int TIMEOUT_SEC = 15;

    static {
        DRIVER_CHROME = WebDriverManager.chromedriver()
                .capabilities(
                        new ChromeOptions()
                                .addArguments("start-maximized")
                                .addArguments("headless=new")
                                .setPageLoadTimeout(Duration.ofSeconds(TIMEOUT_SEC))
                                .setImplicitWaitTimeout(Duration.ofSeconds(TIMEOUT_SEC))
                )
                .create();

        DRIVER_FIREFOX = WebDriverManager.firefoxdriver()
                .capabilities(
                        new FirefoxOptions()
                                .addArguments("-headless")
                                .setPageLoadTimeout(Duration.ofSeconds(TIMEOUT_SEC))
                                .setImplicitWaitTimeout(Duration.ofSeconds(TIMEOUT_SEC))
                )
                .create();
    }

    @AfterAll
    public static void tearDown() {
        DRIVER_CHROME.close();
        DRIVER_CHROME.quit();
        DRIVER_FIREFOX.quit();
    }
}