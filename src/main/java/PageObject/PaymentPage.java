package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PaymentPage {

    public static void payForOffer(WebDriver driver) {
        driver.findElement(By.xpath("//a[contains(text(),'30 dni')]")).click();
        driver.findElement(By.xpath("//a[@class='navbarBtm-btn-right']")).click();
    }
}
