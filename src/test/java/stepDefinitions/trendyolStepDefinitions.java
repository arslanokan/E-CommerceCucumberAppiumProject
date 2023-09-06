package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.trendyolPages;
import util.DriverFactory;

public class trendyolStepDefinitions {

    trendyolPages trendyolPages = new trendyolPages(DriverFactory.getDriver());
    @When("Teslimat ulkesi secilir")
    public void teslimatUlkesiSecilir() {
        trendyolPages.ulkeSec();
    }

    @When("Cinsiyet secimi yapilir")
    public void cinsiyetSecimiYapilir() {
        trendyolPages.cinsiyetSec();
    }
    @When("X butonuna Tikla")
    public void xButonunaTikla() {
        trendyolPages.xButonunaTikla();
    }

    @When("Arama alanina tiklanir")
    public void aramaAlaninaTiklanir() {
        trendyolPages.searchTikla();
    }

    @When("Arama alanina cep telefonu yaz")
    public void aramaAlaninaCepTelefonuYaz() {
        trendyolPages.aramaAlaninaCepTelefonuYaz();
    }

    @When("Ilgili sonuclardan cep telefonuna tikla")
    public void ilgiliSonuclardanCepTelefonunaTikla() {
        trendyolPages.cepTelefonunaTikla();
    }

    @When("Filtre butonuna tikla")
    public void filtreButonunaTikla() {
        trendyolPages.filtreButonunaTikla();
    }

    @When("Marka secilir")
    public void markaSecilir() {
        trendyolPages.markaSec();
    }

    @When("Filtreleme yapilir")
    public void filtrelemeYapilir() {
        trendyolPages.filtrelemeYap();
    }

    @When("Urunleri listele tiklanir")
    public void urunleriListeleTiklanir() {
        trendyolPages.urunListeTikla();
    }

    @When("Urun sepete eklenir")
    public void urunSepeteEklenir() {
    }

    @When("Giriş yap islemi yapilir")
    public void girişYapIslemiYapilir() {
    }

    @When("Sepetime gidilir")
    public void sepetimeGidilir() {
    }

    @Then("Urunun sepete geldigi kontrol edilir")
    public void urununSepeteGeldigiKontrolEdilir() {
    }


}
