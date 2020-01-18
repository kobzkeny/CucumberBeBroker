package PageObject;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class ProvisionalMail {

    public static void createTemporaryMail(WebDriver driver) {
        List<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        WebDriverWait confirm = new WebDriverWait(driver,180);
        confirm.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("Potwierdzenie rejestracji")));
        driver.findElement(By.partialLinkText("Potwierdzenie rejestracji")).click();
        driver.findElement(By.partialLinkText(" rejestracj")).click();
        List<String> tabs2 = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs2.get(2));
        driver.findElement(By.id("details-button")).click();
        driver.findElement(By.partialLinkText("dev.bebroker.pl")).click();
    }
}
