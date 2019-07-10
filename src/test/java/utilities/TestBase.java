package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class TestBase {

    public static WebDriver driver;
    public static String linkUsedInSetUp;

    public static void getLink(String linkForSetup) {
        linkUsedInSetUp = linkForSetup;
    }


    @BeforeClass
    public void chromeDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeMethod
    public void setUp() {
        driver = new ChromeDriver();
        CD.driver = driver;
        driver.get(linkUsedInSetUp);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException{

        Thread.sleep(10000);
        driver.close();
    }

}
