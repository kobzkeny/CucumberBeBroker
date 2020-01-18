package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClientPanel {

    public static void addOffer(WebDriver driver) {
        WebDriverWait panel = new WebDriverWait(driver,10);
        panel.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='panel-add-btn btn-tile']")));
        driver.findElement(By.xpath("//a[@class='panel-add-btn btn-tile']")).click();
    }
}
