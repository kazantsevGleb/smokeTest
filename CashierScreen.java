package org.example.smokeTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CashierScreen {
    private final WebDriverWait wait;
    private final By paymentsSearchForm = By.id("payments_search_form");
    private final By cashReportsForm = By.id("cash_reports_aggregate_form");
    private final By ordersSearchForm = By.id("orders_search_form");
    private final By feedbackPane = By.id("feedbackPane");
    private final By requestsSearchForm = By.id("requests_search_form");
    @FindBy(id = "m_paymentsList")
    WebElement paymentsList;
    @FindBy(id = "m_cashReports")
    WebElement cashReports;
    @FindBy(id = "m_ordersList")
    WebElement ordersList;
    @FindBy(id = "m_feedback")
    WebElement feedback;
    @FindBy(id = "m_requestsList")
    WebElement requestsList;

    public CashierScreen(WebDriver driver) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void paymentsList() {
        paymentsList.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(paymentsSearchForm));
    }

    public void cashReports() {
        cashReports.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(cashReportsForm));
    }

    public void ordersList() {
        ordersList.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(ordersSearchForm));
    }

    public void feedback() {
        feedback.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(feedbackPane));
    }

    public void requestsList() {
        requestsList.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(requestsSearchForm));
    }

}
