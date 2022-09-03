package pageObject;

import appiumDriver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Common;

public class MyApp extends Common {
    public MyApp() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);

    }

    //Locators
    @FindBy(id = "com.mcc.prothomalo:id/user_profile_element_holder_btn_sign_in")
    WebElement signin;
    @FindBy(id = "com.mcc.prothomalo:id/fragment_login_tet_email")
    WebElement inputEmail;
    @FindBy(id = "com.mcc.prothomalo:id/fragment_login_tet_password")
    WebElement inputPassword;
    @FindBy(id = "com.mcc.prothomalo:id/fragment_registration_btn_continue")
    WebElement submit;

    //Actions
    //go for sign in
    public void clickonLogin() {
        signin.click();
    }

    // Sign in Handler
    public void siginInHandler() {
        sendText(inputEmail, "00-0@gmail.com");
        sendText(inputPassword, "@ZV7tqprQG2AdMr");
        submit.click();
    }

    // Handle popup
    public void popup() {
        System.out.println("You are done");
    }

}
