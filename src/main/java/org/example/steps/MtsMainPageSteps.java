package org.example.steps;

import org.example.pages.MtsMainPage;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import static org.example.steps.DriverInstance.driver;

public class MtsMainPageSteps {
    private final MtsMainPage mtsMainPage;
    private final WebDriver driver;


    public MtsMainPageSteps(WebDriver driver) {
        this.driver = driver;
        this.mtsMainPage = new MtsMainPage(driver);
    }



    public List<String> getpayInstalment() {
        List<String> placeholders = new ArrayList<>();
        for (WebElement placeholder : mtsMainPage.getpayInstalment()) {
            placeholders.add(placeholder.getAttribute("placeholder"));
        }
        return placeholders;
    }

    public List<String> getpayConnection() {
        List<String> placeholders = new ArrayList<>();
        for (WebElement placeholder : mtsMainPage.getpayConnection()) {
            placeholders.add(placeholder.getAttribute("placeholder"));
        }
        return placeholders;
    }

    public List<String> getpayInternet() {
        List<String> placeholders = new ArrayList<>();
        for (WebElement placeholder : mtsMainPage.getpayInternet()) {
            placeholders.add(placeholder.getAttribute("placeholder"));
        }
        return placeholders;
    }

    public List<String> getpayArrears() {
        List<String> placeholders = new ArrayList<>();
        for (WebElement placeholder : mtsMainPage.getpayArrears()) {
            placeholders.add(placeholder.getAttribute("placeholder"));
        }
        return placeholders;
    }

    public void fillPayConnectionForm(String phone, String amount, String email) {
        WebElement phoneInput = driver.findElement(By.xpath("//*[@id='connection-phone']"));
        phoneInput.sendKeys(phone);

        WebElement amountInput = driver.findElement(By.xpath("//*[@id='connection-sum']"));
        amountInput.sendKeys(amount);

        WebElement emailInput = driver.findElement(By.xpath("//*[@id='connection-email']"));
        emailInput.sendKeys(email);
    }

    public void clickPayConnectionButton() {
        WebElement payButton = driver.findElement(By.xpath("//*[@id='pay-connection']/button"));
        payButton.click();
    }

    public List<String> getPaymentDetailsFromFrame() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//div[contains(@class, 'bepaid-app__container')]//iframe")));

        List<WebElement> details = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//section//div[@class='payment-page__container']")));

        List<String> result = new ArrayList<>();
        for (WebElement detail : details) {
            result.add(detail.getText());
        }

        driver.switchTo().defaultContent();

        return result;
    }
}





