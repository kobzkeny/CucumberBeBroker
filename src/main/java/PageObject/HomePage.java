package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

    public static void createFreeAccount(WebDriver driver) {
        WebElement accountButton = driver.findElement(By.xpath("//a[@class='btn btn-grad']"));
        accountButton.click();
    }

    public static void addAdvertisment(WebDriver driver) {
        driver.findElement(By.xpath("//div[@class='navbar-profile navbar-profile-login']//a[@class='btn btn-m btn-fill'][contains(text(),'Dodaj og')]")).click();
    }

    public static void setProperty(WebDriver driver) {
        Select property = new Select(driver.findElement(By.name("type")));
        property.selectByValue("1");
    }

    public static void setTransaction(WebDriver driver) {
        Select transaction = new Select(driver.findElement(By.name("transaction")));
        transaction.selectByValue("1");
    }

    public static void setCity(WebDriver driver) throws InterruptedException {
        WebElement city = driver.findElement(By.name("address"));
        city.click();
        city.sendKeys("Wroc");
        Thread.sleep(500);
        city.sendKeys(Keys.ENTER);
    }

    public static void accept(WebDriver driver) {
        WebElement search = driver.findElement(By.xpath("//a[contains(text(),'Szukaj')]"));
        search.click();
    }
}
