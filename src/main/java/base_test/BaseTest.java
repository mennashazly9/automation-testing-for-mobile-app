package base_test;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.time.Duration;
import java.util.logging.Logger;

public class BaseTest {
    private AppiumDriver appiumDriver;
    private WebDriverWait wait;
    Logger log = Logger.getLogger("AD");

    @BeforeClass
    public void setUp() {
        Duration duration = Duration.ofSeconds(15);
        wait = new WebDriverWait(appiumDriver,duration);
    }

    @BeforeClass
    public void  tearDown() {
        appiumDriver.close();
    }

}

