package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import javax.swing.plaf.TableHeaderUI;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Aziza {

    WebDriver driver;

    @BeforeMethod

    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @Test

    public void checkAllTabs() throws InterruptedException {

        driver.get("http://disney.com");
        WebElement menu = driver.findElement(By.xpath("//button[@class='goc-logo-image']/span"));
        menu.click();
        Thread.sleep(2000);
        WebElement DisneyStyleButton = driver.findElement(By.xpath("//a[@href='https://style.disney.com/']"));
        DisneyStyleButton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


        Assert.assertEquals(driver.getCurrentUrl(), "https://style.disney.com/", "Url verification FAILED");

        String[] arr = {"beauty", "fashion", "living", "news", "video", "shop"};

        driver.findElement(By.xpath("//a[@href='https://style.disney.com/beauty/']")).click();
        Assert.assertTrue(driver.getCurrentUrl().contains(arr[0]), "Navigate to " + arr[0] + " page is FAILED");

        driver.findElement(By.xpath("//a[@href='https://style.disney.com/fashion/']")).click();

        Assert.assertTrue(driver.getCurrentUrl().contains(arr[1]), "Navigate to " + arr[1] + " page is FAILED");

        driver.findElement(By.xpath("//a[@href='https://style.disney.com/living/']")).click();

        Assert.assertTrue(driver.getCurrentUrl().contains(arr[2]), "Navigate to " + arr[2] + " page is FAILED");

        driver.findElement(By.xpath("//a[@href='https://style.disney.com/news/']")).click();

        Assert.assertTrue(driver.getCurrentUrl().contains(arr[3]), "Navigate to " + arr[3] + " page is FAILED");

        driver.findElement(By.xpath("//a[@href='https://video.disney.com/disney-style?bypass_cache=11%20']")).click();

        Assert.assertTrue(driver.getCurrentUrl().contains(arr[4]), "Navigate to " + arr[4] + " page is FAILED");
        driver.navigate().back();

        driver.findElement(By.xpath("//a[@href='https://style.disney.com/shop/']")).click();

        Assert.assertTrue(driver.getCurrentUrl().contains(arr[5]), "Navigate to " + arr[5] + " page is FAILED");


    }

    @Test

    public void AzizaTestTwo() throws InterruptedException {


        driver.get("http://disney.com");

        WebElement menu = driver.findElement(By.xpath("//button[@class='goc-logo-image']/span"));
        menu.click();

        Thread.sleep(2000);

        WebElement DisneyStyleButton = driver.findElement(By.xpath("//a[@href='https://style.disney.com/']"));
        DisneyStyleButton.click();

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement searchButton = driver.findElement(By.xpath("//button[@class='tm-header-search-btn']"));
        searchButton.click();

        Assert.assertTrue(driver.findElement(By.id("tm-search-input")).isEnabled(), "Search button is DISABLED");

        WebElement word = driver.findElement(By.id("tm-search-input"));

        word.sendKeys("tshirt" + Keys.ENTER);

        Assert.assertTrue(driver.getCurrentUrl().contains("tshirt"), "The Search Functionality test case is FAILED");


    }

    @Test

    public void AzizaTestThree() throws InterruptedException {

        driver.get("http://disney.com");
        WebElement menu = driver.findElement(By.xpath("//button[@class='goc-logo-image']/span"));
        menu.click();
        Thread.sleep(2000);

        WebElement DisneyStyleButton = driver.findElement(By.xpath("//a[@href='https://style.disney.com/']"));
        DisneyStyleButton.click();


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebElement faceBook = driver.findElement(By.xpath( "/html/body/div/div[1]/header/div/div[2]/a[1]"));
        faceBook.click();

        Assert.assertTrue(faceBook.getAttribute("href").contains("www.facebook.com"), " Facebook webPage is Failed");



        WebElement insta = driver.findElement(By.xpath("(//a[@name='&lpos=social/sharebar/top-nav&lid=social/sharebar/top-nav/social_Instagram'])[1]"));

        insta.click();

        Assert.assertTrue(insta.getAttribute("href").contains("www.instagram.com"), " Instagram webPage is Failed");



        WebElement youTube = driver.findElement(By.xpath("(//a[@name='&lpos=social/sharebar/top-nav&lid=social/sharebar/top-nav/social_YouTube'])[1]"));
        youTube.click();

        Thread.sleep(3000);
        Assert.assertTrue(youTube.getAttribute("href").contains("www.youtube.com"), "Youtube webPage is Failed");



        Thread.sleep(3000);
        WebElement twitter = driver.findElement(By.xpath("(//a[@name='&lpos=social/sharebar/top-nav&lid=social/sharebar/top-nav/social_Twitter'])[1]"));
        twitter.click();

        Assert.assertTrue(twitter.getAttribute("href").contains("https://twitter.com"), "Twitter webPage is Failed");


        WebElement tumblr = driver.findElement(By.xpath("(//a[@name='&lpos=social/sharebar/top-nav&lid=social/sharebar/top-nav/social_Tumblr'])[1]"));
        tumblr.click();

        Assert.assertTrue(tumblr.getAttribute("href").contains("http://disneystyle.tumblr.com"), "Tumblr webPage is Failed");





    }

}
