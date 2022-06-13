package screens;

import setup.Driver;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Wait;

import java.util.logging.Logger;

public abstract class BaseScreen {

    protected Logger log = Logger.getLogger("AD");
    protected Wait<AppiumDriver> wait;

    public BaseScreen() {
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getInstance().getAppiumDriver()), this);
    }




}

