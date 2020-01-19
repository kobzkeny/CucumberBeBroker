package PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OfferPage {
    @FindBy (name = "email")
    private static WebElement email;
    @FindBy (name ="phone")
    private static WebElement phone;
    @FindBy (name = "text")
    private static WebElement text;
    @FindBy (name ="rules")
    private static WebElement rules;
    @FindBy (xpath ="//a[@class='btn btn-fill contact-send']" )
    private static WebElement nextButton;

    public static void completeForm(WebDriver driver) {
        PageFactory.initElements(driver,OfferPage.class);
       email.sendKeys("michalkobylko@gmail.com");
       phone.sendKeys("570761551");
       text.sendKeys("1234567890!@#$%^&*()qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM");
       rules.click();
       nextButton.click();
    }

    public static void comparePage(WebDriver driver) {
        String expected = "http://dev.bebroker.pl/oferty/podglad/19,mieszkanie-sprzedam.html";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals("message not sent link to page did not reload", expected, actualURL);

    }
}

