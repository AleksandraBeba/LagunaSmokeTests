package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;
    protected JavascriptExecutor js;

    public BasePage(WebDriver driver, Duration timeout) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, timeout);
        this.actions = new Actions(driver);
        this.js = (JavascriptExecutor) driver;
    }

    public void navigateTo(String url) {
        driver.get(url);
    }

    public void clikcOn(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }


    public void inputField(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys();
    }

    public void typeText(By locator) {
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys();
    }


    public WebElement waitForVisibility(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }

    public void clearAndType(By locator, String text) {
        WebElement field = waitForVisibility(locator);
        field.clear();
        field.sendKeys(text);
    }

    public void clear(By locator) {
        WebElement field = waitForVisibility(locator);
        field.clear();
    }

    public void scrollToElement(By locator) {
        WebElement element = waitForVisibility(locator);
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public boolean isDisplayed(By locator) {
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).isDisplayed();

    }

    public boolean waitForInvisible(By locator) {
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(locator));


    }

    public WebElement waitForVisibility(By locator, int timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
        return wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }


    public void waitForClickable(By locator) {
        wait.until(ExpectedConditions.elementToBeClickable(locator));
    }


}
