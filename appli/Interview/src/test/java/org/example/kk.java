package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;


public class kk {
    public static void main(String[] args) throws IOException, InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.planetsuperheroes.com/");
        driver.manage().window().maximize();
       List<WebElement> all= driver.findElements(By.tagName("a"));
       for (int i=1;i<all.size();i++){
          String links= all.get(i).getAttribute("href");
           try {
               URL url = new URL(links);
               URLConnection urlconn = url.openConnection();
               HttpURLConnection conn = (HttpURLConnection) urlconn;
               conn.connect();
               if (conn.getResponseCode() == 200) {
                   System.out.println(all.get(i).getText() + " link working");
               } else {
                   System.out.println(all.get(i).getText() + " not working");
               }
           } catch (MalformedURLException e) {
               System.err.println("Invalid URL: " + links);
               e.printStackTrace();
           } catch (IOException e) {
               System.err.println("Error connecting to the URL: " + links);
               e.printStackTrace();
           }
       }

    }
}

