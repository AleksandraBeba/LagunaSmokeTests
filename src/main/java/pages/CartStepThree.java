package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class CartStepThree extends BasePage{

    public By paymentCard = By.xpath("//label[@for=\"19\"]");
    public By instantPayment = By.xpath("//label[@for=\"25\"]");
    public By cashOnDelivery = By.xpath("//label[@for=\"12\"]");
    public By paymentByMoneyOrder= By.xpath("//label[@for=\"11\"]");
    public By podaciOKupcuText = By.xpath("//*[text()=\"Podaci o kupcu:\"]");
    public By sadrzajKorpeText = By.xpath("//*[text()=\"Sadržaj korpe:\"]");
    public By daljeButton = By.id("korpa-dalje");

    public CartStepThree(WebDriver driver, Duration timeout){
        super(driver, timeout);
    }

    public void paymentMethod() throws InterruptedException {
        clikcOn(cashOnDelivery);
//        Thread.sleep(3000);
        isDisplayed(podaciOKupcuText);
        isDisplayed(sadrzajKorpeText);
    }













}
