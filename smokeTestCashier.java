package org.example.smokeTest;

import org.example.WebDriverSettings;
import org.junit.Test;
import org.openqa.selenium.support.PageFactory;

public class smokeTestCashier extends WebDriverSettings {
    @Test

    public void smokeTest() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        CashierScreen cashierScreen = PageFactory.initElements(driver, CashierScreen.class);
        NewPayers newPayers = PageFactory.initElements(driver, NewPayers.class);

        loginPage.open();
        loginPage.getStarted("kazantsevg", "Oksana94");

        newPayers.newPayerSearchForm();
        newPayers.addressForm("мкр. Горский", "53", "3");
        newPayers.personalAccount("54148176412", "1823716273");

        cashierScreen.paymentsList();
        cashierScreen.cashReports();
        cashierScreen.ordersList();
        cashierScreen.feedback();
        cashierScreen.requestsList();
    }
}
