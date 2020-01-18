package Steps;

import PageObject.HomePage;
import PageObject.LoginPage;
import PageObject.ProvisionalMail;
import PageObject.RegisterPage;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccountSteps {
  private WebDriver driver;

    @Given("^Uzytkownik przechodzi na serwis dev\\.beBroker$")
    public void uzytkownikPrzechodziNaSerwisDevBeBroker() {
        System. setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("http://dev.bebroker.pl/");
    }

    @And("^Uzytkownik klika w przycisk Darmowe Konto$")
    public void uzytkownikKlikaWPrzyciskDarmoweKonto() {
        HomePage.createFreeAccount(driver);
    }

    @And("^Uzytkownik klika w przycisk Zarejestruj sie$")
    public void uzytkownikKlikaWPrzyciskZarejestrujSie() {
        LoginPage.registerUser(driver);
    }

    @And("^Uzytkownik uzupelnia formularz korzystajac z  poprawnych danych$")
    public void uzytkownikUzupelniaFormularzKorzystajacZPoprawnychDanych() {
        RegisterPage.fillRegister(driver);
        RegisterPage.acceptRegister(driver);
    }

    @When("^Uzytkownik uruchamia link aktywacyjny w fikcyjnym mailu$")
    public void uzytkownikUruchamiaLinkAktywacyjnyWFikcyjnymMailu() {
    ProvisionalMail.createTemporaryMail(driver);

    }
    @Then("^Uzytkownik poprawnie zarejestrowal konto$")
    public void uzytkownikPoprawnieZarejestrowalKonto() {
    }

}
