package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.Utility;

public class IFramePage extends WebTestBase {
    @FindBy(xpath = "//a[text()='Home & Kitchen']")
    WebElement mouseHover;
    @FindBy(xpath = "//a[text()='Kitchen tools']")
    WebElement prd;
    @FindBy(xpath = "//img[@src='https://tpc.googlesyndication.com/simgad/2548124040960596606']")
    WebElement advertise;
    @FindBy(xpath = "//iframe[@id='google_ads_iframe_/124148007/category_bottom_0']")
    WebElement frame;
    public IFramePage() {
        super();
        PageFactory.initElements(driver, this);
    }

    public void mouseHover() {
        Utility.mouseHover(driver, mouseHover);
        prd.click();
    }
    public void clickOnIcon(){

        advertise.click();
    }
    public void validateIFrame(){
        Utility.iFrameHandle(frame);
    }
    public void windowHandles(){
        Utility.switchToChildWindow(driver);
    }
}
