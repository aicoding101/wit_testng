package tests;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Cholpon_Kulmat {
        WebDriver driver;
        @BeforeMethod
        public void setup() {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.get("https://www.disney.com/");
        }
        @Test(priority = 1)
        public void SelectAge() throws InterruptedException{
            Assert.assertEquals(driver.getCurrentUrl(),"https://www.disney.com/","Current URL FAILED!");
            WebElement menu = driver.findElement(By.id("goc-button"));
            menu.click();
            Thread.sleep(1000);
            Assert.assertTrue(menu.isDisplayed(),"Menu displayed verification is FAILED!");
            WebElement aulani=driver.findElement(By.linkText("Aulani"));
            aulani.click();
            // Assert.assertEquals(driver.getCurrentUrl(),"https://www.disneyaulani.com/?DISCID=DI_flyawaynav_12","Click to Aulini page verification is FAILED!");
            WebElement adultcounter=driver.findElement(By.id("adult-counter"));
            Assert.assertEquals(adultcounter.getText(),"1","Adult counter default value verification is FAILED!");
            WebElement plusSign=driver.findElement(By.xpath("//*[@id=\"WDWRooms_AulaniRoomOnlySQQProductOption_AulaniSQQPartyMix\"]/div[1]/div/button[2]"));
            plusSign.click();
            plusSign.click();
            plusSign.click();
            Assert.assertTrue(plusSign.isDisplayed(),"Value increment verification is FAILED!");
            WebElement minus = driver.findElement(By.xpath("//*[@id=\"WDWRooms_AulaniRoomOnlySQQProductOption_AulaniSQQPartyMix\"]/div[1]/div/button[1]"));
            minus.click();
            Assert.assertTrue(minus.isDisplayed(),"Value dicrement verification is FAILED!");
            WebElement children = driver.findElement(By.xpath("//*[@id='WDWRooms_AulaniRoomOnlySQQProductOption_AulaniSQQPartyMix']/div[2]/div/button[2]"));
            children.click();
            Assert.assertEquals(driver.getCurrentUrl(),"https://www.disneyaulani.com/?DISCID=DI_flyawaynav_12","Invrement to childerns value verification is FAILED!");
            WebElement dropBox= driver.findElement(By.id("WDWRooms_AulaniRoomOnlySQQProductOption_AulaniSQQPartyMix_child1"));
            dropBox.click();
            Assert.assertEquals(driver.getCurrentUrl(),"https://www.disneyaulani.com/?DISCID=DI_flyawaynav_12","DropBox URL verification is FAILED!");
            WebElement viewRates = driver.findElement(By.id("WDWRooms_AulaniRoomOnlySQQProductOption_Submit"));
            viewRates.click();
            Assert.assertTrue(viewRates.isDisplayed(),"View Rates click verification is FAILED!");
            //driver.quit();
        }
        @Test(priority = 2)
        public void ContactInfo() throws InterruptedException{
            Thread.sleep(2000);
            Assert.assertEquals(driver.getCurrentUrl(),"https://www.disney.com/","Current URL FAILED!");
            WebElement menu = driver.findElement(By.id("goc-button"));
            menu.click();
            Thread.sleep(1000);
            Assert.assertTrue(menu.isDisplayed(),"Menu displayed verification is FAILED!");
            WebElement aulani=driver.findElement(By.linkText("Aulani"));
            aulani.click();
            WebElement contactUs = driver.findElement(By.id("Aulani_Footer2_Questions_Contact_Us"));
            contactUs.click();
            Assert.assertEquals(driver.getCurrentUrl(),"https://www.disneyaulani.com/about-aulani/contact-us/","AContact us select verification is FAILED!");
            Faker faker = new Faker();
            WebElement firstName = driver.findElement(By.id("first_name"));
            firstName.sendKeys(faker.name().firstName());
            WebElement lastName = driver.findElement(By.id("last_name"));
            lastName.sendKeys(faker.name().lastName());
            WebElement email = driver.findElement(By.id("email_address"));
            email.sendKeys(faker.internet().emailAddress());
            WebElement select = driver.findElement(By.id("subject"));
            select.click();
            Select selectObj = new Select(select);
            selectObj.selectByVisibleText("Guest Information");
            WebElement sendMessage = driver.findElement(By.id("your_question"));
            sendMessage.sendKeys("Hello, Could you please tell me how much cost cruise trip for one week?,Thank You!");
            WebElement send = driver.findElement(By.id("go_submit"));
            send.click();
            Assert.assertEquals(driver.getCurrentUrl(),"https://www.disneyaulani.com/about-aulani/contact-us/?form=complete&url=home","Message send verifaication FAILED!");
        }
        @Test(priority = 3)
        public void OpenPhotoPage() throws InterruptedException {
            Thread.sleep(2000);
            Assert.assertEquals(driver.getCurrentUrl(),"https://www.disney.com/","Current URL FAILED!");
            WebElement menu = driver.findElement(By.id("goc-button"));
            menu.click();
            Thread.sleep(1000);
            Assert.assertTrue(menu.isDisplayed(),"Menu displayed verification is FAILED!");
            WebElement aulani=driver.findElement(By.linkText("Aulani"));
            aulani.click();
            WebElement roomsAndoffers = driver.findElement(By.id("Rooms&Offers"));
            roomsAndoffers.click();
            Assert.assertEquals(driver.getCurrentUrl(),"https://www.disneyaulani.com/rooms-offers/","Rooms and Offers click verification is FAILED!");
            WebElement photo = driver.findElement(By.id("launchWDW_Rooms_FloorplanImages_IslandGardensView"));
            photo.click();
            Assert.assertTrue(photo.isDisplayed(),"Photo verification FAILED!");
            Thread.sleep(2000);
            WebElement next = driver.findElement(By.xpath("//div[@class='select-toggle hoverable']"));
            next.click();
            Assert.assertTrue(next.isDisplayed(),"Next button click verification FAILED!");
            WebElement maximize = driver.findElement(By.xpath("//a[@class='fullscreenButton']"));
            maximize.click();
            Assert.assertTrue(maximize.isDisplayed(),"Screen maximize verification is FAILED!");
            WebElement nextPicture = driver.findElement(By.xpath("//a[@class='carouselNext']"));
            nextPicture.click();
            nextPicture.click();
            nextPicture.click();
            nextPicture.click();
            nextPicture.click();
            Assert.assertTrue(nextPicture.isDisplayed(),"Clicking to next picture clickable verification is FAILED!");
            WebElement minimize = driver.findElement(By.xpath("//a[@class='fullscreenButton enabled']"));
            minimize.click();
            Assert.assertTrue(minimize.isDisplayed(),"Screen minimize verification is FAILED!");
            Thread.sleep(2000);
            WebElement closeScreen = driver.findElement(By.xpath("//a[@class='mediaEngineCloseBtn']"));
            closeScreen.click();
            Assert.assertEquals(driver.getCurrentUrl(),"https://www.disneyaulani.com/rooms-offers/","Close screen verification is FAILED!");
            driver.quit();
        }
    }
