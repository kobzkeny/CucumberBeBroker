package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ListOfOffers {

    public static void selectOffer(WebDriver driver) {
        driver.findElement(By.partialLinkText("zobacz")).click();
    }
}
