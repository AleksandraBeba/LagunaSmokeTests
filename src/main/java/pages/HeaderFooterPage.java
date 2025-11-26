package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;
import java.util.ArrayList;

public class HeaderFooterPage extends BasePage{

    public By lagunaLogo = By.xpath("//img[@src=\"https://laguna.rs/__public/img/template/logo-laguna-2019.png\"]");

    public By prijavaButton = By.xpath("//*[text()=\"Prijava\"]");
    public By listaZeljaButton = By.id("zelje_broj");
    public By korpaButton = By.id("korpa_broj");

    public By naslovnaButton = By.xpath("(//*[text()=\"Naslovna\"])[1]");
    public By knjigeButton = By.xpath("(//*[text()=\"Knjige\"])[1]");
    public By uPripremiButton = By.xpath("(//*[text()=\"U pripremi\"])[1]");
    public By bookMarkerButton = By.xpath("(//*[text()=\"#Bukmarker\"])[1]");

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

    public HeaderFooterPage (WebDriver driver, Duration timeout){
        super(driver, timeout);
    }


    public void headerNaslovna(){
        isDisplayed(naslovnaButton);
        clikcOn(naslovnaButton);
        driver.findElement(By.xpath("//*[text()=\"Novi naslovi\"]")).isDisplayed();
    }
    public void headerKnjige(){
        isDisplayed(knjigeButton);
        clikcOn(knjigeButton);
        driver.findElement(By.xpath("//div[contains(text(), 'Hronološka lista')]")).isDisplayed();
        driver.findElement(By.xpath("(//*[text()=\"Akcioni\"])[2]")).isDisplayed();
    }

    public void headerUPripremi(){
        isDisplayed(uPripremiButton);
        clikcOn(uPripremiButton);
        driver.findElement(By.xpath("//div[contains(text(), 'U pripremi')]")).isDisplayed();
        driver.findElement(By.id("paginacija")).isDisplayed();
    }

    public void headerBookMarker(){
        isDisplayed(bookMarkerButton);
        clikcOn(bookMarkerButton);
        driver.findElement(By.id("magazin-meni")).isDisplayed();
        driver.findElement(By.xpath("//*[text()=\"Najnovije\"]")).isDisplayed();
    }

    public void wishList(){
        isDisplayed(lagunaLogo);
        waitForVisibility(listaZeljaButton).click();
        driver.findElement(By.xpath("//*[text()=\"Lista želja je prazna.\"]")).isDisplayed();
    }

    public void facebook() throws InterruptedException {
        isDisplayed(facebookHeaderButton);
        clikcOn(facebookHeaderButton);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
//        Thread.sleep(5000);
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }

    public void instagram() throws InterruptedException{
        isDisplayed(instagramHeaderButton);
        clikcOn(instagramHeaderButton);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
//        Thread.sleep(5000);
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }

    public void x() throws InterruptedException{
        isDisplayed(xHeaderButton);
        clikcOn(xHeaderButton);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
//        Thread.sleep(5000);
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }

    public void youTube() throws InterruptedException{
        isDisplayed(youTubeHeaderButton);
        clikcOn(youTubeHeaderButton);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
//        Thread.sleep(5000);
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }

    public void tikTok() throws  InterruptedException{
        isDisplayed(tikTokHeaderButton);
        clikcOn(tikTokHeaderButton);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
//        Thread.sleep(5000);
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }

    public void naslovnaFooter(){
        scrollToElement(naslovnaFooterButton);
        clikcOn(naslovnaFooterButton);
        isDisplayed(By.xpath("//*[@style=\"display: block;background: #aa161f; font-family: 'Lora', serif; font-size: 17px; text-align: center;\"]"));

    }
    public void knjigeFooter(){
        scrollToElement(knjigeFooterButton);
        clikcOn(knjigeFooterButton);
    }

    public void akcijeFooter(){
        scrollToElement(akcijeFooterButton);
        clikcOn(akcijeFooterButton);
    }
    public void oNamaFooter(){
        scrollToElement(oNamaFooterButton);
        clikcOn(oNamaFooterButton);
    }
    public void topListeFooter(){
        scrollToElement(topListeFooterButton);
        clikcOn(topListeFooterButton);
    }

    public void bancaIntesaFooter () {
        scrollToElement(bancaIntesaFooterButton);
        clikcOn(bancaIntesaFooterButton);
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
        isDisplayed(By.id("cookieSectionPart"));
        if (isDisplayed(By.id("cookieSectionPart"))) {
            System.out.println("TEST PROŠAO");
        } else {
            System.out.println("TEST PAO");
        }
        driver.close();
        driver.switchTo().window(tabs.get(0));
    }



}
























