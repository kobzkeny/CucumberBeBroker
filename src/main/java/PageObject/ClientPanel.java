package PageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClientPanel {
    @FindBy(xpath ="//a[@class='panel-add-btn btn-tile']" )
    private static WebElement panelButton;

    public static void addOffer(WebDriver driver) {
        PageFactory.initElements(driver,ClientPanel.class);
        WebDriverWait panel = new WebDriverWait(driver,10);
        panel.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='panel-add-btn btn-tile']")));
        panelButton.click();
    }
}
