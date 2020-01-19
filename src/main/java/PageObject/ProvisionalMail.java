package PageObject;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class ProvisionalMail {
    @FindBy (partialLinkText ="Potwierdzenie rejestracji")
    private static WebElement confirmButton;
    @FindBy (partialLinkText =" rejestracj")
    private static WebElement mailRegistry;
    @FindBy (id = "details-button")
    private static WebElement detailsButton;
    @FindBy (partialLinkText ="dev.bebroker.pl")
    private static WebElement beBroker;

    public static void createTemporaryMail(WebDriver driver) {
        PageFactory.initElements(driver,ProvisionalMail.class);
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        WebDriverWait confirm = new WebDriverWait(driver,180);
        confirm.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Potwierdzenie rejestracji")));
        confirmButton.click();
        mailRegistry.click();
        List<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(2));
        detailsButton.click();
        beBroker.click();
    }
}
