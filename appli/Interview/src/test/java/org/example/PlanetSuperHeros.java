package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class PlanetSuperHeros {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        Actions actions=new Actions(driver);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        WebElement profile= driver.findElement(By.xpath("//img[@class='gb_k gbii']"));
        actions.moveToElement(profile).perform();
//        driver.findElement(By.xpath("//button[text()='LOGIN/SIGNUP']")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//button[text()='Register']")).click();
//        Thread.sleep(5000);
//        driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("kalyan");
//        driver.findElement(By.xpath("//input[@name='lastName']")).sendKeys("kumar");
//        driver.findElement(By.xpath("//input[@name='email']")).sendKeys("kumar33242a31@gmail.com");
//        driver.findElement(By.xpath("//input[@name='mobile']")).sendKeys("1569587491");
//        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("password");
//        driver.findElement(By.xpath("//input[@name='rePassword']")).sendKeys("password");
//        driver.findElement(By.xpath("//button[text()='CREATE AN ACCOUNT ']")).click();
//        Thread.sleep(5000);
//        Assert.assertEquals(driver.getTitle(),"Customer Login");

    }
}
