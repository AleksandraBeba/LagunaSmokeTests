package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class BooksSelectionPage extends BasePage{

    public By lagunaLogo = By.xpath("//img[@src=\"https://laguna.rs/__public/img/template/logo-laguna-2019.png\"]");
    public By rezultatPretrageText = By.className("naslov-sredina");
    public By book = By.xpath(("//*[text()=\"Onda\"]"));



    public BooksSelectionPage(WebDriver driver, Duration timeout){
        super(driver, timeout);
    }

    public void chooseBook(){
        isDisplayed(lagunaLogo);
        isDisplayed(rezultatPretrageText);
        waitForVisibility(book);
        clikcOn(book);

    }

    public void bookSelectN(){
        isDisplayed(lagunaLogo);
        isDisplayed(rezultatPretrageText);
        waitForVisibility(book);
        clikcOn(book);



    }





    }
