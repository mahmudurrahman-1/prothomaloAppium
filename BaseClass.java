

        package appiumDriver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class MainDriver {
    //setup Android Driver as static for reuse without creating any object
    public static AndroidDriver driver;
    //Objects
    DesiredCapabilities cap = new DesiredCapabilities();
    URL url = null;

    //a return able androiddriver type setup function
    //driver will be return to setup();
    public AndroidDriver setup() {

        //Setting up capabilities
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "HUAWEI Y9 2019");
        cap.setCapability(MobileCapabilityType.UDID, "DEFNW18B08002204");

        cap.setCapability("appPackage", "com.mcc.prothomalo");
        cap.setCapability("appActivity", "com.quintype.prothomalo.main.activities.MainActivity");


//        //APK file path
//        File appDir = new File("src/main/resources");
//        File app = new File(appDir, "prothomalo.apk");
//        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());

        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

        // Appium server
        URL url = null;
        try {
            url = new URL("http://127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        assert url != null;

        driver = new AndroidDriver(url, cap);

        //setting up driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        PageDriver.getInstance().setDriver(driver);
        return driver;
    }
}

        return driver;
