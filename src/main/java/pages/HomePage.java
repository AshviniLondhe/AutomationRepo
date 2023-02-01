package pages;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.Utility;

import static org.openqa.selenium.support.PageFactory.*;

public class HomePage extends WebTestBase {
    //page factory or page repository
    @FindBy(xpath ="//img[@alt='Melnor Skin Whitening Cream 20g']")
    WebElement scroll;
    @FindBy(xpath = "//img[@alt='Shopclues.com']")
    WebElement shopCluesLogo;
    @FindBy(xpath = "//a[text()='Sports & More']")
    WebElement mouseHover;
    @FindBy(xpath = "//a[text()='Skin Care']")
    WebElement prd;
    @FindBy(xpath = "//button[@class='moe-chrome-style-notification-btn moe-btn-close moe-block-class']")
    WebElement dtAllow;
    @FindBy(xpath = "//label[@for='2501 - 5000']")
    WebElement checkBox;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void doNotAllow() {
        dtAllow.click();
    }

    //Actions
    public String validateIndexPageTitle() {
        return driver.getTitle();
    }

    public boolean validateShopCluesLogo() {
        return shopCluesLogo.isDisplayed();
    }

    public void mouseHover() {
        Utility.mouseHover(driver, mouseHover);
        prd.click();
    }
    public void windowHandles() throws InterruptedException {
        Utility.switchToChildWindow(driver);
        checkBox.click();

    }


    public void validateCookies() {
        Utility.addCookies();
    }

    public void validateDeleteCookies() {
        Utility.deleteCookies();
    }
}