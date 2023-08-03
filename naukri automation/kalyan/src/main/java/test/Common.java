package test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class Common {
public static WebDriver driver;
public Common (WebDriver driver){
    this.driver=driver;
    }
    public WebDriver lunchBrowser() throws IOException {
        System.out.println("chrome broser started");
        String browserType = readPropertesFail("src/test/resources/application.properties", "browser");
        if (browserType.equalsIgnoreCase("chrome")) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(chromeOptions);
            driver.manage().window().maximize();
        } else if (browserType.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        return driver;
    }
    public WebDriver getDriver() {
        try{
            if (driver == null) driver = lunchBrowser();
        }
        catch (IOException e){

        }
        return driver;
    }

    public String readPropertesFail(String s, String key) throws IOException {
        FileInputStream f = new FileInputStream(s);
        Properties p = new Properties();
        p.load(f);
        return p.getProperty(key);
    }
    public Map<String, String> readFileWithJavaProperties(String s) throws IOException {
        FileInputStream f = new FileInputStream(s);
        Properties properties = new Properties();
        Map<String, String> propertyMap = new HashMap<>();
        properties.load(f);
        for (String key1 : properties.stringPropertyNames()) {
            System.out.println("reddy"+key1);
            String value = properties.getProperty(key1);
            String[] v = value.split(":");
            System.out.println("reddy1"+v[1]);
            propertyMap.put(key1, v[1]);
        }
        return propertyMap;
    }
    public By reterivewLocaters(String value) throws IOException {
//        Map<String, String> va=readFileWithJavaProperties(s);
//              String value= Arrays.toString(va.get(key).split("="));
        String[] v = value.split("=");
        String k;
        if (v[0].length()>=5){
            k=v[1].concat("="+v[2]);
        }
        else {
            k=v[1];
        }
//        String xpathh= v[1];
//        String afterXpath="";
//        if (v.length > 2){
//            afterXpath=v[1]+v[2].trim();
//        }
        By s;
        switch (v[0]){
            case "id":
                s= By.id(k);
                break;
            case "name":
                s=By.name(k);
                break;
            case "xpath":
                s=By.xpath(k);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + v[0]);
        }
        return s;
    }
    public void elementClick(By locter){
        driver.findElement(locter).click();
    }
}
