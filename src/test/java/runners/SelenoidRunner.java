package runners;

import com.codeborne.selenide.Selenide;
import com.thoughtworks.gauge.BeforeSuite;
import config.SelenoidConfig;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class SelenoidRunner {

    @BeforeSuite
    public void setUp() {
        SelenoidConfig selenoidConfig = new SelenoidConfig();
        selenoidConfig.createWebDriverInstance("Chrome");
    }

    @AfterMethod(alwaysRun = true)
    public void tearDown() {
        Selenide.closeWebDriver();
    }

}
