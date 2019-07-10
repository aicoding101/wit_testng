import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Azamat {

    WebDriver driver;
    WebDriverWait wait;
    WebElement sale;
    Actions action;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 30);
        driver.get("http://shopdisney.com");
        action = new Actions(driver);
    }
    @AfterMethod
    public void tearDown(){
        driver.close();
    }
    //CLOTHING
    @Test(priority = 1)
    public void coatsAndJackets()throws InterruptedException{
        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/sale/coats-jackets']"))).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("coats-jackets"), "Sale Coats & Jackets page verification Failed!");

    }
    @Test(priority = 2)
    public void costumes()throws InterruptedException{
        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/sale/costumes-accessories']"))).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("costumes-accessories"), "Costumes page verification Failed!");
    }
    @Test(priority = 3)
    public void dressesAndSkirts()throws InterruptedException{
        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/sale/dresses-and-skirts']"))).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("dresses-and-skirts"), "Dresses and Skirts page verification Failed!");
    }
    @Test(priority = 4)
    public void sleepwear()throws InterruptedException{
        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/sale/sleepwear']"))).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("sleepwear"), "Sleepwear page verification Failed!");

    }
    @Test(priority = 5)
    public void sweatersAndSweatshirs()throws InterruptedException{
        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/sale/sweaters-sweatshirts']"))).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("sweaters-sweatshirts"), "Sweaters & Sweatshirts page verification Failed!");
    }
    @Test(priority = 6)
    public void tShirtsAndTops()throws InterruptedException{
        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/sale/t-shirts-tops']"))).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("t-shirts-tops"), "T-Shirts & Tops page verification Failed!");
    }
    @Test(priority = 7)
    public void shopAllClothing()throws InterruptedException{
        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-curr-subsection='SALE']//a[@href='/sale/clothes']"))).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("clothes"),"SHOP ALL Clothing page verification Failed!");
    }

    @Test(priority = 8)
    public void bagsAndBackpacks()throws InterruptedException{
        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/sale/bags-backpacks']"))).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("bags-backpacks"), "Bags & Backpacks page verification Failed!");
    }

        //ACCESSORIES

    @Test(priority = 9)
    public void hatsAndGloves()throws InterruptedException{
        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-curr-subsection='SALE']//a[@href='/sale/hats-gloves']"))).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("hats-gloves"), "Hats & Gloves page verification Failed!");
    }
    @Test(priority = 10)
    public void jewelryAndWatches()throws InterruptedException{
        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/sale/jewelry-watches']"))).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("jewelry-watches"),"Jewelry & Watches page verification Failed!");
    }
    @Test(priority = 11)
    public void shoesAndSocks()throws InterruptedException{
        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/sale/shoes-socks']"))).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("shoes-socks"), "Shoes & Socks page verification Failed!");
    }
    @Test(priority = 12)
    public void shopAllAccessories()throws InterruptedException{
        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-curr-subsection='SALE']//a[@href='/sale/accessories']"))).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("accessories"),"SHOP ALL Accessories page verification Failed!");
    }

        //TOYS

    @Test(priority = 13)
    public void carsTrainsAndRCToys()throws InterruptedException{
        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/sale/cars-trains-rc-toys']"))).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("cars-trains-rc-toys"), "Cars, Trains & RC Toys page verification Failed!");
    }
    @Test(priority = 14)
    public void dolls()throws InterruptedException{
        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/sale/dolls']"))).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("dolls"), "Dolls page verification Failed!");
    }
    @Test(priority = 15)
    public void playSets()throws InterruptedException{
        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/sale/play-sets']"))).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("play-sets"), "Play Sets page verification Failed!");
    }
    @Test(priority = 16)
    public void plushAndStuffedAnimals()throws InterruptedException{
        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/sale/plush-stuffed-animals']"))).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("plush-stuffed-animals"), "Plush & Stuffed Animals page verification Failed!");
    }
    @Test(priority = 17)
    public void shopAllToys()throws InterruptedException{
        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-curr-subsection='SALE']//a[@href='/sale/toys']"))).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("toys"), "SHOP ALL Toys page verification Failed!");
    }

    //HOME

    @Test(priority = 18)
    public void bedAndBath()throws InterruptedException{
        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/sale/bed-bath']"))).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("bed-bath"), "Bed & Bath page verification Failed!");
    }
    @Test(priority = 19)
    public void collectibles()throws InterruptedException{
        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='/sale/collectibles']"))).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("collectibles"), "Collectibles page verification Failed!");
    }
    @Test(priority = 20)
    public void kitchenAndDining()throws InterruptedException{
        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-curr-subsection='SALE']//a[@href='/sale/kitchen-dining']"))).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("kitchen-dining"), "Kitchen & Dining page verification Failed!");
    }
    @Test(priority = 21)
    public void ornaments()throws InterruptedException{
        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-curr-subsection='SALE']//a[@href='/sale/ornaments']"))).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("ornaments"), "Ornaments page verification Failed!");
    }
    @Test(priority = 22)
    public void stationeryAndOffice()throws InterruptedException{
        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-curr-subsection='SALE']//a[@href='/sale/stationery']"))).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("stationery"), "Stationery & Office page verification Failed!");
    }
    @Test(priority = 23)
    public void shopAllHome()throws InterruptedException{
        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-curr-subsection='SALE']//a[@href='/sale/home']"))).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("home"), "SHOP ALL Home page verification Failed!");
    }

    //SHOP ALL SALE

    @Test(priority = 24)
    public void shopAllSale()throws InterruptedException{
        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@data-subitem='SHOP ALL SALE']/a"))).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().endsWith("sale"), "SHOP ALL SALE page verification Failed!");

    }








}
