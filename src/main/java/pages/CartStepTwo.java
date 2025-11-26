package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

public class CartStepTwo extends BasePage{

    private By inputFieldImeIPrezime = By.id("ime-k");
    private By inputFieldEmail = By.id("email-k");
    private By inputFieldTelefon = By.id("telefon-k");
    private By inputFieldUlica = By.id("ulica-pomoc");
    private By inputFieldBrojUlice = By.id("broj-k");
    private By inputFieldBrojStana = By.id("broj-stana-k");
    public By inputFieldNapomena = By.xpath("//*[@name=\"napomena\"]");
    private By daljeButton = By.id("korpa-dalje");

//    Formular za pravna lica

    private By checkboxPravnoLice = By.id("firma-btn");

    private By drzavaPolje = By.xpath("(//div[@class=\"selectize-control single\"])[1]");
    private By drzavaPadajuciMeni = By.cssSelector("div.option[data-value='1']");

    private By postanskiBrojPolje =  By.xpath("(//*[@placeholder=\"Izaberite poštanski broj i mesto\"])[2]");
    private By postanskiBrojPadajuciMeni = By.xpath("(//*[@data-value=\"31310 Čajetina\"])[1]");


    public CartStepTwo(WebDriver driver, Duration timeout){
        super(driver, timeout);
    }

    public void selectCountry() {
        wait.until(ExpectedConditions.elementToBeClickable(drzavaPolje)).click();
        wait.until(ExpectedConditions.elementToBeClickable(drzavaPadajuciMeni)).click();
    }

    public void selectCity(){
        clearAndType(postanskiBrojPolje,"Cajetina");
        clikcOn(postanskiBrojPadajuciMeni);
    }

        public void personalData(){
        clearAndType(inputFieldImeIPrezime,"Aleksandra Spasenic");
        clearAndType(inputFieldEmail,"alexandraspasenic13@gmail.com");
        selectCountry();
        selectCity();
        clearAndType(inputFieldTelefon,"62656465");
        clearAndType(inputFieldUlica, "Aleksandra Karadjordjevica");
        clearAndType(inputFieldBrojUlice, "46");
        clearAndType(inputFieldNapomena,"");
        clikcOn(daljeButton);

    }

    public void personalDataNT (String imeIPrezime,String email,String telefon, String ulica, String brojUlice,String napomena, String brojStana){
        driver.findElement(inputFieldImeIPrezime).sendKeys(imeIPrezime);
        driver.findElement(inputFieldEmail).sendKeys(email);
        selectCountry();
        selectCity();
        driver.findElement(inputFieldTelefon).sendKeys(telefon);
        driver.findElement(inputFieldUlica).sendKeys(ulica);
        driver.findElement(inputFieldBrojUlice).sendKeys(brojUlice);
        driver.findElement(inputFieldBrojStana).sendKeys(brojStana);
        driver.findElement(inputFieldNapomena).sendKeys(napomena);
        clikcOn(daljeButton);
    }







}
