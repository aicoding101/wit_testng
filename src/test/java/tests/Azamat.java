package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Azamat {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        wait = new WebDriverWait(driver, 30);
        driver.get("http://shopdisney.com");
    }
    @Test
    public void shopSaleTest()throws InterruptedException{
        WebElement sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        Actions action = new Actions(driver);
        //SALE
        //CLOTHING
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//a[@href='/sale/coats-jackets']")).click();
        System.out.println(driver.getCurrentUrl());
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("coats-jackets"), "Sale Coats & Jackets page verification Failed!");

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//a[@href='/sale/costumes-accessories']")).click();
        Thread.sleep(1000);
        System.out.println(driver.getCurrentUrl());
        Assert.assertTrue(driver.getCurrentUrl().contains("costumes-accessories"), "Costumes page verification Failed!");

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//a[@href='/sale/dresses-and-skirts']")).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("dresses-and-skirts"), "Dresses and Skirts page verification Failed!");

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//a[@href='/sale/sleepwear']")).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("sleepwear"), "Sleepwear page verification Failed!");

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//a[@href='/sale/sweaters-sweatshirts']")).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("sweaters-sweatshirts"), "Sweaters & Sweatshirts page verification Failed!");

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//a[@href='/sale/t-shirts-tops']")).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("t-shirts-tops"), "T-Shirts & Tops page verification Failed!");

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//div[@data-curr-subsection='SALE']//a[@href='/sale/clothes']")).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("clothes"),"SHOP ALL Clothing page verification Failed!");

        //ACCESSORIES

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//a[@href='/sale/bags-backpacks']")).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("bags-backpacks"), "Bags & Backpacks page verification Failed!");

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//div[@data-curr-subsection='SALE']//a[@href='/sale/hats-gloves']")).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("hats-gloves"), "Hats & Gloves page verification Failed!");

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//a[@href='/sale/jewelry-watches']")).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("jewelry-watches"),"Jewelry & Watches page verification Failed!");

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//a[@href='/sale/shoes-socks']")).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("shoes-socks"), "Shoes & Socks page verification Failed!");

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//div[@data-curr-subsection='SALE']//a[@href='/sale/accessories']")).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("accessories"),"SHOP ALL Accessories page verification Failed!");

        //TOYS

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//a[@href='/sale/cars-trains-rc-toys']")).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("cars-trains-rc-toys"), "Cars, Trains & RC Toys page verification Failed!");

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//a[@href='/sale/dolls']")).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("dolls"), "Dolls page verification Failed!");

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//a[@href='/sale/play-sets']")).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("play-sets"), "Play Sets page verification Failed!");

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//a[@href='/sale/plush-stuffed-animals']")).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("plush-stuffed-animals"), "Plush & Stuffed Animals page verification Failed!");

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//div[@data-curr-subsection='SALE']//a[@href='/sale/toys']")).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("toys"), "SHOP ALL Toys page verification Failed!");

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//a[@href='/sale/bed-bath']")).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("bed-bath"), "Bed & Bath page verification Failed!");

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//a[@href='/sale/collectibles']")).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("collectibles"), "Collectibles page verification Failed!");

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//div[@data-curr-subsection='SALE']//a[@href='/sale/kitchen-dining']")).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("kitchen-dining"), "Kitchen & Dining page verification Failed!");

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//div[@data-curr-subsection='SALE']//a[@href='/sale/ornaments']")).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("ornaments"), "Ornaments page verification Failed!");

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();
        driver.findElement(By.xpath("//div[@data-curr-subsection='SALE']//a[@href='/sale/stationery']")).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("stationery"), "Stationery & Office page verification Failed!");

        sale = driver.findElement(By.xpath("//li[@data-category='SALE']"));
        action.moveToElement(sale).build().perform();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@data-curr-subsection='SALE']//a[@href='/sale/home']"))).click();
        Thread.sleep(1000);
        Assert.assertTrue(driver.getCurrentUrl().contains("home"), "SHOP ALL Home page verification Failed!");




    }
}
