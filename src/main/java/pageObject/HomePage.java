package pageObject;


import appiumDriver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    public HomePage() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    /***********
     * Locators
     * android:id/button2
     * com.daraz.android:id/intro_skip_btn
     *
     */
    @FindBy(id = "com.mcc.prothomalo:id/action_sections")
    WebElement sectionsbtn;
    @FindBy(id = "com.mcc.prothomalo:id/action_search")
    WebElement searchbtn;
    @FindBy(id = "com.mcc.prothomalo:id/action_my_app")
    WebElement appbtn;
    @FindBy(id = "android:id/button2")
    WebElement skip;
    @FindBy(className = "android.widget.FrameLayout")
    WebElement account;
    @FindBy(id = "com.mcc.prothomalo:id/menu_item_name")
    WebElement menuItem;

    public void gotoSection() {
        sectionsbtn.click();
    }

    public void gotoSearch() {
        searchbtn.click();
    }

    public void gotoMyapp() {
        appbtn.click();
    }

    public void skipoption() {
        skip.click();
    }

}
