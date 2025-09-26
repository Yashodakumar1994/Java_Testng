package testcases.tmobile;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.WebDriverWait;
import objectRepository.tmobile.HomePage;

public class ImplementTmobileNewCustomerDevicePurchaseActivationFlow {
    WebDriver driver;
    WebDriverWait wait;
    HomePage homePage;

    @BeforeMethod
    public void setUp() {
        // If chromedriver is not in PATH, set explicitly:
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Explicit wait
        wait = new WebDriverWait(driver, 15);

        // Navigate directly to T-Mobile cell phones page
        driver.get("https://www.t-mobile.com/");

        // Initialize page objects after driver is ready
        homePage = new HomePage(driver);
    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void testDevicePurchasePage() {

    homePage.clickPhonesAndDevicesLink();
    homePage.clickCellPhoneLink();

    }
}
