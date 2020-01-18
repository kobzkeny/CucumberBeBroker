package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    public static void registerUser(WebDriver driver) {
        WebElement createAccount = driver.findElement(By.xpath("//a[contains(text(),'Zarejestruj si')]"));
        createAccount.click();
    }
}
