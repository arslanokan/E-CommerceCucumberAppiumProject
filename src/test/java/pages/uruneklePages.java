package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import util.ElementHelper;

import java.util.List;

public class uruneklePages {
    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    By ulkesectab = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Turkey\")");
    By cinsiyetsec = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"trendyol.com:id/buttonSelectGenderMan\")");
    By xbutonu = MobileBy.id("trendyol.com:id/imageViewTooltipClose");
    By searchtikla = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"trendyol.com:id/edittext_search_view\")");
    By filtrebutonu = MobileBy.id("trendyol.com:id/layout_search_filter");
    By appletikla = MobileBy.AndroidUIAutomator("new UiSelector().text(\"Apple\")");

    By narrowbutton = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"trendyol.com:id/imageLeft\")");

    By gbbutton = MobileBy.AndroidUIAutomator("new UiSelector().text(\"128 GB\")");

    By filtreuygula = MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"trendyol.com:id/btnApplyFilter\")");

    public uruneklePages(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }

    public void ulkeSec() {
        driver.findElement(ulkesectab).click();
    }

    public void cinsiyetSec() {
        driver.findElement(cinsiyetsec).click();
    }
    public void xButonunaTikla() {
        driver.findElement(xbutonu).click();
    }

    public void searchTikla() {
        driver.findElement(searchtikla).click();
    }

    public void aramaAlaninaCepTelefonuYaz() {
        elementHelper.sendKey(searchtikla, "Cep Telefonu");
    }

    public void cepTelefonunaTikla() {
        List<WebElement> ListofElement = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"trendyol.com:id/textViewSearchSuggestionText\")"));
        ListofElement.get(0).click();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }


    public void filtreButonunaTikla() {
        driver.findElement(filtrebutonu).click();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }



    public void markaSec() {
        List<WebElement> ListofElement = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"trendyol.com:id/textViewFilterTitle\")"));
        ListofElement.get(0).click();
        driver.findElement(appletikla).click();
        driver.findElement(narrowbutton).click();
    }

    public void filtrelemeYap() {
        List<WebElement> ListofElement = driver.findElements(MobileBy.AndroidUIAutomator("new UiSelector().resourceId(\"trendyol.com:id/textViewFilterTitle\")"));
        ListofElement.get(4).click();
        driver.findElement(gbbutton).click();
        driver.findElement(narrowbutton).click();
    }

    public void urunListeTikla() {
        driver.findElement(filtreuygula).click();

    }
}
