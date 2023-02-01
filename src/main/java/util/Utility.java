package util;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import static testbase.WebTestBase.driver;

public class Utility {
    public static final long PAGE_LOAD_TIMEOUT = 40;
    public static final long IMPLICITLY_WAIT = 60;

    public static void waitUntilElementToBeClick(WebDriver driver, WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(IMPLICITLY_WAIT));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }


    public static void mouseHover(WebDriver driver, WebElement element) {
        Actions action = new Actions(driver);
        action.moveToElement(element).build().perform();
    }



    public static void switchToChildWindow(WebDriver driver) {
        String parentWindowId=driver.getWindowHandle();
        Set<String> allWindow=driver.getWindowHandles();
        for(String s:allWindow) {
            if (!parentWindowId.contentEquals(s)) {
                driver.switchTo().window(s);
            }
        }

    }


    public static void scrollHandle(WebElement srcElement) throws InterruptedException {
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor)driver;
        javascriptExecutor.executeScript("arguments[0].scrollIntoView();", srcElement);
        Thread.sleep(4000);
}



     public static void selectValue(WebElement element,String term,String value){
         Select drp=new Select(element);
         if(term.equalsIgnoreCase("byValue")){
             drp.selectByValue(value);
         }else  if(term.equalsIgnoreCase("byIndex")) {
             drp.selectByIndex(Integer.parseInt(value));
         }else  if(term.equalsIgnoreCase("byVisibleText")){
             drp.selectByVisibleText(value);
         }else{
             System.out.println("Please Enter Correct Option");
         }
     }

    public static void iFrameHandle(WebElement element) {
        driver.switchTo().frame(element);
    }







    public static void addCookies(){
        Cookie cok= new Cookie("Shopping","Shopclues.com");
        driver.manage().addCookie(cok);
        Set<Cookie> cookies=driver.manage().getCookies();
        for(Cookie c:cookies){
            System.out.println(c);
        }
    }
    public static void deleteCookies(){
        System.out.println("*******delete cookie**********");
        Set<Cookie> cookies1=driver.manage().getCookies();
        for(Cookie c:cookies1){
            System.out.println(c);
        }
    }
}
