package PageObject;


import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;
import java.util.List;

public class AdvertisementComplete {
    @FindAll({
            @FindBy(xpath = "//button"),
            @FindBy(xpath = "//input")
    })
    private static List<WebElement> inputsAndButtons;
    @FindBy(xpath = "//input[@id='tytul']")
    private static WebElement tittle;
    @FindBy(xpath ="//select[@id='rynek']" )
    private static WebElement selectMarket;
    @FindBy(xpath = "//input[@id='pietro']")
    private static WebElement floor;
    @FindBy(xpath = "//input[@id='liczba_pieter']")
    private static WebElement numberOfFloors;
    @FindBy(xpath ="//select[@id='rodzaj_budynku']" )
    private static WebElement selectBuilding;
    @FindBy(xpath = "//input[@id='rok_budowy']")
    private static WebElement yearOfBuilding;
    @FindBy(xpath = "//input[@id='liczba_pokoi']")
    private static WebElement numberOfRooms;
    @FindBy(xpath = "//input[@id='powierzchnia']")
    private static WebElement area;
    @FindBy(xpath = "//select[@id='stan_mieszkania']")
    private static WebElement seleconditionOfFlat;
    @FindBy(xpath = "//select[@id='okna']")
    private static WebElement selectWindows;
    @FindBy(xpath = "//select[@id='instalacje']")
    private static WebElement selectInstalation;
    @FindBy(xpath = "//select[@id='ogrzewanie']")
    private static WebElement selectHeating;
    @FindBy(xpath = "//input[@id='czynsz']")
    private static WebElement rent;
    @FindBy(xpath = "//input[@id='cena']")
    private static WebElement price;
    @FindBy(xpath ="//textarea[@id='opis']" )
    private static WebElement description;
    @FindBy(xpath ="//input[@id='kod_pocztowy']" )
    private static WebElement postCode;
    @FindBy(xpath = "//input[@id='ulica']" )
    private static WebElement street;
    @FindBy(xpath ="//input[@id='fileupload']" )
    private static WebElement fileUploud;
    @FindBy(xpath = "//input[@id='address']")
    private static WebElement adress;
    @FindBy(xpath = "//a[contains(@class,'navbarBtm-btn-right')]")
    private static WebElement nextButton;

    public static void fillData(WebDriver driver) throws InterruptedException, IOException {
        PageFactory.initElements(driver,AdvertisementComplete.class);
        tittle.sendKeys("Testowe ogłoszenie");
        Select market = new Select(selectMarket);
        market.selectByVisibleText("Pierwotny");
        floor.sendKeys("7");
        numberOfFloors.sendKeys("8");
        Select building = new Select(selectBuilding);
        building.selectByVisibleText("Apartamentowiec");
        yearOfBuilding.sendKeys("2010");
        numberOfRooms.sendKeys("4");
        area.sendKeys("70");
        Select condition = new Select(seleconditionOfFlat);
        condition.selectByVisibleText("do wprowadzenia");
        Select windows = new Select(selectWindows);
        windows.selectByVisibleText("nowe PCV");
        Select instalation = new Select(selectInstalation);
        instalation.selectByVisibleText("wymienione");
        Select heating = new Select(selectHeating);
        heating.selectByVisibleText("miejskie");
        SeleniumHelper.takeScreenshoot(driver);
        rent.sendKeys("450");
        price.sendKeys("350000");
        description.sendKeys("qwertyuiop[]asdfghjkl;zxcvbnm,./1234567890!@#$%^&*()_+QWERTYUIOPASDFGHJKLZXCVBNM");
        postCode.sendKeys("50-521");
        street.sendKeys("Wesoła");
        fileUploud.sendKeys("C:/Users/48570/Pictures/united.png");
        adress.sendKeys("Wrocław");
        Thread.sleep(1000);
        adress.sendKeys(Keys.ENTER);
        Assert.assertEquals(59,inputsAndButtons.size());

    }

    public static void acceptOffer(WebDriver driver) {
        nextButton.click();
    }
}
