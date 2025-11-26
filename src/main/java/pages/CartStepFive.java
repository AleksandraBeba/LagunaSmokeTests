package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;



public class CartStepFive extends BasePage {

    private By fieldIme = By.id("customer_name");
    private By fieldPrezime = By.id("customer_surname");
    private By fieldAdresa = By.id("customer_address");
    private By fieldGrad = By.id("customer_city");
    private By fieldPostBroj = By.id("customer_zip");
    private By drzavaMenu = By.id("customer_country");
    private By fieldTefefon = By.id("customer_phone");
    private By fieldEmail = By.id("customer_email");
    private By iconMasterCard = By.xpath("//img[@src=\"/assets/payment-form/images/payment-info/mastercard.png?v=638972928000000000\"]");
    private By iconDinaCard = By.xpath("//*[@alt=\"DINA logo\"]");
    private By iconVisaCard = By.xpath("//*[@alt=\"VISA logo\"]");
    private By fieldBrojKartice = By.id("creditCardNumber");
    private By fieldVaziDo = By.id("exp_date");
    private By fieldKontrolniBroj = By.id("cvv_code");
    private By buttonPlati = By.xpath("//*[text()=\"Plati\"]");

    private By karticabutton = By.xpath("(//*[text()=\"Molimo odaberite način plaćanja\"])[2]");


    public CartStepFive(WebDriver driver, Duration timeout) {
        super(driver, timeout);
    }


    public void cardInformation() throws InterruptedException {
        waitForVisibility(karticabutton);
        waitForClickable(karticabutton);

    }


}




