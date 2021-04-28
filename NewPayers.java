package org.example.smokeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NewPayers {

    private final WebDriverWait wait;
    private final By newPayerSearchForm = By.id("newPayerSearchForm");
    private final By applyButton = By.id("appDlgMsgFormCtlYes");
    @FindBy(id = "m_newPayer")
    public WebElement newPayer;
    @FindBy(id = "adress")
    public WebElement address;

    @FindBy(id = "street")
    public WebElement street;

    @FindBy(id = "buildingNumber")
    public WebElement buildingNumber;

    @FindBy(id = "flat")
    public WebElement flat;

    @FindBy(id = "clear_search_params")
    public WebElement clearButton;
    @FindBy(id = "appDlgMsgFormCtlYes")
    public WebElement yesButton;
    @FindBy(id = "personal_account")
    public WebElement personalAccount;
    @FindBy(id = "account")
    public WebElement account;
    @FindBy(id = "barCode")
    public WebElement barCode;

    public NewPayers(WebDriver driver) {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    public void newPayerSearchForm() {
        newPayer.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(newPayerSearchForm));
    }

    public void addressForm(String streetName, String numberOfBuild, String numberOfFlat) {
        address.click();

        street.sendKeys(streetName);

        buildingNumber.sendKeys(numberOfBuild);

        flat.sendKeys(numberOfFlat);

        getClear();
    }

    public void getClear() {

        clearButton.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(applyButton));

        yesButton.click();

    }

    public void personalAccount(String accountNumber, String barCodeNumber) {

        personalAccount.click();

        account.sendKeys(accountNumber);
        barCode.sendKeys(barCodeNumber);

        getClear();

    }

}
