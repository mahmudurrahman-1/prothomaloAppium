package pageObject;

import appiumDriver.PageDriver;import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Common;

import java.util.List;

public class Sections extends Common {
    public Sections() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    //Locators
    @FindBy(className = "androidx.appcompat.app.a$c")
    List<WebElement> islam;
    String newsCon = "com.mcc.prothomalo:id/collection_fragment_recycler_view";
    String headline = "বায়তুল মোকাররমে ঈদের প্রথম জামাত অনুষ্ঠিত";
    @FindBy(id = "com.mcc.prothomalo:id/action_font_resize")
    WebElement fontbtn;
    @FindBy(className = "android.widget.RadioButton")
    List<WebElement> large;
    @FindBy(id = "com.mcc.prothomalo:id/resize_text_apply_button")
    WebElement done;

    //Actions
    //Search by ধর্ম
    public void selectReligion() {
        androidScrollToAnElementByText("ধর্ম");
    }

    //filter by islam
    public void filterbyIslam() {
        islam.get(1).click();
    }

    // scroll to certain news
    public void readNews() {
        androidVerticalScrollToTextById(newsCon, headline);
    }

    // select font button
    public void fontButton() {
        fontbtn.click();
    }

    // filter by large
    public void big() {
        large.get(2).click();
        done.click();
    }
}
