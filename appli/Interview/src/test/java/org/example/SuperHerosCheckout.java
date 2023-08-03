package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SuperHerosCheckout {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.planetsuperheroes.com/");
        driver.manage().window().maximize();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement bestSellers=driver.findElement(By.xpath("//p[text()='Collections']"));
        js.executeScript("arguments[0].scrollIntoView();",bestSellers);
        WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement hoodies= driver.findElement(By.xpath("//div[@class='row collectionsRowSize']//img"));
        wait.until(ExpectedConditions.visibilityOf(hoodies));
        hoodies.click();
        Thread.sleep(5000);
       WebElement Black= driver.findElement(By.xpath("//img[@alt='Kangaroo Pocket Hoodie-VCSA V Logo Exclusive Jersey -Black']"));
        wait.until(ExpectedConditions.visibilityOf(Black));
        Black.click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[text()='M']")).click();
        driver.findElement(By.xpath("//button[text()='Add To Bag']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[text()='view bag']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[text()='SECURE CHECKOUT ']")).click();
    }
}
