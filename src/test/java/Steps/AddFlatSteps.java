package Steps;

import PageObject.*;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;

public class AddFlatSteps {

WebDriver driver;



    @Given("^Uzytkownik przechodzi na serwisik  dev\\.beBroker$")
    public void uzytkownikPrzechodziNaSerwisikDevBeBroker() {
        System. setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://dev.bebroker.pl/");
    }
    @And("^Uzytkownik klika w przycisk dodaj ogloszenie$")
    public void uzytkownikKlikaWPrzyciskDodajOgloszenie() {

        HomePage.addAdvertisment(driver);
    }


    @And("^Uzytkownik loguje sie na swoje konto$")
    public void uzytkownikLogujeSieNaSwojeKonto() throws InterruptedException {
        AdvertisementAdd.logIn(driver);
    }

    @And("^Uzytkownik klika panel dodaj oferte$")
    public void uzytkownikKlikaPanelDodajOferte() {
        ClientPanel.addOffer(driver);
    }

    @And("^Uzytkownik wybiera opcje mieszkania na sprzedaz$")
    public void uzytkownikWybieraOpcjeMieszkaniaNaSprzedaz() throws InterruptedException {
        AdvertisementAdd.addFlat(driver);
    }

    @And("^Uzytkownik uzupelnia dane podstawowe mieszkania oraz akceptuje oferte przyciskiem przejdz dalej$")
    public void uzytkownikUzupelniaDanePodstawoweMieszkaniaOrazAkceptujeOfertePrzyciskiemPrzejdzDalej() throws InterruptedException, IOException {
        AdvertisementComplete.fillData(driver);
    }

    @When("^Uzytkownik akceptuje oferte przyciskiem przejdz dalej$")
    public void uzytkownikAkceptujeOfertePrzyciskiemPrzejdzDalej() {
        AdvertisementComplete.acceptOffer(driver);
    }

    @Then("^Uzytkownik akceptuje oferte oraz przechodzi na strone platnosci$")
    public void uzytkownikAkceptujeOferteOrazPrzechodziNaStronePlatnosci() {
        PaymentPage.payForOffer(driver);

    }
@After
    public void exit() throws InterruptedException {
        Thread.sleep(5000);
        //driver.close();

}

}
