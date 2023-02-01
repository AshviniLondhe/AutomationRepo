package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.IFramePage;
import testbase.WebTestBase;

public class IFrameTest extends WebTestBase {
    IFramePage iFramePage;
   HomePage homePage;
    public IFrameTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        iFramePage = new IFramePage();
        homePage=new  HomePage();
    }
    @Test
    public void verifyIFrame(){
        homePage.doNotAllow();
        iFramePage.mouseHover();
        iFramePage.windowHandles();
        iFramePage.validateIFrame();
        iFramePage.clickOnIcon();
        iFramePage.windowHandles();
    }
}