package step_Definition;

import appiumDriver.MainDriver;
import appiumDriver.PageDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hook extends MainDriver {
    @Before
    public void StartBrowser(){
        driver = setup();
    }

    @After
    public void CloseBrowser(){
        PageDriver.getCurrentDriver().quit();
    }
}
