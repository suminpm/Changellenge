package avito.screentest;

import org.junit.jupiter.api.Test;

public class EcoImpactPageTest extends WebDriverTest {

    private static final EcoImpactPage ECO_IMPACT_PAGE = new EcoImpactPage(WebDriverTest.DRIVER);

    @Test
    public void screenshotWaterMeter() {
        EcoImpactPage.takeScreenshot(ECO_IMPACT_PAGE.getWaterMeter(), "screenshotWaterMeter");
    }

    @Test
    public void screenshotEnergyMeter() {
        EcoImpactPage.takeScreenshot(ECO_IMPACT_PAGE.getEnergyMeter(), "screenshotEnergyMeter");
    }

    @Test
    public void screenshotCarbonDioxideMeter() {
        EcoImpactPage.takeScreenshot(ECO_IMPACT_PAGE.getCarbonDioxideMeter(), "screenshotCarbonDioxideMeter");
    }

    @Test
    public void screenshotCounterBlock() {
        EcoImpactPage.takeScreenshot(ECO_IMPACT_PAGE.getCounterBlock(), "screenshotCounterBlock");
    }
}
