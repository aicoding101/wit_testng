package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utilities.CD;
import utilities.TestBase;

public class Ameer extends TestBase {

    static {
        getLink("https://www.disney.com/");
    }

    @Test
    public static void AvdentureTime(){

        CD.WaitTime(20);
//        NAVIGATES TO ADVENTURES BY DISNEY
        CD.MoveToElement("xpath", "//div//span/li[@class='goc-desktop goc-parks goc-top-dropdown goc-left-2']");
        CD.FindAndClick("xpath", "//div//div//span//span/span/a[@title='Adventures by Disney']");
//

//        FIND YOUR TRIP HERE SELECTION AREA

//        DESTINATIONS
        CD.FindAndClick("xpath", "//div//section//h2[contains(text(), \"Destinations\")]");


        Assert.assertTrue(CD.FindAndDisplay("xpath", "//h2[contains(text(), \"Destinations\")]"));

        CD.FindAndClick("xpath", "//main//section//div//section//span[@class='NorthAmerica ']");
        CD.FindAndClick("xpath", "//div//section//h2[contains(text(), \"Destinations\")]");

        Assert.assertTrue(CD.FindAndDisplay("xpath", "//body//main//*[@id=\"destinations-filter-group\"]/p[contains(text(), \"North America\")]"));
//

//        DEPARTURE DATES
        Assert.assertTrue(CD.FindAndDisplay("xpath", "//body//main//section//div//section//h2[contains(text(), \"Departure Dates\")]"));

        CD.FindAndClick("xpath", "//body//main//section//div//section//h2[contains(text(), \"Departure Dates\")]");
        CD.FindAndClick("xpath", "//body//main//section//span[contains(text(), \"Sep\")]");
        CD.FindAndDisplay("xpath", "//body//main//section//div//section[@id='dates-filter-group']");

        Assert.assertTrue(CD.FindAndDisplay("xpath", "//body//main//*[@id=\"dates-filter-group\"]/p[contains(text(), \"Sep\")]"));
//

//        TRIP TYPES
        Assert.assertTrue(CD.FindAndDisplay("xpath", "//body//div//section//h2[contains(text(), \"Trip Types\")]"));

        CD.FindAndClick("xpath", "//body//main//section//div//section//h2[contains(text(), \"Trip Types\")]");
        CD.FindAndClick("xpath", "//body//main//section//div//section//span[contains(text(), \"Escapes\")]");
        CD.FindAndClick("xpath", "//body//main//section//div//section//h2[contains(text(), \"Trip Types\")]");

        Assert.assertTrue(CD.FindAndDisplay("xpath", "//*[@id=\"types-filter-group\"]/p[contains(text(), \"Escapes\")]"));
//
        CD.FindAndClick("xpath", "//body//main//section//a[@class='default-btn ts-filters-btn']");

        Assert.assertTrue(CD.driver.findElement(By.xpath("//body//main//section//div//span[@class='count']")).getText().equals("3"));
//
    }

