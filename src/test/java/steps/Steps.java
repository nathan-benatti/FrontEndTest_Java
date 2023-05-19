package steps;
import org.junit.jupiter.api.Test;
import pageObject.GroceryCrudPage;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.*;
//Selenium Behavior Driven-Development Example
//Author: Nathan Benatti Silva

public class Steps {
    GroceryCrudPage page = new GroceryCrudPage();

    @Given("System register the number of entries in the database")
    public void systemRegisterEntries(){page.registerEntries();}
    @Given("User is at the bootstrap_theme_v5 page")
    public void userIsAtBootstrapThemePage(){page.userOpenBootstrapV5();}
    @And("User clicks at +ADDCUSTOMER button")
    public void userClicksAddCustomer(){page.clickAddCustomer();}
    @And("fills every textbox info")
    public void userTextboxInfo(){ page.fillInfo();}
    @And("chooses from DROPDOWN list")
    public void userChooseDropdown() throws InterruptedException {page.chooseDropdown();}
    @And("User clicks SAVE button")
    public void userSaves() throws InterruptedException {page.clickSave();}
    @When("User clicks SAVEBACKTOTHELIST button")
    public void userSavesBacktoTheList() throws InterruptedException {page.clickSaveBackToTheList();}
    @When("User clicks GOBACKTOTHELIST button")
    public void userGoBackToTheList(){page.clickGoBackToTheList();}
    @When("User clicks CANCEL button")
    public void userCancel() throws InterruptedException {page.clickADDCancel();}
    @Then("User is directed to previous page")
    public void userIsOnHomePage(){page.isUserOnHomePage("bootstrap_theme_v5");}
    @Then("User is directed back to previous page")
    public void userIsOnHomePageBack(){page.isUserOnHomePage("bootstrap_theme_v5/success");}
    @And("The Entry number is updated")
    public void systemCheckEntries() throws InterruptedException {page.compareEntries();}
    @And("The Entry number is checked to be the same")
    public void systemCheckEqualEntries() throws InterruptedException {page.compareEqualEntries();}
    @When("User clicks EDITCUSTOMER button")
    public void userGoEditCustomer(){page.clickGoEditCustomer();}
    @Then("User is directed to edit page")
    public void userIsOnEditPage(){page.isUserOnHomePage("bootstrap_theme_v5/edit");}
    @And("User clicks at CHECKBOX")
    public void userClicksCheckbox(){page.clickCheckbox();}
    @And("User clicks at CHECKBOXDELETE button")
    public void userClicksCheckBoxDelete(){page.clickDeleteCheckbox();}
    @When("User clicks at CONFIRMDELETE button")
    public void userConfirmDelete(){page.clickConfirmDelete();}
    @Then("The Entry number is updated - deleted")
    public void systemCheckDeleteEntries() throws InterruptedException {page.compareDeleteEntries();}
    @When("User clicks at CANCELDELETE button")
    public void userCancelCheckBoxDelete(){page.clickCheckBoxCancel();}
    @When("User clicks at CLOSEDELETE button")
    public void userCLoseCheckBoxDelete(){page.clickCheckBoxClose();}






}
