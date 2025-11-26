package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;

public class CartStepFour extends BasePage{

    public By potvrdaOneButton = By.id("potvrda");
    public By potvrdaTwoButton = By.xpath("//label[@for=\"potvrda2\"]");
    public By placanjeButton = By.xpath("//*[text()=\"Plaćanje\"]");



    public CartStepFour(WebDriver driver, Duration timeout){
        super(driver, timeout);
    }

    public void purchaseConfirmation() throws InterruptedException{

        WebElement checkbox = driver.findElement(potvrdaOneButton);
        js.executeScript("arguments[0].checked = true;", checkbox);
        js.executeScript("arguments[0].dispatchEvent(new Event('change'));", checkbox);


        clikcOn(potvrdaTwoButton);
        clikcOn(placanjeButton);
//        isDisplayed(By.xpath("//*[text()=\"Lični podaci korisnika\"]"));



//        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
//        driver.switchTo().window(tabs.get(1));
//        driver.close();
//        driver.switchTo().window(tabs.get(0));




    }












}
