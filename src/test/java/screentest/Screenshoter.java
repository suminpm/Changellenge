package screentest;

import com.google.common.io.Files;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;

abstract public class Screenshoter {

    public static void takeScreenshot(WebElement webElement, String browser, String testName) {
        File screenshot = webElement.getScreenshotAs(OutputType.FILE);
        try {
            String fileName = String.format(".//output//%s//%s.png", browser, testName);
            Files.copy(screenshot, new File(fileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
