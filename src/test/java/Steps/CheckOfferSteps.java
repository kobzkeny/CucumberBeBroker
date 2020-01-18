package Steps;

import PageObject.AdvertisementComplete;
import PageObject.HomePage;
import PageObject.ListOfOffers;
import PageObject.OfferPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckOfferSteps {
    WebDriver driver;
    @Given("^Uzytkownik przechodzi na serwis internetowy  dev\\.beBroker$")
    public void uzytkownikPrzechodziNaSerwisInternetowyDevBeBroker() {
        System. setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://dev.bebroker.pl/");
    }

    @And("^Uzytkownik w wyszukiwarce wybiera typ nieruchomosci mieszkanie$")
    public void uzytkownikWWyszukiwarceWybieraTypNieruchomosciMieszkanie() {
        HomePage.setProperty(driver);
    }

    @And("^Uzytkownik ustawia tryb transakcji na sprzedaz$")
    public void uzytkownikUstawiaTrybTransakcjiNaSprzedaz() {
        HomePage.setTransaction(driver);
    }

    @And("^Uzytkownik wybiera miasto Wroclaw$")
    public void uzytkownikWybieraMiastoWroclaw() throws InterruptedException {
        HomePage.setCity(driver);
    }

    @And("^Uzytkownik akceptuje wprowadzone kryteria przyciskiem szukaj$")
    public void uzytkownikAkceptujeWprowadzoneKryteriaPrzyciskiemSzukaj() {
        HomePage.accept(driver);
    }

    @And("^Uzytkownik wybiera dowolna oferte z listy poprzez przycisk zobacz$")
    public void uzytkownikWybieraDowolnaOferteZListyPoprzezPrzyciskZobacz() {
        ListOfOffers.selectOffer(driver);
    }

    @When("^Uzytkownik uzupelnia formularz kontaktowy i wysyla zapytanie do  klienta$")
    public void uzytkownikUzupelniaFormularzKontaktowyIWysylaZapytanieDoKlienta() {
        OfferPage.completeForm(driver);
    }

    @Then("^Wiadomosc do klienta zostala wyslana poprzez formularz$")
    public void wiadomoscDoKlientaZostalaWyslanaPoprzezFormularz() {
        OfferPage.comparePage(driver);
    }

}
