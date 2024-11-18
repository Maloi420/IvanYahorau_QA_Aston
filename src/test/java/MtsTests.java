import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.steps.MtsMainPageSteps;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.example.steps.DriverInstance.*;

public class MtsTests {

    private MtsMainPageSteps steps;

    @BeforeEach
    public void setUp() {
        driver = getInstance();
        steps = new MtsMainPageSteps(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.get("https://www.mts.by");
        WebElement acceptCookieButton = driver.findElement(By.id("cookie-agree"));
        if (acceptCookieButton != null && acceptCookieButton.isDisplayed()) {
            acceptCookieButton.click();
        }
    }

    @AfterEach
    public void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
    }

    @Test
    public void payInstalment(){
        List<String> expectedPlaceholders = Arrays.asList("Номер счета на 44", "Сумма", "E-mail для отправки чека");
        List<String> placeholderPhone = steps.getpayInstalment();
        for (int i = 0; i < expectedPlaceholders.size(); i++) {
            assertEquals(expectedPlaceholders.get(i), placeholderPhone.get(i));
        }
    }
    @Test
    public void payConnection(){
        List<String> expectedPlaceholders = Arrays.asList("Номер телефона", "Сумма", "E-mail для отправки чека");
        List<String> placeholderPhone = steps.getpayConnection();
        for (int i = 0; i < expectedPlaceholders.size(); i++) {
            assertEquals(expectedPlaceholders.get(i), placeholderPhone.get(i));
        }
    }
    @Test
    public void payInternet(){
        List<String> expectedPlaceholders = Arrays.asList("Номер абонента", "Сумма", "E-mail для отправки чека");
        List<String> placeholderPhone = steps.getpayInternet();
        for (int i = 0; i < expectedPlaceholders.size(); i++){
            assertEquals(expectedPlaceholders.get(i), placeholderPhone.get(i));
        }
    }
    @Test
    public void payArrears(){
        List<String> expectedPlaceholders = Arrays.asList("Номер счета на 2073", "Сумма", "E-mail для отправки чека");
        List<String> placeholderPhone = steps.getpayArrears();
        for (int i = 0; i < expectedPlaceholders.size(); i++){
            assertEquals(expectedPlaceholders.get(i), placeholderPhone.get(i));
        }
    }
    @Test
    public void testPayConnectionFrame() {
        steps.fillPayConnectionForm("297777777", "10", "StrAston@gmail.com");
        steps.clickPayConnectionButton();

        List<String> paymentDetails = steps.getPaymentDetailsFromFrame();

        assertEquals("10.00 BYN", paymentDetails.get(0));
        assertEquals("Оплатить 10.00 BYN", paymentDetails.get(1));
        assertEquals("Оплата: Услуги связи Номер:375297777777", paymentDetails.get(2));
        assertEquals("Номер карты", paymentDetails.get(3));
        assertEquals("Срок действия", paymentDetails.get(4));
        assertEquals("CVC", paymentDetails.get(5));

        for (int i = 1; i < paymentDetails.size(); i++) {
            assertEquals("Displayed", paymentDetails.get(i));
        }
    }



}
