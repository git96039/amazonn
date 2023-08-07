package Objects.Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import java.time.Duration;

public class ProductPage extends Common{
    WebDriver driver;
    public ProductPage(WebDriver driver){
        this.driver=driver;
    }

   By product= By.xpath("//div[text()='REDMI 12C (Matte Black, 64 GB)']");
    By title=By.xpath("//span[normalize-space()='eGift Card']");

    public void results() throws InterruptedException {
        Thread.sleep(5000);
        String TitleName=driver.findElement(title).getText();
        Assert.assertEquals(TitleName,"eGift Card");
    }
}
