package stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.uruneklePages;
import util.DriverFactory;

public class urunekleStepDefinitions {

    uruneklePages uruneklePages = new uruneklePages(DriverFactory.getDriver());
    @When("Teslimat ulkesi secilir")
    public void teslimatUlkesiSecilir() {
        uruneklePages.ulkeSec();
    }

    @When("Cinsiyet secimi yapilir")
    public void cinsiyetSecimiYapilir() {
        uruneklePages.cinsiyetSec();
    }
    @When("X butonuna Tikla")
    public void xButonunaTikla() {
        uruneklePages.xButonunaTikla();
    }

    @When("Arama alanina tiklanir")
    public void aramaAlaninaTiklanir() {
        uruneklePages.searchTikla();
    }

    @When("Arama alanina cep telefonu yaz")
    public void aramaAlaninaCepTelefonuYaz() {
        uruneklePages.aramaAlaninaCepTelefonuYaz();
    }

    @When("Ilgili sonuclardan cep telefonuna tikla")
    public void ilgiliSonuclardanCepTelefonunaTikla() {
        uruneklePages.cepTelefonunaTikla();
    }

    @When("Filtre butonuna tikla")
    public void filtreButonunaTikla() {
        uruneklePages.filtreButonunaTikla();
    }

    @When("Marka secilir")
    public void markaSecilir() {
        uruneklePages.markaSec();
    }

    @When("Filtreleme yapilir")
    public void filtrelemeYapilir() {
        uruneklePages.filtrelemeYap();
    }

    @When("Urunleri listele tiklanir")
    public void urunleriListeleTiklanir() {
        uruneklePages.urunListeTikla();
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
