package appTests;

import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

public class BaseTest {

    protected static WebDriver driver;
    protected static WebDriverWait wait;

    @BeforeClass
    public static void beforeClass() throws Exception {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    }


    @Before
    public void setUp() {
        driver.get("https://www.laguna.rs/");
        driver.findElement(By.xpath("//a[@onclick=\"setCookie('zaKolacice','zaKolacice',3000); $('#gdpr-box').hide();\"]")).click();

    }

    @After
    public void tearDown() throws Exception {

    }

    @AfterClass
    public static void afterAll() {
            driver.quit();
        }
    }


