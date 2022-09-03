package appiumDriver;

import io.appium.java_client.android.AndroidDriver;

public class PageDriver {
    public static final ThreadLocal<AndroidDriver> adv = new ThreadLocal<>();
    private static PageDriver instance = null;
    private PageDriver(){
        //empty
    }

    //instantiate this class
    public static PageDriver getInstance(){
        if(instance==null){
            instance =new PageDriver();
        }
        return instance;
    }

    //Set Driver
    public void setDriver(AndroidDriver driver){
        if (adv.get() == null){
            adv.set(driver);
        }
    }
    //Get Driver
    public AndroidDriver getDriver(){
        return adv.get();
    }
    //Get Current Driver
    public static AndroidDriver getCurrentDriver(){
       return getInstance().getDriver();
    }
}
