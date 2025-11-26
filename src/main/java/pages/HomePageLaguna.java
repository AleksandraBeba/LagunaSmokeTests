package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;
import java.util.List;
import java.util.Random;

public class HomePageLaguna extends BasePage{

    public By lagunaLogo = By.xpath("//img[@src=\"https://laguna.rs/__public/img/template/logo-laguna-2019.png\"]");

    public By searchBox = By.id("pretraga_rec");
    public By searchButton = By.id("pretraga_submit");

    public By prijavaButton = By.xpath("//*[text()=\"Prijava\"]");
    public By listaZeljaButton = By.id("zelje_broj");

    public By korpaButton = By.id("korpa_broj");
    public By naslovnaButton = By.xpath("(//*[text()=\"Naslovna\"])[1]");
    public By knjigeButton = By.xpath("(//*[text()=\"Knjige\"])[1]");
    public By uPripremiButton = By.xpath("(//*[text()=\"U pripremi\"])[1]");

    public By facebookHeaderButton = By.xpath("//img[@src=\"//laguna.rs/__public/img/template/ico/fb.png\"]");
    public By xHeaderButton = By.xpath("//img[@src=\"//laguna.rs/__public/img/template/ico/x_icon.png\"]");
    public By instagramHeaderButton = By.xpath("//img[@src=\"//laguna.rs/__public/img/template/ico/in.png\"]");
    public By youTubeHeaderButton = By.xpath("//img[@src=\"//laguna.rs/__public/img/template/ico/yt.png\"]");
    public By tikTokHeaderButton = By.xpath("//img[@src=\"//laguna.rs/__public/img/template/ico/tiktok.png\"]");

    public By naslovnaFooterButton = By.xpath("(//*[text()=\"Naslovna\"])[2]");
    public By knjigeFooterButton = By.xpath("(//*[text()=\"Knjige\"])[2]");
    public By akcijeFooterButton = By.xpath("(//*[text()=\"Akcije\"])[2]");
    public By topListeFooterButton = By.xpath("(//*[text()=\"Top-liste\"])[3]");
    public By oNamaFooterButton = By.xpath("//*[text()=\"O nama\"]");

    public By bancaIntesaFooterButton = By.xpath("//img[@src=\"//laguna.rs/__public/img/footer/intesa.png\"]");
    public By googlePlayFooterButton = By.xpath("//img[@src=\"//laguna.rs/_css/razno/google_play_icon.png\"]");

    public By noviNasloviText = By.xpath("//*[text()=\"Novi naslovi\"]");
    public By rezultatPretrageText = By.className("naslov-sredina");

    public By errorMessage = By.xpath("//*[text()=\"Minimalan broj slova za pretragu je 2.\"]");




    public HomePageLaguna(WebDriver driver, Duration timeout){
        super(driver, timeout);
    }

    public void bookSearchByTitle(String text) throws InterruptedException {
        isDisplayed(lagunaLogo);
        waitForVisibility(searchBox).clear();
        waitForVisibility(searchBox).sendKeys(text);
        waitForVisibility(searchButton).click();
        isDisplayed(rezultatPretrageText);
//        Thread.sleep(3000);
    }

    public void bookSearchByAutor(String text) throws InterruptedException {
        isDisplayed(lagunaLogo);
        waitForVisibility(searchBox).clear();
        waitForVisibility(searchBox).sendKeys(text);
        waitForVisibility(searchButton).click();
        isDisplayed(rezultatPretrageText);
//        Thread.sleep(3000);

    }


    public void invalidSearch(String text){
        isDisplayed(lagunaLogo);
        waitForVisibility(searchBox).sendKeys(text);
        waitForVisibility(searchButton).click();
        clear(searchBox);

    }


}

