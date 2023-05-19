package pageObject;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.support.How;
import utils.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Set;

//Selenium Behavior Driven-Development Example
//Author: Nathan Benatti Silva
public class GroceryCrudPage {
    private int entryNumber;
    private final WebDriver driver;
    static WebDriverWait wait;

    /* PageFactory & Extra Configs*/
    public GroceryCrudPage() {
        /*Edge Configs - No Need To Download Drivers*/
        /*Change the methods to other drivers if needed*/
        WebDriverManager.edgedriver().setup();
        EdgeOptions options = new EdgeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--remote-allow-origins=*");
        driver = new EdgeDriver(options);
        wait = new WebDriverWait(driver, Utils.getMaxWaitTime());
        PageFactory.initElements(driver, this);
    }
    @FindBy(how = How.CSS, using = "a.btn.btn-default.btn-outline-dark[href='/v1.x/demo/bootstrap_theme_v5/add']")
    private static WebElement addCustomerButton;
    @FindBy(how = How.ID, using = "field-customerName")
    private static WebElement firstNameInput;
    @FindBy(how = How.ID, using = "field-contactLastName")
    private static WebElement lastNameInput;
    @FindBy(how = How.ID, using = "field-contactFirstName")
    private static WebElement contactFirstNameInput;
    @FindBy(how = How.ID, using = "field-phone")
    private static WebElement phoneInput;
    @FindBy(how = How.ID, using = "field-addressLine1")
    private static WebElement addressLine1Input;
    @FindBy(how = How.ID, using = "field-addressLine2")
    private static WebElement addressLine2Input;
    @FindBy(how = How.ID, using = "field-city")
    private static WebElement cityInput;
    @FindBy(how = How.ID, using = "field-state")
    private static WebElement stateInput;
    @FindBy(how = How.ID, using = "field-postalCode")
    private static WebElement postalCodeInput;
    @FindBy(how = How.ID, using = "field-country")
    private static WebElement countryInput;
    @FindBy(how = How.ID, using = "field-creditLimit")
    private static WebElement creditLimitInput;
    @FindBy(how = How.ID, using = "field-deleted")
    private static WebElement deletedInput;
    @FindBy(how = How.ID, using = "field_salesRepEmployeeNumber_chosen")
    private static WebElement employeerDropDownList;
    @FindBy(how = How.CSS, using = "li[data-option-array-index=\"2\"][class=\"active-result\"]\n")
    private static WebElement employeerBondur;
    @FindBy(how= How.CSS, using = "span.current-total-results")
    private static WebElement numberEntries;
    @FindBy(how = How.CSS, using = "button.btn.btn-secondary.btn-success.b10#form-button-save")
    private static WebElement saveButton;
    @FindBy(how = How.ID, using = "save-and-go-back-button")
    private static WebElement saveBackToTheListButton;
    @FindBy(how = How.ID, using = "cancel-button")
    private static WebElement addCancelButton;
    @FindBy(how = How.CSS, using = "a[href='/v1.x/demo/bootstrap_theme_v5/']")
    private static WebElement goBackToTheListButton;
    @FindBy(how = How.CSS, using = "a.go-to-edit-form[href*='/edit/']")
    private static WebElement goEditCustomerButton;
    @FindBy(how = How.CSS, using = "i.el.el-refresh")
    private static WebElement refreshButton;
    @FindBy(how = How.CSS, using = "th[data-order-by='customerName']")
    private static WebElement nameFilterButton;
    @FindBy(how = How.XPATH, using = "//*[@id=\"gcrud-search-form\"]/div[2]/table/tbody/tr[1]/td[1]/input")
    private static WebElement checkBox;
    @FindBy(how = How.XPATH, using = "//*[@id=\"gcrud-search-form\"]/div[2]/table/thead/tr[2]/td[2]/div[1]/a/span")
    private static WebElement deleteCheckbox;
    @FindBy(how = How.CSS, using = "button.btn.btn-danger.delete-multiple-confirmation-button")
    private static WebElement confirmDelete;
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/div[3]/div/div/div[3]/button[1]")
    private static WebElement cancelDelete;
    @FindBy(how = How.XPATH, using = "/html/body/div[2]/div[2]/div[3]/div/div/div[1]/button")
    private static WebElement closeDelete;
    @FindBy(how = How.XPATH, using = "//p[contains(text(),'Are you sure that you want to delete this 1 item?')]")
    private static WebElement deleteConfirmation;



