package org.example.smokeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginPage {
    private final WebDriver driver;
    private final WebDriverWait wait;
    private final By headInfoForm = By.id("headInfoForm");
    @FindBy(id = "submitLoginFormButton")
    private WebElement submitLoginFormButton;

    @FindBy(id = "j_username")
    private WebElement username;

    @FindBy(id = "j_password")
    private WebElement password;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void open() {
        driver.get("https://spps-develop.platosfera.ru/");
    }

    public void getStarted(String userName, String passWord) {
        username.sendKeys(userName);
        password.sendKeys(passWord);
        submitLoginFormButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(headInfoForm));
    }

}