    @Test
    public static void ParksAndTravelDropdownVerification(){
        String linkCompare = "";

        CD.WaitTime(20);
//        CD.MoveToElement("xpath", "//body//div//span/li[@class='goc-desktop goc-parks goc-top-dropdown goc-left-2']");
//        CD.MoveToElement("xpath", "//*[@id=\"goc-bar-left\"]/li[3]/a");

        CD.MoveToElement("xpath", "//body//div//span/li[@class='goc-desktop goc-parks goc-top-dropdown goc-left-2']");

//        START DISPLAY VERIFICATION
        Assert.assertTrue(CD.FindAndDisplay("xpath", "//body//div//div//span//span/span/a[@title='Walt Disney World Resort']"));
        Assert.assertTrue(CD.FindAndDisplay("xpath", "//body//div//div//span//span/span/a[@title='Disneyland Resort']"));
        Assert.assertTrue(CD.FindAndDisplay("xpath", "//body//div//div//span//span/span/a[@title='Disney Cruise Line']"));
        Assert.assertTrue(CD.FindAndDisplay("xpath", "//body//div//div//span//span/span/a[@title='Aulani - A Disney Resort and Spa']"));
        Assert.assertTrue(CD.FindAndDisplay("xpath", "//body//div//div//span//span/span/a[@title='Adventures by Disney']"));
        Assert.assertTrue(CD.FindAndDisplay("xpath", "//body//div//div//span//span/span/a[@title='Disney Vacation Club']"));
//        END DISPLAY VERIFICATION


//        START LINK VERIFICATION
        linkCompare = CD.driver.findElement(By.xpath("//body//div//div//span//span/span/a[@title='Walt Disney World Resort']")).getAttribute("href");
        CD.FindAndClick("xpath", "//body//div//div//span//span/span/a[@title='Walt Disney World Resort']");

        Assert.assertEquals(CD.driver.getCurrentUrl(), linkCompare);

        CD.Back();
        CD.MoveToElement("xpath", "//body//div//span/li[@class='goc-desktop goc-parks goc-top-dropdown goc-left-2']");

        linkCompare = CD.driver.findElement(By.xpath("//body//div//div//span//span/span/a[@title='Disneyland Resort']")).getAttribute("href");
        CD.FindAndClick("xpath", "//body//div//div//span//span/span/a[@title='Disneyland Resort']");

        Assert.assertEquals(CD.driver.getCurrentUrl(), linkCompare);

        CD.Back();
        CD.MoveToElement("xpath", "//body//div//span/li[@class='goc-desktop goc-parks goc-top-dropdown goc-left-2']");

        linkCompare = CD.driver.findElement(By.xpath("//body//div//div//span//span/span/a[@title='Disney Cruise Line']")).getAttribute("href");
        CD.FindAndClick("xpath", "//body//div//div//span//span/span/a[@title='Disney Cruise Line']");

        Assert.assertEquals(CD.driver.getCurrentUrl(), linkCompare);

        CD.Back();
        CD.MoveToElement("xpath", "//body//div//span/li[@class='goc-desktop goc-parks goc-top-dropdown goc-left-2']");

        linkCompare = CD.driver.findElement(By.xpath("//body//div//div//span//span/span/a[@title='Aulani - A Disney Resort and Spa']")).getAttribute("href");
        CD.FindAndClick("xpath", "//body//div//div//span//span/span/a[@title='Aulani - A Disney Resort and Spa']");

        Assert.assertEquals(CD.driver.getCurrentUrl(), linkCompare);

        CD.Back();
        CD.MoveToElement("xpath", "//body//div//span/li[@class='goc-desktop goc-parks goc-top-dropdown goc-left-2']");

        linkCompare = CD.driver.findElement(By.xpath("//body//div//div//span//span/span/a[@title='Adventures by Disney']")).getAttribute("href");
        CD.FindAndClick("xpath", "//body//div//div//span//span/span/a[@title='Adventures by Disney']");

        Assert.assertEquals(CD.driver.getCurrentUrl(), linkCompare);

        CD.Back();
        CD.MoveToElement("xpath", "//body//div//span/li[@class='goc-desktop goc-parks goc-top-dropdown goc-left-2']");

        linkCompare = CD.driver.findElement(By.xpath("//body//div//div//span//span/span/a[@title='Disney Vacation Club']")).getAttribute("href");
        CD.FindAndClick("xpath", "//body//div//div//span//span/span/a[@title='Disney Vacation Club']");

        Assert.assertEquals(CD.driver.getCurrentUrl(), linkCompare);
//        END LINK VERIFICATION

    }