    public void registerEntries(){
        entryNumber = Integer.parseInt(numberEntries.getText());
        System.out.println("There are a total of: " + entryNumber + " Entries");
    }
    public void compareEntries() throws InterruptedException {
        int updatedEntryNumber = Integer.parseInt(numberEntries.getText());
        Thread.sleep(300);
        System.out.println("Updated: There are a total of: "+ updatedEntryNumber + " Entries");
        Assert.assertTrue(updatedEntryNumber == entryNumber + 1);
    }
    public void compareEqualEntries() throws InterruptedException {
        int updatedEntryNumber = Integer.parseInt(numberEntries.getText());
        Thread.sleep(300);
        System.out.println("Updated: There are a total of: "+ updatedEntryNumber + " Entries");
        Assert.assertTrue(updatedEntryNumber == entryNumber);
    }
    public void compareDeleteEntries() throws InterruptedException {
        Thread.sleep(10000);
        int updatedEntryNumber = Integer.parseInt(numberEntries.getText());
        System.out.println("Updated: There are a total of: "+ updatedEntryNumber + " Entries");
        Assert.assertTrue(updatedEntryNumber == entryNumber - 1);
    }
    public void userOpenBootstrapV5() {
        driver.get("https://www.grocerycrud.com/v1.x/demo/bootstrap_theme_v5/");
    }
    public void clickAddCustomer() {
        addCustomerButton.click();
    }
    public static void fillInfo(){
        wait.until(ExpectedConditions.visibilityOf(firstNameInput));
        firstNameInput.sendKeys("Nome");
        wait.until(ExpectedConditions.visibilityOf(lastNameInput));
        lastNameInput.sendKeys("Sobrenome");
        wait.until(ExpectedConditions.visibilityOf(lastNameInput));
        contactFirstNameInput.sendKeys("Primeiro nome de contato");
        wait.until(ExpectedConditions.visibilityOf(lastNameInput));
        phoneInput.sendKeys("1234567890");
        wait.until(ExpectedConditions.visibilityOf(lastNameInput));
        addressLine1Input.sendKeys("Rua 1");
        wait.until(ExpectedConditions.visibilityOf(lastNameInput));
        addressLine2Input.sendKeys("Rua 2");
        wait.until(ExpectedConditions.visibilityOf(lastNameInput));
        cityInput.sendKeys("Cidade");
        wait.until(ExpectedConditions.visibilityOf(lastNameInput));
        stateInput.sendKeys("Estado");
        wait.until(ExpectedConditions.visibilityOf(lastNameInput));
        postalCodeInput.sendKeys("codigo postal");
        wait.until(ExpectedConditions.visibilityOf(lastNameInput));
        countryInput.sendKeys("pais");
        wait.until(ExpectedConditions.visibilityOf(lastNameInput));
        creditLimitInput.sendKeys("limite de credito");
        wait.until(ExpectedConditions.visibilityOf(lastNameInput));
        deletedInput.sendKeys("deletado");
    }

    public void chooseDropdown() throws InterruptedException {
        //JavascriptExecutor js = (JavascriptExecutor) driver;
        //js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(100);
        wait.until(ExpectedConditions.visibilityOf(employeerDropDownList));
        employeerDropDownList.click();
        wait.until(ExpectedConditions.elementToBeClickable(employeerBondur));
        employeerBondur.click();
        Thread.sleep(100);
    }
    public void clickSave() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(500);
        wait.until(ExpectedConditions.elementToBeClickable(saveButton));
        saveButton.click();
    }

    public void clickSaveBackToTheList() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(500);
        wait.until(ExpectedConditions.elementToBeClickable(saveBackToTheListButton));
        saveBackToTheListButton.click();
        Thread.sleep(500);
    }
    public void clickADDCancel() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        Thread.sleep(500);
        wait.until(ExpectedConditions.elementToBeClickable(addCancelButton));
        addCancelButton.click();
    }
    public void clickGoBackToTheList(){
        wait.until(ExpectedConditions.elementToBeClickable(goBackToTheListButton));
        goBackToTheListButton.click();}
    public void clickGoEditCustomer(){
        wait.until(ExpectedConditions.elementToBeClickable(goEditCustomerButton));
        goEditCustomerButton.click();
    }

    public static void clickCheckbox(){checkBox.click();}
    public static void clickDeleteCheckbox(){deleteCheckbox.click();}
    public static void clickConfirmDelete(){confirmDelete.click();}
    public static void clickCheckBoxCancel(){
        wait.until(ExpectedConditions.elementToBeClickable(cancelDelete));
        cancelDelete.click();}
    public static void clickCheckBoxClose(){
        wait.until(ExpectedConditions.elementToBeClickable(closeDelete));
        closeDelete.click();}

    public static boolean isUserOnHomePage(String url){
        try{
            wait.until(ExpectedConditions.urlContains(url)); // urlContains > urltoBe
        }catch(WebDriverException e){
            System.out.printf(e.getMessage());
            return false;
        }
        return true;
    }
    public static boolean isCheckboxDeleted(){
        try{
            wait.until(ExpectedConditions.visibilityOf(deleteConfirmation));
        }catch(WebDriverException e){
            System.out.printf(e.getMessage());
            return false;
        }
        return true;
    }
    public static void clickRefresh() {refreshButton.click();}
    public static void clickName() {nameFilterButton.click();}




}