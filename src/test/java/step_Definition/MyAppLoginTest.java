package step_Definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.HomePage;
import pageObject.MyApp;

public class MyAppLoginTest {
    HomePage homePage =new HomePage();
    MyApp myappPage =new MyApp();
    //Scenario Sujon login to application
    @Given("^Sujon open prothom alo app$")
    public void againOpenApp(){
        homePage.skipoption();
    }
    @And("^Sujon clicks on my app$")
    public void filterMyApp(){
        homePage.gotoMyapp();
    }
    @And("^Sujon select login to enter$")
    public void LoginButton(){
        myappPage.clickonLogin();
    }
    @When("^Sujon enters email and password$")
    public void HandleLogin(){
        myappPage.siginInHandler();
    }
    @Then("^Sujon successfully login$")
    public void success(){
        myappPage.popup();
    }
}
