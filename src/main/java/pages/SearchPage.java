package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import testbase.WebTestBase;
import util.Utility;

public class SearchPage extends WebTestBase {
    @FindBy(id="autocomplete")
    WebElement searchTxt;

    @FindBy(xpath="//a[text()='Search']")
    WebElement searchBtn;

    @FindBy(xpath="//h2[text()='(Refurbished) APPLE iPhone XS 256GB Gold - Grade A - (3']")
    WebElement product;

    public SearchPage(){
        super();
        PageFactory.initElements(driver,this);
    }
    public void search(String p) {
        searchTxt.sendKeys(p);
        searchBtn.click();
    }
    public void clickOnProduct(){
        product.click();
    }
    public void windowHandles() throws InterruptedException {
       // Utility.windowHandle(driver);
    }
}



