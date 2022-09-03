package step_Definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePage;
import pageObject.Search;

public class SearchTest {
    HomePage homePage =new HomePage();

    Search searchPage =new Search();

    //Scenario Sujon search thing by google mic

    @Given("^Sujon open the app$")
    public void openAppagain(){
        homePage.skipoption();
    }
    @And("^Sujon click on the search icon down$")
    public void filterSearch(){
        homePage.gotoSearch();
    }
    @When("^Sujon give input from excel into the input field$")
    public void searchByvoice() throws InterruptedException{
        searchPage.searchField();
        searchPage.searchbyVoice();
        Thread.sleep(3000);
    }
    @Then("^Sujon Scroll down and select on news$")
    public void newsSelection() throws InterruptedException{

        searchPage.findNews();
        Thread.sleep(4000);

    }
}
