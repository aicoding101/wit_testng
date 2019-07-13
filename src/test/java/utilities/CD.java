package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class CD {

//    WELCOME TO SAIM AND AMEER'S DEPENDENCIES!
//    HERE WE BELIEVE IN CODE RE-USABILITY!

    public static WebDriver driver;
    public static WebElement element;
    public static Select selected;
    public static Actions action;
    public static Alert alert;
    public static String mainHandle;

    //    Set driver to Chrome and Open the browser to the injected link
    public static void SetChromeDriver(String link) {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(link);
        driver.manage().window().maximize();
        WaitTime(10);
    }

    //    Set driver to FireFox and Open the browser to the injected link
    public static void SetGeckoDriver(String link){
        WebDriverManager.firefoxdriver().setup();
        driver = new FirefoxDriver();
        driver.get(link);
        driver.manage().window().maximize();
        WaitTime(10);
    }

    public static void NavigateToPage(String link){
        driver.navigate().to(link);
    }

    public static void Forward(){
        driver.navigate().forward();
    }

    public static void Back(){
        driver.navigate().back();
    }

    public static void WaitTime(int time) {
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
    }

    public static void CreateAlert(){
        alert = CD.driver.switchTo().alert();
    }

    public static void CreateMainHandle() {
        mainHandle = CD.driver.getWindowHandle();
    }

    public static void switchWindow(String handle) {
        CD.driver.switchTo().window(handle);
    }

    public static void ScrollToElement(Locators locator, String value){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        switch (locator){
            case xpath:
                element = driver.findElement(By.xpath(value));
                break;
            case id:
                element = driver.findElement(By.id(value));
                break;
            case name:
                element = driver.findElement(By.name(value));
                break;
            case cssSelector:
                element = driver.findElement(By.cssSelector(value));
                break;
            case tagName:
                element = driver.findElement(By.tagName(value));
                break;
            case parcialLinkText:
                element = driver.findElement(By.partialLinkText(value));
                break;
            case className:
                element = driver.findElement(By.className(value));
                break;
            case linkText:
                element = driver.findElement(By.linkText(value));
                break;
        }
    }

//    public static void ScrollToElement(String locator, String value){
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        if(locator.equalsIgnoreCase("id")){
//            element = driver.findElement(By.id(value));
//        }else if(locator.equalsIgnoreCase("xpath")){
//            element = driver.findElement(By.xpath(value));
//        }else if(locator.equalsIgnoreCase("name")){
//            element = driver.findElement(By.name(value));
//        }else if(locator.equalsIgnoreCase("link")){
//            element = driver.findElement(By.linkText(value));
//        }else if(locator.equalsIgnoreCase("partial")){
//            element = driver.findElement(By.partialLinkText(value));
//        }else if(locator.equalsIgnoreCase("css")){
//            element = driver.findElement(By.cssSelector(value));
//        }else if(locator.equalsIgnoreCase("tag")){
//            element = driver.findElement(By.tagName(value));
//        }else if(locator.equalsIgnoreCase("className")){
//            element = driver.findElement(By.className(value));
//        }else{
//            System.out.println("Invalid locator");
//            Done();
//        }
//    }

    //    Takes an integer of pixels to determine the range scrolled within a page (scroll down)
    public static void ScrollPage(int pixels){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        if(pixels > 0){
            js.executeScript("window.scrollBy(0," + pixels + ")");
        }else{
            js.executeScript("window.scrollBy(0," + Integer.MAX_VALUE + ")");
        }
    }

    public static void CloseTab(){
        driver.findElement(By.tagName("body")).sendKeys(Keys.chord(Keys.CONTROL, "w"));
    }

    public static void MoveToElement(Locators locator, String value){
        action = new Actions(CD.driver);
        WebElement web = null;
        switch (locator){
            case xpath:
                web = CD.driver.findElement(By.xpath(value));
                action.moveToElement(web).perform();
                break;
            case id:
                web = CD.driver.findElement(By.id(value));
                action.moveToElement(web).perform();
                break;
            case name:
                web = CD.driver.findElement(By.name(value));
                action.moveToElement(web).perform();
                break;
            case cssSelector:
                web = CD.driver.findElement(By.cssSelector(value));
                action.moveToElement(web).perform();
                break;
            case tagName:
                web = CD.driver.findElement(By.tagName(value));
                action.moveToElement(web).perform();
                break;
            case parcialLinkText:
                web = CD.driver.findElement(By.partialLinkText(value));
                action.moveToElement(web).perform();
                break;
            case className:
                web = CD.driver.findElement(By.className(value));
                action.moveToElement(web).perform();
                break;
            case linkText:
                web = CD.driver.findElement(By.linkText(value));
                action.moveToElement(web).perform();
                break;
        }
    }

    public static void CreateSelectObject(Locators locator, String value){
        switch (locator){
            case xpath:
                selected = new Select(driver.findElement(By.xpath(value)));
                break;
            case id:
                selected = new Select(driver.findElement(By.id(value)));
                break;
            case name:
                selected = new Select(driver.findElement(By.name(value)));
                break;
            case cssSelector:
                selected = new Select(driver.findElement(By.cssSelector(value)));
                break;
            case tagName:
                selected = new Select(driver.findElement(By.tagName(value)));
                break;
            case parcialLinkText:
                selected = new Select(driver.findElement(By.partialLinkText(value)));
                break;
            case className:
                selected = new Select(driver.findElement(By.className(value)));
                break;
            case linkText:
                selected = new Select(driver.findElement(By.linkText(value)));
                break;
        }
    }

//    public static void CreateSelectObject(String locator, String value) {
//        if(locator.equalsIgnoreCase("id")){
//            selected = new Select(driver.findElement(By.id(value)));
//        }else if(locator.equalsIgnoreCase("xpath")){
//            selected = new Select(driver.findElement(By.xpath(value)));
//        }else if(locator.equalsIgnoreCase("name")){
//            selected = new Select(driver.findElement(By.name(value)));
//        }else if(locator.equalsIgnoreCase("link")){
//            selected = new Select(driver.findElement(By.linkText(value)));
//        }else if(locator.equalsIgnoreCase("partial")){
//            selected = new Select(driver.findElement(By.partialLinkText(value)));
//        }else if(locator.equalsIgnoreCase("css")){
//            selected = new Select(driver.findElement(By.cssSelector(value)));
//        }else if(locator.equalsIgnoreCase("tag")){
//            selected = new Select(driver.findElement(By.tagName(value)));
//        }else if(locator.equalsIgnoreCase("className")){
//            selected = new Select(driver.findElement(By.className(value)));
//        }else{
//            System.out.println("Invalid locator");
//            Done();
//        }
//    }

//    public static void CompareText(String locator, String value, String compare){
//        if(locator.equalsIgnoreCase("id")){
//            driver.findElement(By.id(value)).getText().contains(compare);
//        }else if(locator.equalsIgnoreCase("xpath")){
//            driver.findElement(By.xpath(value)).getText().contains(compare);
//        }else if(locator.equalsIgnoreCase("name")){
//            driver.findElement(By.name(value)).getText().contains(compare);
//        }else if(locator.equalsIgnoreCase("link")){
//            driver.findElement(By.linkText(value)).getText().contains(compare);
//        }else if(locator.equalsIgnoreCase("partial")){
//            driver.findElement(By.partialLinkText(value)).getText().contains(compare);
//        }else if(locator.equalsIgnoreCase("css")){
//            driver.findElement(By.cssSelector(value)).getText().contains(compare);
//        }else if(locator.equalsIgnoreCase("tag")){
//            driver.findElement(By.tagName(value)).getText().contains(compare);
//        }else if(locator.equalsIgnoreCase("className")){
//            driver.findElement(By.className(value)).getText().contains(compare);
//        }else{
//            System.out.println("Invalid locator");
//            ThatsIt();
//        }
//    }

    public static void CompareText(Locators locator, String value, String compare){
        switch (locator){
            case xpath:
                driver.findElement(By.xpath(value)).getText().contains(compare);
                break;
            case id:
                driver.findElement(By.id(value)).getText().contains(compare);
                break;
            case name:
                driver.findElement(By.name(value)).getText().contains(compare);
                break;
            case cssSelector:
                driver.findElement(By.cssSelector(value)).getText().contains(compare);
                break;
            case tagName:
                driver.findElement(By.tagName(value)).getText().contains(compare);
                break;
            case parcialLinkText:
                driver.findElement(By.partialLinkText(value)).getText().contains(compare);
                break;
            case className:
                driver.findElement(By.className(value)).getText().contains(compare);
                break;
            case linkText:
                driver.findElement(By.linkText(value)).getText().contains(compare);
                break;
        }
    }


    public static void ClearField(Locators locator, String value){
        switch (locator){
            case xpath:
                driver.findElement(By.xpath(value)).clear();
                break;
            case id:
                driver.findElement(By.id(value)).clear();
                break;
            case name:
                driver.findElement(By.name(value)).clear();
                break;
            case cssSelector:
                driver.findElement(By.cssSelector(value)).clear();
                break;
            case tagName:
                driver.findElement(By.tagName(value)).clear();
                break;
            case parcialLinkText:
                driver.findElement(By.partialLinkText(value)).clear();
                break;
            case className:
                driver.findElement(By.className(value)).clear();
                break;
            case linkText:
                driver.findElement(By.linkText(value)).clear();
                break;
        }
    }

    //    Clear text from selected field
//    public static void ClearField(String locator, String value){
//        if(locator.equalsIgnoreCase("id")){
//            driver.findElement(By.id(value)).clear();
//        }else if(locator.equalsIgnoreCase("xpath")){
//            driver.findElement(By.xpath(value)).clear();
//        }else if(locator.equalsIgnoreCase("name")){
//            driver.findElement(By.name(value)).clear();
//        }else if(locator.equalsIgnoreCase("link")){
//            driver.findElement(By.linkText(value)).clear();
//        }else if(locator.equalsIgnoreCase("partial")){
//            driver.findElement(By.partialLinkText(value)).clear();
//        }else if(locator.equalsIgnoreCase("css")){
//            driver.findElement(By.cssSelector(value)).clear();
//        }else if(locator.equalsIgnoreCase("tag")){
//            driver.findElement(By.tagName(value)).clear();
//        }else if(locator.equalsIgnoreCase("className")){
//            driver.findElement(By.className(value)).clear();
//        }else{
//            System.out.println("Invalid locator");
//            ThatsIt();
//        }
//    }

    //    Tells us if a test passed or failed
    public static String PassOrFail(boolean b) {

//        switch (b){
//            case true:
//                return "PASSED";
//                break;
//            case false:
//                return "FAILED";
//                break;
//        }

        if(b) {
            return "PASSED";
        } else {
            return "FAILED";
        }
    }

    //    Maximize browser window
    public static void MaximizeWindow(){
        driver.manage().window().maximize();
    }

//    Find element (clickable field) in page and click
//    Can also be used to click on random text (when you want to click away from a certain field)
//    locator: choose locator type (eg. name, id, xpath, etc.)
//    value: value of element based on locator (eg. locator name: element "some name")
    public static void FindAndClick(Locators locator, String value){
        switch (locator){
            case xpath:
                driver.findElement(By.xpath(value)).click();
                break;
            case id:
                driver.findElement(By.id(value)).click();
                break;
            case name:
                driver.findElement(By.name(value)).click();
                break;
            case cssSelector:
                driver.findElement(By.cssSelector(value)).click();
                break;
            case tagName:
                driver.findElement(By.tagName(value)).click();
                break;
            case parcialLinkText:
                driver.findElement(By.partialLinkText(value)).click();
                break;
            case className:
                driver.findElement(By.className(value)).click();
                break;
            case linkText:
                driver.findElement(By.linkText(value)).click();
                break;
        }
    }

//    Find element (text box) in a page and send given keys
//    locator: choose locator type (eg. name, id, xpath, etc.)
//    value: value of element based on locator (eg. locator name: element "some name")
//    send: value to be sent to input box (eg. locator id: element "some id", send "some text you want to input")
    public static void FindAndSendKeys(Locators locator, String value, String send){
        switch (locator){
            case xpath:
                driver.findElement(By.xpath(value)).sendKeys(send);
                break;
            case id:
                driver.findElement(By.id(value)).sendKeys(send);
                break;
            case name:
                driver.findElement(By.name(value)).sendKeys(send);
                break;
            case cssSelector:
                driver.findElement(By.cssSelector(value)).sendKeys(send);
                break;
            case tagName:
                driver.findElement(By.tagName(value)).sendKeys(send);
                break;
            case parcialLinkText:
                driver.findElement(By.partialLinkText(value)).sendKeys(send);
                break;
            case className:
                driver.findElement(By.className(value)).sendKeys(send);
                break;
            case linkText:
                driver.findElement(By.linkText(value)).sendKeys(send);
                break;
        }
    }

//    Find element (text box) in a page and send given keys, then enter
//    locator: choose locator type (eg. name, id, xpath, etc.)
//    value: value of element based on locator (eg. locator name: element "some name")
//    send: value to be sent to input box (eg. locator id: element "some id", send "some text you want to input")
    public static void FindAndSendKeysENTER(Locators locator, String value, String send){
        switch (locator){
            case xpath:
                driver.findElement(By.xpath(value)).sendKeys(send + Keys.ENTER);
                break;
            case id:
                driver.findElement(By.id(value)).sendKeys(send + Keys.ENTER);
                break;
            case name:
                driver.findElement(By.name(value)).sendKeys(send + Keys.ENTER);
                break;
            case cssSelector:
                driver.findElement(By.cssSelector(value)).sendKeys(send + Keys.ENTER);
                break;
            case tagName:
                driver.findElement(By.tagName(value)).sendKeys(send + Keys.ENTER);
                break;
            case parcialLinkText:
                driver.findElement(By.partialLinkText(value)).sendKeys(send + Keys.ENTER);
                break;
            case className:
                driver.findElement(By.className(value)).sendKeys(send + Keys.ENTER);
                break;
            case linkText:
                driver.findElement(By.linkText(value)).sendKeys(send + Keys.ENTER);
                break;
        }
    }

//    Find element on a page and check if it is displayed
//    locator: choose locator type (eg. name, id, xpath, etc.)
//    value: value of element based on locator (eg. locator name: element "some name")
    public static boolean FindAndDisplay(Locators locator, String value) {
        switch (locator){
            case xpath:
                driver.findElement(By.xpath(value)).isDisplayed();
                break;
            case id:
                driver.findElement(By.id(value)).isDisplayed();
                break;
            case name:
                driver.findElement(By.name(value)).isDisplayed();
                break;
            case cssSelector:
                driver.findElement(By.cssSelector(value)).isDisplayed();
                break;
            case tagName:
                driver.findElement(By.tagName(value)).isDisplayed();
                break;
            case parcialLinkText:
                driver.findElement(By.partialLinkText(value)).isDisplayed();
                break;
            case className:
                driver.findElement(By.className(value)).isDisplayed();
                break;
            case linkText:
                driver.findElement(By.linkText(value)).isDisplayed();
                break;
        }
        return false;
    }

    //    THAT'S IT!
    public  static void ThatsIt(){ driver.quit(); }
    //    DONE!
    public  static void Done(){
        driver.quit();
    }

    public enum Locators{
        xpath, id, name, linkText, cssSelector, className, parcialLinkText, tagName
    }

}

