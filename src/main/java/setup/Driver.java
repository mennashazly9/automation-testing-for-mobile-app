package setup;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

public class Driver {
    private Logger log = Logger.getLogger("AD");
    public AppiumDriver appiumDriver;

    private Driver() {
    }

    private static Driver instance = new Driver();

    public static Driver getInstance() {
        return instance;
    }

    private ThreadLocal<AppiumDriver> threadLocal = new ThreadLocal<AppiumDriver>() {

        protected AppiumDriver initialValue() {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("appium-version", "1.21.0");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("platformVersion", "12.0");
            capabilities.setCapability("deviceName", "Pixel_3a_API_31");
            capabilities.setCapability("app", "C:\\Users\\menna\\Desktop\\task\\src\\application.apk");
            try {
                appiumDriver = new AppiumDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
//                appiumDriver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
                log.info("Create instance of Android Driver");


            } catch (MalformedURLException e) {
                e.printStackTrace();
                log.info("Instance of Android Driver is not created");};

            return appiumDriver;

        }

    };

    public AppiumDriver getAppiumDriver() {

        return threadLocal.get();
    }

    public void removeDriver() {
        appiumDriver = threadLocal.get();
        try {
            appiumDriver.quit();
        } finally {
            threadLocal.remove();
        }
        appiumDriver.close();
    }


}
