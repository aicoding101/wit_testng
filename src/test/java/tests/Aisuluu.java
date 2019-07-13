package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Aisuluu {
    WebDriver driver;
    @BeforeClass
    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);}

    @BeforeMethod
    public void getHomePage(){
        driver.get("https://www.disney.com/");



    }
    @AfterMethod
    public void close(){
        driver.close();
    }
    @Test
    public void parkAndTravel() {




        WebElement travelAndParks = driver.findElement(By.id("goc-button"));
        travelAndParks.click();

        // WebElement WaltDisney = driver.findElement(By.xpath(""));
        // WaltDisney.click();

        List<WebElement> list = driver.findElements(By.xpath(
                "(//dl[@class='menu-section'])[1]/dd[3]/a"));
        System.out.println(list.size());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getText());
            //  driver.findElement(By.linkText(list.get(i).getText())).click();
            Assert.assertEquals(list.get(1).getText(),"Walt Disney World","list functionality did not pass");


        }
    }
    @Test
    public  void disneyland() throws InterruptedException {

        driver.get("https://www.disney.com/");
        WebElement travelAndParks= driver.findElement(By.id("goc-button"));
        travelAndParks.click();
        Thread.sleep(2000);

        driver.findElement(By.xpath(
                "//a[@href='https://disneyworld.disney.go.com/?DISCID=DI_flyawaynav_9']")).click();
        String string = driver.findElement(By.xpath("//input[@id='qqForm_adultCount']")).getAttribute("value");
        //if (string.equals("2")) {
        //     System.out.println("Default value of 'Adults+18' is passed,2");
        //  } else {
        //     System.out.println("Default value didnt pass");
        // }
        Assert.assertEquals(string,"2","Default value didnt pass");
        String child = driver.findElement(By.xpath("//input[@id='qqForm_childCount']")).getAttribute("value");
        if (child.equals("0")) {
            System.out.println("Default value of 'Children' is passed,0");
        } else {
            System.out.println("Default value didnt pass");
//                    driver.close();
        }
    }
    @Test
    public  void disneyCruiseLine() throws InterruptedException {

        driver.get("https://www.disney.com/");
        WebElement travelAndParks = driver.findElement(By.id("goc-button"));
        travelAndParks.click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//a[@href='https://disneycruise.disney.go.com/?DISCID=DI_flyawaynav_11']")).click();

        driver.findElement(By.xpath("//span[.='Travel Party']")).click();
        WebElement checkbox = driver.findElement(By.id("accessibility-checkbox-1"));
        checkbox.click();
        //Assert.assertTrue(driver.findElement(By.id("accessibility-checkbox-1")).isSelected(),"Accesibble is not selected");

        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, 50);
        WebElement button = driver.findElement(By.xpath("(//span[@class='buttonText'])[1]"));
        wait.until(ExpectedConditions.elementToBeClickable(button)).click();


        driver.findElement(By.xpath("//*[@id=\"quickQuoteContainer\"]/div/dcl-quick-quote/div/form/div/div/div[1]" +
                "/wdpr-finder-facet-bar/section/ul/li[2]/a")).click();


        Thread.sleep(2000);

        WebElement month = driver.findElement(By.id("2020-07-07"));
        month.click();

        driver.findElement(By.id("8 to 13")).click();
        driver.findElement(By.xpath("(//span[@class='ng-scope ng-binding'])[3]")).click();
        driver.findElement(By.id("hawai'i-cruises")).click();
        driver.findElement(By.xpath("(//span[@class='ng-scope ng-binding'])[4]")).click();driver.findElement(By.id("honolulu-hawai'i-")).click();
        driver.findElement(By.xpath("//span[.='Find Prices']")).click();
        WebElement availableCruises = driver.findElement(By.xpath("(//span[@class='ng-binding'])[4]"));
        Assert.assertTrue(availableCruises.isDisplayed(),"Available cruises default value is  not dispalayed");



    }}









