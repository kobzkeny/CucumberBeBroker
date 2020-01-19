package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import java.util.ArrayList;

public class RegisterPage {
    @FindBy (xpath ="//input[@id='email']")
    private static WebElement email;
    @FindBy (xpath ="//input[@id='password']")
    private static WebElement password;
    @FindBy (xpath ="//input[@id='password_again']")
    private static WebElement confirmPassword;
    @FindBy (xpath ="//input[@id='firstname_lastname']")
    private static WebElement name;
    @FindBy (xpath ="//input[@id='contact']")
    private static WebElement personToContact;
    @FindBy (id = "phone")
    private static WebElement phoneNumber;
    @FindBy (name = "vat_invoice")
    private static WebElement vatInvoiceCheckbox;
    @FindBy (id = "firm_name")
    private static WebElement companyName;
    @FindBy (id = "firm_tax_id")
    private static WebElement companyTaxID;
    @FindBy (id = "firm_address")
    private static WebElement companyAdress;
    @FindBy (id = "firm_code")
    private static WebElement companyPostCode;
    @FindBy (id = "firm_city")
    private static WebElement companyCity;
    @FindBy (name = "rules")
    private static WebElement rulesCheckbox;

    public static void fillRegister(WebDriver driver) {
        PageFactory.initElements(driver,RegisterPage.class);
        ((JavascriptExecutor)driver).executeScript("window.open()");
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        driver.get("https://10minutemail.net/?lang=pl");
        String emailAdress = driver.findElement(By.className("mailtext")).getAttribute("value");
        driver.switchTo().window((tabs.get(0)));
        email.sendKeys(emailAdress);
        password.sendKeys("pasword");
        confirmPassword.sendKeys("pasword");
        name.sendKeys("Michał Kobyłko");
        personToContact.sendKeys("Michał");
        phoneNumber.sendKeys("550550550");
        vatInvoiceCheckbox.click();
        companyName.sendKeys("BeBroker");
        companyTaxID.sendKeys("611111111");
        companyAdress.sendKeys("Wesola 1");
        companyPostCode.sendKeys("50-521");
        companyCity.sendKeys("Wroclaw");
        rulesCheckbox.click();
    }

    public static void acceptRegister(WebDriver driver) {
        WebElement registry = driver.findElement(By.xpath("//a[@class='btn']"));
        registry.click();
    }
}
