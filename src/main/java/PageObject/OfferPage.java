package PageObject;

import org.junit.Assert;
import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

public class OfferPage {

    public static void completeForm(WebDriver driver) {
        driver.findElement(By.name("email")).sendKeys("michalkobylko@gmail.com");
        driver.findElement(By.name("phone")).sendKeys("570761551");
        driver.findElement(By.name("text")).sendKeys("1234567890!@#$%^&*()qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM");
        driver.findElement(By.name("rules")).click();
        driver.findElement(By.xpath("//a[@class='btn btn-fill contact-send']")).click();
    }

    public static void comparePage(WebDriver driver) {
        String expected = "http://dev.bebroker.pl/oferty/podglad/19,mieszkanie-sprzedam.html";
        String actualURL = driver.getCurrentUrl();
        Assert.assertEquals("message not sent link to page did not reload", expected, actualURL);

    }
}

