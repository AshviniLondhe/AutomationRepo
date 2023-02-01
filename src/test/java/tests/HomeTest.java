package tests;



import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import testbase.WebTestBase;
import util.Utility;

public class HomeTest extends WebTestBase {
    HomePage homePage;

    public HomeTest() {
        super();                                    //it invoke super class constructor i.e WebTestBase constructor to define all properties.
    }

    @BeforeMethod
    public  void beforeMethod()  {
        initialization();                           //it call from WebTestBase class,to launch google chrome
        homePage = new HomePage();                  //object is created because to access all the methods of index page class

    }

    @Test()
    public void indexPageTitleTest() {
        SoftAssert  softAssert=new SoftAssert();
        String title = homePage.validateIndexPageTitle();
        softAssert.assertEquals(title, "Online Shopping Site India - Shop Online for men, women and kids fashion, home, kitchen, health, sports and more products at ShopClues");
        softAssert.assertAll();
    }

    @Test()
    public void shopCluesLogoTest() {
        SoftAssert  softAssert=new SoftAssert();
        boolean flag = homePage.validateShopCluesLogo();
        softAssert.assertTrue(flag);
        softAssert.assertAll();
    }
    @Test
    public void validateAddCookiesTest(){
        homePage.validateCookies();
    }
    @Test
    public void validateDeleteCookiesTest() {
        homePage.validateDeleteCookies();
    }
    @Test()
     public void mouseHoverTest() throws InterruptedException {
        homePage.doNotAllow();
        homePage.mouseHover();
        homePage.windowHandles();
     }
        @AfterMethod
        public void teardown(){
        driver.close();                          //to close the browser
    }
    }
