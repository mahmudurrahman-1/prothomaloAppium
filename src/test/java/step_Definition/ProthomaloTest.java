package step_Definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePage;
import pageObject.MyApp;
import pageObject.Search;
import pageObject.Sections;

public class ProthomaloTest {

    HomePage homePage =new HomePage();
    Sections sectionpage =new Sections();




    @Given("^Sujon open the prothomalo app$")
    public void openApp(){

        homePage.skipoption();
    }
    @And("^Sujon Selects Section$")
    public void filterSection(){
        homePage.gotoSection();

    }
    @And("^Sujon choose ধর্ম from sections$")
    public void chooseReligion(){
        sectionpage.selectReligion();

    }
    @And("^Sujon filter news by Islam$")
    public void chooseIslam(){

        sectionpage.filterbyIslam();
    }
    @And("^Sujon finds \"([^\"]*)\" and clicked on that$")
    public void findAnews(String val){
        if(val.equals("headline")) {
            sectionpage.readNews();
        }
    }
    @When("^Sujon click on top right font$")
    public void selectFont(){
        sectionpage.fontButton();
    }
    @Then("^Sujon selects first and click ok$")
    public void clickOk(){
        sectionpage.big();
    }

}
