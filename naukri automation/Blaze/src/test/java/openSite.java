import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.security.Key;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class openSite {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.baeldung.com/selenium-implicit-explicit-wait");


        WebElement welcome = driver.findElement(By.xpath("//a[normalize-space()='Start Here']"));
        String welcomeNote = welcome.getText();
        System.out.println(welcomeNote);
//        driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(200000));

        Assert.assertEquals(welcomeNote, "Start Here");

        welcome.click();
        driver.quit();
//        String newTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
//        driver.findElement(By.xpath("//a[text()='destination of the week! The Beach!']")).sendKeys(newTab);
//        Thread.sleep(5000);
//
//        WebElement from = driver.findElement(By.xpath("//select[@name='fromPort']"));
//        from.click();
//
//        Select select = new Select(from);
//        select.selectByValue("Mexico City");
//        WebElement to = driver.findElement(By.xpath("//select[@name='toPort']"));
//        to.click();
////        Thread.sleep(5000);
//        Select select1 = new Select(to);
//        select1.selectByValue("London");
//        driver.findElement(By.xpath("//input[@value='Find Flights']")).click();
//        List<WebElement> list = driver.findElements(By.xpath("//td[6]"));

        }

    }
