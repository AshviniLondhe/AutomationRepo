package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Test;
import pages.DropDownPage;
import pages.HomePage;
import testbase.WebTestBase;

public class DropDownTest extends WebTestBase {
    HomePage homePage;
    DropDownPage dropDownPage;

    public DropDownTest() {
        super();
    }

    @BeforeMethod
    public void beforeMethod() {
        initialization();
        dropDownPage = new DropDownPage();
        homePage = new HomePage();
    }

    @Test()
    public void clickTest() throws InterruptedException {
        homePage.doNotAllow();
        dropDownPage.clickOnLink();
        dropDownPage.windowHandles();
        dropDownPage.validateScroll();
        dropDownPage.clickOnMenues();
        dropDownPage.windowHandles();
        dropDownPage.validateScroll1();
        dropDownPage.validateDropDown();
        dropDownPage.windowHandles();

    }

    @AfterMethod
    public void teardown() {
        driver.close();
    }

}

