package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public class RegisterPage {

    public static void fillRegister(WebDriver driver) {
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://10minutemail.net/?lang=pl");
        String emailAdress = driver.findElement(By.className("mailtext")).getAttribute("value");
        driver.switchTo().window((tabs.get(0)));
        WebElement email = driver.findElement(By.xpath("//input[@id='email']"));
        email.sendKeys(emailAdress);
        WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("pasword");
        WebElement passwordAgain = driver.findElement(By.xpath("//input[@id='password_again']"));
        passwordAgain.sendKeys("pasword");
        WebElement nameLastname = driver.findElement(By.xpath("//input[@id='firstname_lastname']"));
        nameLastname.sendKeys("Kamil Pietryk");
        WebElement personToContact = driver.findElement(By.xpath("//input[@id='contact']"));
        personToContact.sendKeys("Kamil");
        WebElement phoneNumber = driver.findElement(By.id("phone"));
        phoneNumber.sendKeys("550550550");
        WebElement checkboxFv = driver.findElement(By.name("vat_invoice"));
        checkboxFv.click();
        WebElement firmName = driver.findElement(By.id("firm_name"));
        firmName.sendKeys("BeBroker");
        WebElement firmTaxId = driver.findElement(By.id("firm_tax_id"));
        firmTaxId.sendKeys("611111111");
        WebElement streetFrim = driver.findElement(By.id("firm_address"));
        streetFrim.sendKeys("Wesola 1");
        WebElement firmCode = driver.findElement(By.id("firm_code"));
        firmCode.sendKeys("50-521");
        WebElement firmCity = driver.findElement(By.id("firm_city"));
        firmCity.sendKeys("Wroclaw");
        WebElement termsAccept = driver.findElement(By.name("rules"));
        termsAccept.click();
    }

    public static void acceptRegister(WebDriver driver) {
        WebElement registry = driver.findElement(By.xpath("//a[@class='btn']"));
        registry.click();
    }
}
