package TestScenarios;

import Objects.Objects.FlipkartSearch;
import Objects.Objects.ProductPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestMethod {
    WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        WebDriverManager.chromedriver().setup();
         driver=new ChromeDriver();
         driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
         driver.manage().window().maximize();
         driver.get("https://www.amazon.in/");
    }


    @Test(priority = 1)
    public void search() throws InterruptedException {
        FlipkartSearch fk=new FlipkartSearch(driver);
        ProductPage pg=new ProductPage(driver);
        fk.searchmethod();
        pg.results();
     }


    @AfterTest
    public void afterTest(){
        driver.quit();
    }
}
