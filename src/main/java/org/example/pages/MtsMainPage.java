package org.example.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MtsMainPage extends BasePage{

    private final By paymentSectionTitleLocator =By.xpath("//section[@class='pay']//h2[contains(text(),'Онлайн пополнение') and " +
            "contains(., 'без комиссии')]");

    private final By payInstalment = By.xpath("//form[contains(@class, 'pay-form') and @id='pay-instalment']//input");

    private final By payConnection = By.xpath("//form[contains(@class, 'pay-form') and @id='pay-connection']//input");

    private final By payInternet = By.xpath("//form[contains(@class, 'pay-form') and @id='pay-internet']//input");

    private final By payArrears = By.xpath("//form[contains(@class, 'pay-form') and @id='pay-arrears']//input");




    public MtsMainPage(WebDriver driver) {
        super(driver);
    }

    public List<WebElement> getpayInstalment() {
        return driver.findElements(payInstalment);
    }
    public List<WebElement> getpayConnection() {
        return driver.findElements(payConnection);
    }
    public List<WebElement> getpayInternet() {
        return driver.findElements(payInternet);
    }
    public List<WebElement> getpayArrears() {
        return driver.findElements(payArrears);
    }
}
