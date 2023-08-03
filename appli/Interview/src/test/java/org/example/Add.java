package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Add {
    public static void main(String[] args) throws InterruptedException, AWTException {
        try {
            WebDriverManager.chromedriver().setup();
            WebDriver driver;
            driver = new ChromeDriver();
            driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
            driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.findElement(By.xpath("//span[normalize-space()='My Info']")).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            WebElement ee = driver.findElement(By.xpath("//button[normalize-space()='Add']"));
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].scrollIntoView();", ee);
            ee.click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            driver.findElement(By.xpath("//div[@class='oxd-file-input-div']")).click();
            StringSelection stringSelection = new StringSelection("C:\\Users\\kalyan\\Desktop\\busubud.pdf");
            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
            Robot robot = new Robot();
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            Keys.chord(Keys.CONTROL,Keys.ENTER);
            Select select=new Select(ee);
            List<WebElement> op= select.getOptions();                                                                                                                 

        }catch (Exception e){
            e.printStackTrace();
           }
        }
    }


























