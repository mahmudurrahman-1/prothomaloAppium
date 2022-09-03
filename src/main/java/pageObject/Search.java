package pageObject;

import appiumDriver.PageDriver;import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Common;

public class Search extends Common {
    public Search() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);

    }

    //Locators

    @FindBy(id = "com.mcc.prothomalo:id/search_list_fragment_tet_search")
    WebElement searchInput;
    @FindBy(id = "com.mcc.prothomalo:id/search_list_fragment_iv_voice_search")
    WebElement mic;
    String id = "com.mcc.prothomalo:id/search_list_fragment_rv_recycler_view";
    String headline = "Diary On Bangladesh (Part I)";


    //Actions
    //click on search field
    public void searchField() {
        searchInput.click();
    }

    // search by voice
    public void searchbyVoice() throws InterruptedException {
        mic.click();
        Thread.sleep(5000);
    }

    // scroll to news
    public void findNews() {
        androidVerticalScrollToTextById(id, headline);
    }


}
