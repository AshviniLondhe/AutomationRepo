package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.Utility;

import static testbase.WebTestBase.driver;

public class DropDownPage extends WebTestBase {
    @FindBy(xpath = "//a[@id='qoo10_link']")
    WebElement globalShopping;
    @FindBy(xpath = "//img[@alt='Click to Verify - This site has chosen an SSL Certificate to improve Web site security']")
    WebElement prd1;
    @FindBy(xpath = "//select[@id='dtcServiceCountry']")
    WebElement prd2;

    @FindBy(xpath = "//div[@id='familysite_layer']")
    WebElement arrow;
   @FindBy(xpath = "//span[text()='Smartship']")
    WebElement menues;
    @FindBy(xpath = "//select[@id='dtcServiceCountry']")
    WebElement dropDown;


    public DropDownPage() {
        super();
        PageFactory.initElements(driver, this);
    }

    public void clickOnLink() {
        globalShopping.click();
    }

    public void windowHandles(){
        Utility.switchToChildWindow(driver);
    }

    public void validateScroll() throws InterruptedException {
        Utility.scrollHandle(prd1);
    }
    public void validateScroll1() throws InterruptedException {
        Utility.scrollHandle(prd2);
    }
    public void clickOnMenues() {
        arrow.click();
        menues.click();
    }
    public void validateDropDown(){
        dropDown.click();
        Utility.selectValue(dropDown,"byIndex","2");
    }

}