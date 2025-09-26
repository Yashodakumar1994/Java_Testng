package objectRepository.tmobile;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
public class HomePage {
    private WebDriver driver;
    private By phonesAndDevicesLink = By.xpath("//a[normalize-space()='Phones & devices']");
    private By cellPhoneLink = By.xpath("//a[contains(text(),'Cell phones')]");
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCellPhoneLink() {
        driver.findElement(cellPhoneLink).click();
    }
    public void clickPhonesAndDevicesLink() {
        driver.findElement(phonesAndDevicesLink).click();
    }
}
