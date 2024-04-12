package screentest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

public class EcoImpactPageTest extends WebDriversTest {

    private static final EcoImpactPage CHROME_ECO_PAGE = new EcoImpactPage(WebDriversTest.DRIVER_CHROME);
    private static final EcoImpactPage FOX_ECO_PAGE = new EcoImpactPage(WebDriversTest.DRIVER_FIREFOX);

    private String testName;

    @BeforeEach
    void setTestName(TestInfo testInfo) {
        testName = testInfo.getDisplayName().replace("()", "");
    }

    @Test
    public void eip_001_screenshotWaterMeterByUnauthorizedUser() {
        Screenshoter.takeScreenshot(CHROME_ECO_PAGE.getWaterMeter(), "chrome", testName);
        Screenshoter.takeScreenshot(FOX_ECO_PAGE.getWaterMeter(), "firefox", testName);
    }

    @Test
    public void eip_002_screenshotCarbonDioxideMeterByUnauthorizedUser() {
        Screenshoter.takeScreenshot(CHROME_ECO_PAGE.getCarbonDioxideMeter(), "chrome", testName);
        Screenshoter.takeScreenshot(FOX_ECO_PAGE.getCarbonDioxideMeter(), "firefox", testName);
    }

    @Test
    public void eip_003_screenshotEnergyMeterByUnauthorizedUser() {
        Screenshoter.takeScreenshot(CHROME_ECO_PAGE.getEnergyMeter(), "chrome", testName);
        Screenshoter.takeScreenshot(FOX_ECO_PAGE.getEnergyMeter(), "firefox", testName);
    }

    @Test
    public void eip_004_screenshotCounterBlockByUnauthorizedUser() {
        Screenshoter.takeScreenshot(CHROME_ECO_PAGE.getCounterBlock(), "chrome", testName);
        Screenshoter.takeScreenshot(FOX_ECO_PAGE.getCounterBlock(), "firefox", testName);
    }
}