package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.HomePage;
import pages.SearchPage;
import testbase.WebTestBase;

public class SearchTest extends WebTestBase {
    SearchPage searchPage;
     HomePage homePage;
    public SearchTest() {
        super();                                    //it invoke super class constructor i.e WebTestBase constructor to define all properties.
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();                           //it call from WebTestBase class,to launch google chrome
        searchPage = new SearchPage();//object is created because to access all the methods of index page class
        homePage = new HomePage();
    }
    @Test()
    public void doNotAllowTest() {
        homePage.doNotAllow();
    }

    @Test()
    public void searchTest() throws InterruptedException {
        searchPage.search(prop.getProperty("product"));
        searchPage.clickOnProduct();
        searchPage.windowHandles();
    }
    @Test()
    public void windowHandlesTest() throws InterruptedException {
        searchPage.windowHandles();
    }
    @AfterMethod
    public void teardown() {
        driver.quit();                          //to close the browser
    }
}

