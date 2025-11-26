package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.sql.Driver;
import java.time.Duration;
import java.util.ArrayList;

public class BookDetailsPage extends BasePage{

    public By dodajUKorpuButton = By.id("dugme-korpa");
    public By toastMessage = By.xpath("//*[contains(text(),'Knjiga je dodata u korpu')]");
    public By cartButton = By.id("korpa_broj");
    public By daljeButton = By.id("korpa-dalje");
    public By odlomakButton = By.id("odlomak");

    public BookDetailsPage(WebDriver driver, Duration timeout){
        super(driver, timeout);
    }

    public void verifyBookAddedToCartMessage() {
        By toastMessage = By.xpath("//*[contains(text(),'Knjiga je dodata u korpu')]");
        WebElement message = wait.until(ExpectedConditions.visibilityOfElementLocated(toastMessage));
        wait.until(ExpectedConditions.invisibilityOfElementLocated(toastMessage));
    }

    public void addToCart(){
        clikcOn(dodajUKorpuButton);
        verifyBookAddedToCartMessage();
        clikcOn(cartButton);
    }

}
