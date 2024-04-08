package avito.screentest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

abstract public class WebDriverTest {

    public static final WebDriver DRIVER;
    private static final int TIMEOUT_SEC = 15;

    static {
        DRIVER = WebDriverManager.chromedriver()
                .capabilities(new ChromeOptions().addArguments("headless=new").addArguments("start-maximized"))
                .create();
        DRIVER.manage().timeouts()
                .pageLoadTimeout(Duration.ofSeconds(TIMEOUT_SEC))
                .implicitlyWait(Duration.ofSeconds(TIMEOUT_SEC));
    }

    @AfterAll
    public static void tearDown() {
        DRIVER.close();
        DRIVER.quit();
    }
}
