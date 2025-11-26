package appTests;
import org.junit.Assert;
import org.junit.Test;
import pages.*;
import java.time.Duration;

public class HeaderFooterTest extends BaseTest{



    HeaderFooterPage headerFooterPage = new HeaderFooterPage(driver, Duration.ofSeconds(30));




    @Test
    public void headerFooterByFlow() throws InterruptedException {
        headerFooterPage.headerNaslovna();
        headerFooterPage.headerKnjige();
        headerFooterPage.headerUPripremi();
        headerFooterPage.headerBookMarker();
        headerFooterPage.wishList();
        headerFooterPage.facebook();
        headerFooterPage.instagram();
        headerFooterPage.x();
        headerFooterPage.youTube();
        headerFooterPage.tikTok();
        headerFooterPage.akcijeFooter();
        headerFooterPage.knjigeFooter();
        headerFooterPage.topListeFooter();
        headerFooterPage.oNamaFooter();
        headerFooterPage.bancaIntesaFooter();
    }



}


