package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class CartStepOne extends BasePage {

    public By daljeButton = By.id("korpa-dalje");
    public By bookOnda = By.xpath("//img[@src=\"_img/korice/4061/onda-momo_kapor_m.jpg\"]");
    public By popust = By.xpath("//*[text()=\"Popust\"]");


    public CartStepOne(WebDriver driver, Duration timeout) {
        super(driver, timeout);
    }


    public void cartCheck(){
        clikcOn(daljeButton);
    }















}
