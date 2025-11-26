package appTests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import pages.*;

import java.time.Duration;

public class SearchOrderTest extends BaseTest {



    HomePageLaguna homePageLaguna = new HomePageLaguna(driver, Duration.ofSeconds(10));
    BooksSelectionPage booksSelectionPage = new BooksSelectionPage(driver,Duration.ofSeconds(10));
    BookDetailsPage bookDetailsPage = new BookDetailsPage(driver, Duration.ofSeconds(10));
    CartStepOne cartStepOne = new CartStepOne(driver,Duration.ofSeconds(10));
    CartStepTwo cartStepTwo = new CartStepTwo(driver,Duration.ofSeconds(10));
    CartStepThree cartStepThree = new CartStepThree(driver,Duration.ofSeconds(10));
    CartStepFour cartStepFour = new CartStepFour(driver, Duration.ofSeconds(10));
    CartStepFive cartStepFive = new CartStepFive(driver,Duration.ofSeconds(10));



    @Test
    public void bookSearch() throws InterruptedException {

        homePageLaguna.bookSearchByTitle("Onda");
        Assert.assertTrue(driver.findElement(By.id("spisak-knjiga-sredina")).getText().contains("Pretraga: Onda"));

        homePageLaguna.bookSearchByAutor("Ivo Andric");
        Assert.assertTrue(driver.findElement(By.id("spisak-knjiga-sredina")).getText().contains("Pretraga: "));

    }


    @Test
    public void negativeSearch() throws InterruptedException {

        homePageLaguna.invalidSearch("");
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()=\"Minimalan broj slova za pretragu je 2.\"]")).isDisplayed());
        homePageLaguna.invalidSearch("a");
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()=\"Minimalan broj slova za pretragu je 2.\"]")).isDisplayed());
        Thread.sleep(3000);
        homePageLaguna.invalidSearch("Ivo Andric Ana Karenjina");
        Assert.assertTrue(driver.findElement(By.id("spisak-knjiga-sredina")).getText().contains("Žao nam je, nemamo ovaj naslov u ponudi."));

    }


    @Test
    public void stepByStepOrdering() throws InterruptedException {

        homePageLaguna.bookSearchByTitle("Onda");
        booksSelectionPage.chooseBook();
        Assert.assertTrue(driver.findElement(By.className("karusel-naslov")).getText().contains("Od istog autora"));
        bookDetailsPage.addToCart();
        cartStepOne.cartCheck();
        cartStepTwo.personalData();
        Assert.assertTrue(driver.findElement(By.xpath("//*[text()=\"Izaberite način plaćanja i dostave:\"]")).isDisplayed());
//        cartStepThree.paymentMethod();

//        OVO DOLE BI BILI KORACI ZA PLACANJE KARTICOM. NISAM USPELA DA PORUCIM TAKO, PA SAM ODABRALA KURIRSKO PLACANJE.
//        ZAUSTAVILA SAM SE KOD KLIKA NA "KUPOVINA", JER BI SLEDECI KORAK TREBALO DA BUDE STRANICA SA FAKTUROM I PODACIMA PORUDZBINE.
//        ZA ASERTACIJU CU PRILOZITI KNJIGU KAO DOKAZ, NA ZAVRSNOM ISTPITU :)
////
//        cartStepFour.purchaseConfirmation();
//        Assert.assertTrue(driver.findElement(By.id("form_wspay")).isDisplayed());
//        cartStepFive.cardInformation();

    }

    @Test
    public void negativeOrder() throws InterruptedException {

        homePageLaguna.bookSearchByTitle("Onda");
        booksSelectionPage.chooseBook();
        bookDetailsPage.addToCart();
        cartStepOne.cartCheck();
        cartStepTwo.personalDataNT("","nesto@","623344567", "Glavna","123456","","");
        Assert.assertEquals("https://laguna.rs/kupovina_unos_podataka.html",driver.getCurrentUrl());

    }
    


}
