package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdvertisementAdd {
    @FindBy(xpath ="//a[@class='btn btn-light2']")
    private static WebElement loginButton;
    @FindBy(id = "email")
    private static WebElement mailInput;
    @FindBy(xpath ="//input[@id='password']")
    private static WebElement passwordInput;
    @FindBy(xpath ="//a[@class='btn btn-xl btn-fill act-send']")
    private static WebElement continueButton;

    public static void logIn(WebDriver driver) throws InterruptedException {
        PageFactory.initElements(driver,AdvertisementAdd.class);
       loginButton.click();
        Thread.sleep(500);
        mailInput.sendKeys("michalkobylko@gmail.com");
        passwordInput.sendKeys("Michal10");
        continueButton.click();
    }

    public static void addFlat(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);
        WebElement mieszkanie = driver.findElement(By.className("offersAdd-item"));
        driver.navigate().to("http://dev.bebroker.pl/oferta/dodaj.html?type=1&transaction=1");

    }
}
