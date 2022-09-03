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
    public static AndroidDriver driver = null;
    //Objects
    DesiredCapabilities capabilities =new DesiredCapabilities();
    URL url = null;
    //a return able androiddriver type setup function
    //driver will be return to setup();
    public AndroidDriver setup(){

       //Setting up capabilities
       capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
       capabilities.setCapability(MobileCapabilityType.UDID,"DEFNW18B08002204");
       capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"HUAWEI Y9 2019");
       capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"8.1.0");
        capabilities.setCapability("appPackage", "com.mcc.prothomalo");
        capabilities.setCapability("appActivity", "com.quintype.prothomalo.main.activities.MainActivity");

//       File file =new File("src/main/resources","prothamalo.apk");
//       capabilities.setCapability(MobileCapabilityType.APP,file.getAbsoluteFile());
//        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");

        //Set up url path
        try{
            url=new URL("http://0.0.0.0:4723/wd/hub");
        }
        catch (MalformedURLException mue){
            mue.printStackTrace();
        }

       //setting up driver
        driver=new AndroidDriver(url,capabilities);
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        PageDriver.getInstance().setDriver(driver);
        return driver;
    }
}
