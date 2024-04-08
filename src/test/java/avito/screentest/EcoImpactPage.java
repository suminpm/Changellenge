package avito.screentest;

import com.google.common.io.Files;
import lombok.Getter;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;

@Getter
public class EcoImpactPage {

    private static final String ECO_IMPACT_URL = "https://www.avito.ru/avito-care/eco-impact";

    @FindBy(xpath = "//div[@class='desktop-wrapper-OutiE']")
    private WebElement counterBlock;

    @FindBy(xpath = "//img[@class='desktop-water1-LWlZZ']/..")
    private WebElement waterMeter;

    @FindBy(xpath = "//img[@class='desktop-sun-JCEQH']/..")
    private WebElement energyMeter;

    @FindBy(xpath = "//img[@class='desktop-bird-xXtiX']/..")
    private WebElement carbonDioxideMeter;

    public EcoImpactPage(WebDriver driver) {
        driver.get(ECO_IMPACT_URL);
        PageFactory.initElements(driver, this);
    }

    public static void takeScreenshot(WebElement webElement, String testName) {
        File screenshot = webElement.getScreenshotAs(OutputType.FILE);
        try {
            String fileName = String.format(".//output//%s.png", testName);
            Files.copy(screenshot, new File(fileName));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