    @Test
    public static void VideoChannelsVerification(){

//        THIS METHOD WILL NAVIGATE TO VIDEO CHANNELS AND VERIFY IF EACH SELECTION IS DISPLAYED AND NAVIGATES TO THE CORRECT PAGE

        String linkCompare = "";

        CD.WaitTime(20);

//        DISNEY PRINCESSES SELECTION
        CD.ScrollToElement("xpath", "//body//div//section[@id='ref-1-9']");

        Assert.assertTrue(CD.FindAndDisplay("xpath", "//body//div/a[@data-title='Disney Princess Videos']"));

        linkCompare = CD.driver.findElement(By.xpath("//body//div/a[@data-title='Disney Princess Videos']")).getAttribute("href");
        CD.FindAndClick("xpath", "//body//div/a[@data-title='Disney Princess Videos']");

        Assert.assertEquals(CD.driver.getCurrentUrl(), linkCompare);

        CD.Back();

//        DISNEY PIXAR SELECTION
        CD.ScrollToElement("xpath", "//body//div//section[@id='ref-1-9']");

        Assert.assertTrue(CD.FindAndDisplay("xpath", "//body//div/a[@data-title='Disney•Pixar']"));

        linkCompare = CD.driver.findElement(By.xpath("//body//div/a[@data-title='Disney•Pixar']")).getAttribute("href");
        CD.FindAndClick("xpath", "//body//div/a[@data-title='Disney•Pixar']");

        Assert.assertEquals(CD.driver.getCurrentUrl(), linkCompare);

        CD.Back();

//        OH MY DISNEY SELECTION
        CD.ScrollToElement("xpath", "//body//div//section[@id='ref-1-9']");

        Assert.assertTrue(CD.FindAndDisplay("xpath", "//body//div/a[@data-title='Oh My Disney']"));

        linkCompare = CD.driver.findElement(By.xpath("//body//div/a[@data-title='Oh My Disney']")).getAttribute("href");
        CD.FindAndClick("xpath", "//body//div/a[@data-title='Oh My Disney']");

        Assert.assertEquals(CD.driver.getCurrentUrl(), linkCompare);

        CD.Back();

//        DISNEY STYLE SELECTION
        CD.ScrollToElement("xpath", "//body//div//section[@id='ref-1-9']");

        Assert.assertTrue(CD.FindAndDisplay("xpath", "//body//div/a[@data-title='Disney Style']"));

        linkCompare = CD.driver.findElement(By.xpath("//body//div/a[@data-title='Disney Style']")).getAttribute("href");
        CD.FindAndClick("xpath", "//body//div/a[@data-title='Disney Style']");

        Assert.assertEquals(CD.driver.getCurrentUrl(), linkCompare);

        CD.Back();

//        RADIO DISNEY SELECTION
        CD.ScrollToElement("xpath", "//body//div//section[@id='ref-1-9']");
        CD.FindAndClick("xpath", "//body//div//section[@id='ref-1-9']//button[@title='Next']");

        Assert.assertTrue(CD.FindAndDisplay("xpath", "//body//div/a[@data-title='Radio Disney']"));

        linkCompare = CD.driver.findElement(By.xpath("//body//div/a[@data-title='Radio Disney']")).getAttribute("href");
        CD.FindAndClick("xpath", "//body//div/a[@data-title='Radio Disney']");

        Assert.assertEquals(CD.driver.getCurrentUrl(), linkCompare);

        CD.Back();

//        DISNEY FAMILY SELECTION
        CD.ScrollToElement("xpath", "//body//div//section[@id='ref-1-9']");
        CD.FindAndClick("xpath", "//body//div//section[@id='ref-1-9']//button[@title='Next']");

        Assert.assertTrue(CD.FindAndDisplay("xpath", "//body//div/a[@data-title='Disney Family']"));

        linkCompare = CD.driver.findElement(By.xpath("//body//div/a[@data-title='Disney Family']")).getAttribute("href");
        CD.FindAndClick("xpath", "//body//div/a[@data-title='Disney Family']");

        Assert.assertEquals(CD.driver.getCurrentUrl(), linkCompare);

        CD.Back();

//        STAR WARS SELECTION
        CD.ScrollToElement("xpath", "//body//div//section[@id='ref-1-9']");
        CD.FindAndClick("xpath", "//body//div//section[@id='ref-1-9']//button[@title='Next']");

        Assert.assertTrue(CD.FindAndDisplay("xpath", "//body//div/a[@data-title='Star Wars']"));

        linkCompare = CD.driver.findElement(By.xpath("//body//div/a[@data-title='Star Wars']")).getAttribute("href");
        CD.FindAndClick("xpath", "//body//div/a[@data-title='Star Wars']");

        Assert.assertEquals(CD.driver.getCurrentUrl(), linkCompare);

        CD.Back();

//        DISNEY CHANNEL SELECTION
        CD.ScrollToElement("xpath", "//body//div//section[@id='ref-1-9']");
        CD.FindAndClick("xpath", "//body//div//section[@id='ref-1-9']//button[@title='Next']");

        Assert.assertTrue(CD.FindAndDisplay("xpath", "//body//div/a[@data-title='Disney Channel']"));

        linkCompare = CD.driver.findElement(By.xpath("//body//div/a[@data-title='Disney Channel']")).getAttribute("href");
        CD.FindAndClick("xpath", "//body//div/a[@data-title='Disney Channel']");

        Assert.assertEquals(CD.driver.getCurrentUrl(), linkCompare);

        CD.Back();

//        MARVEL SELECTION
        CD.ScrollToElement("xpath", "//body//div//section[@id='ref-1-9']");
        CD.FindAndClick("xpath", "//body//div//section[@id='ref-1-9']//button[@title='Next']");
        CD.FindAndClick("xpath", "//*[@id=\"ref-1-9\"]/div/div[2]/button[2]");

        Assert.assertTrue(CD.FindAndDisplay("xpath", "//body//div/a[@data-title='Marvel']"));

        linkCompare = CD.driver.findElement(By.xpath("//body//div/a[@data-title='Marvel']")).getAttribute("href");
        CD.FindAndClick("xpath", "//body//div/a[@data-title='Marvel']");

        Assert.assertEquals(CD.driver.getCurrentUrl(), linkCompare);

    }

}