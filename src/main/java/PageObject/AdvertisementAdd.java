package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdvertisementAdd {
    @FindBy(xpath ="//a[@class='btn btn-light2']")
    private static WebElement loginButton;

    public static void logIn(WebDriver driver) throws InterruptedException {
        PageFactory.initElements(driver,AdvertisementAdd.class);
       loginButton.click();
        Thread.sleep(500);
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("michalkobylko@gmail.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Michal10");
        driver.findElement(By.xpath("//a[@class='btn btn-xl btn-fill act-send']")).click();
    }

    public static void addFlat(WebDriver driver) throws InterruptedException {
        Thread.sleep(1000);
        WebElement mieszkanie = driver.findElement(By.className("offersAdd-item"));
        driver.navigate().to("http://dev.bebroker.pl/oferta/dodaj.html?type=1&transaction=1");

    }
}
