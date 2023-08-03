package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.awt.datatransfer.StringSelection;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.time.Duration;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;



public class toOpenChrome {

    public static void main(String[] args) throws java.io.IOException, InterruptedException ,  java.awt.AWTException {
        //
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
//        File file=new File("org/example/Kalyan Quality Analyst1.pdf.docx");
//       String kk= file.getAbsolutePath();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();



       WebElement ele= driver.findElement(By.xpath("//input[@id='imagesrc']"));
       ele.click();
       driver.close();
//        Actions actions=new Actions(driver);
//        actions.moveToElement(ele).click().build().perform();
//        System.out.println(kk);
//               ele.click();
//               ele.sendKeys("C://Users//kalyan//Documents//Test Plan.pdf");
//        Thread.sleep(5000);
//StringSelection stringSelection = new StringSelection("C://Users//kalyan//Desktop//CandidateForm_NCS^Kalyan.aaadocx") ;
//Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection, null);
//Robot robot=new Robot();
//robot.keyPress(KeyEvent.VK_CONTROL);
//robot.keyPress(KeyEvent.VK_ENTER);
//robot.keyRelease(KeyEvent.VK_CONTROL);
//robot.keyRelease(KeyEvent.VK_ENTER);

    }}
////    WebDriverManager.chromedriver().setup();
//        FileInputStream fileInputStream= new FileInputStream("C:/Users/kalyan/Desktop/appli/Interview/xpath.properties");
//        Properties properties=new Properties();
//        properties.load(fileInputStream);
//        driver.get(properties.getProperty("url"));
//        sleep(100);
////
/////*
//       String title= driver.getTitle();
//        System.out.println("TITLE"+title);
//        System.out.println("SOURCE"+driver.getPageSource());
////*/
//        WebElement element= driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
//element.sendKeys("test");
//Thread.sleep(5000);
//List<WebElement> all =driver.findElements(By.tagName("a"));
//        System.out.println(all.size());
//for (int i=1;i<all.size();i++){
//    System.out.println(all.get(i).getText());
//    System.out.println(all.get(i).getAttribute("href"));
//    String a =all.get(i).getAttribute("href");
//    URL url=new URL(a);
////    URL url=new URL(a);
//    URLConnection con= url.openConnection();
//    HttpURLConnection  httpURLConnection=(HttpURLConnection)con;
////    HttpURLConnection httpURLConnection=(HttpURLConnection)con;
//    con.connect();
//    if (httpURLConnection.getResponseCode()==200){
//        System.out.println("ok");
//
//    }else {
//        System.out.println("no");
//    }
////    }
//        }
//driver.switchTo().frame("");
//driver.switchTo().alert().accept();
//driver.switchTo().alert().dismiss();
//driver.switchTo().alert().getText();
//driver.switchTo().alert().sendKeys("jhds");
////
////
//        StringSelection stringSelection=new StringSelection("sdf");
//        Robot robot = new Robot();
//        robot.keyPress(KeyEvent.VK_CONTROL);
//        robot.keyPress();
////
//        JavascriptExecutor javascriptExecutor=(JavascriptExecutor)driver;
//        javascriptExecutor.executeScript("arguments[0].click()",element);
//        driver.close();
//
//        Actions actions = new Actions(driver);
//        actions.moveToElement(element).click().build().perform();
//        actions.keyDown(Keys.SHIFT).build().perform();
////        actions.dragAndDrop();
////
//        JavascriptExecutor js = (JavascriptExecutor)driver;
//        js.executeScript("arguments[0].style.border=5px solid red",element);
//        js.executeScript("arguments[0].scrollIntoView(True)",element);
//        js.executeScript("history.go(0)");
//        js.executeScript("arguments[0].value='sa'",element);
//driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(10));
//driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
//        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(1000));
//        driver.manage().timeouts().pageLoadTimeout(Duration.ofMillis(1000));
//
//        WebDriverWait wait = new WebDriverWait(driver,Duration.ofDays(1));
//        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("abdsdg")));
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.tagName("a"))));
//
//        FileInputStream fileInputStream1 = new FileInputStream("c:/");
//        Properties properties1=new Properties();
//        properties.load(fileInputStream1);
//        properties1.getProperty("url");
//
//        File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//                File DSTfile=new File("c:/USERS");
//        FileHandler.copy(src,DSTfile);
//            ChromeOptions chromeOptions=new ChromeOptions();
//            chromeOptions.addArguments("headless");
//            WebDriver driver1=new ChromeDriver(chromeOptions);
//              DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
//            desiredCapabilities.setAcceptInsecureCerts(true);
//            WebDriver driver2=new ChromeDriver();
//            Assert.assertEquals("d","d");
//            boolean T=true;
//Assert.assertTrue(T);
//        SoftAssert softAssert=new SoftAssert();
////        softAssert.assertEquals();
//        softAssert.assertAll();
//
//
//     Scanner scan=new Scanner(System.in);
//     System.out.println("enter");
//     int n=scan.nextInt();
////     Scanner scanner = new Scanner(System.in);
////     System.out.println("enter value:");
////     int n = scanner.nextInt();
//     int i=0; int num=0;
//     String prime=" ";
//     int count=0;
//  for ( i=1;i<=100;i++){
//      for ( num=i;num>=1;num--){
//          if(i%num==0){
//              count=count+1;
//          }
//      }
//      if(count ==2){
//          prime=prime+i+" ";
//
//      }
//  }
//     System.out.println(prime);
//    }}
//    String reverse="";
//        for(String  word : words){
//                String revedword=" ";
//                for (int j=word.length()-1;j>=0;j--){
//                revedword+=word.charAt(j);
//                }
//                reverse += revedword+" ";
//                }
//
//                System.out.println(reverse);
////        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("dgsjyd"))));
//        driver.get("https://www.google.com");
//        WebElement element= driver.findElement(By.id("APjFqb"));
//        element.sendKeys("kalyan");
//        Thread.sleep(5000);
//      List<WebElement> all=driver.findElements(By.tagName("a"));
//        System.out.println(all.size());
////        WebDriverWait wait = new WebDriverWait(driver, 0b1100100);
//String web= driver.getTitle();
////        System.out.println(s);
//        step.aa();
//        driver.manage().timeouts().implicitlyWait(5000,TimeUnit.MILLISECONDS);
//////        driver.close();
////        driver.navigate().to("https://search.yahoo.com/search;_ylt=AwrjdDvwPDpkpUISb5RXNyoA;_ylc=X1MDMjc2NjY3OQRfcgMyBGZyA21jYWZlZQRmcjIDcDpzLHY6dyxtOnNhLHNhX21rOjEzBGdwcmlkA1FiYjF4cUlDUWRTT1Q2bDlwcTNiakEEbl9yc2x0AzAEbl9zdWdnAzEwBG9yaWdpbgNzZWFyY2gueWFob28uY29tBHBvcwMxBHBxc3RyA2RlcGVuZGVueSAEcHFzdHJsAzEwBHFzdHJsAzMyBHF1ZXJ5A2RlcGVuZGVueSUyMGZvciUyMHdlYiUyMGRyaXZlciUyMG1hbmFnZXIEdF9zdG1wAzE2ODE1NDAwNzgEdXNlX2Nhc2UD?p=dependeny+for+web+driver+manager&fr2=p%3As%2Cv%3Aw%2Cm%3Asa%2Csa_mk%3A13&fr=mcafee&type=E210US826G0");
////        driver.get("https://www.fb.com");
//        Scanner scan = new Scanner();

    /*
            String input = "kalyan kumar";
            String[] words = input.split(" ");
                String result = "";
                for (String word : words) {
                    String reversedWord = "";
                    for (int i = word.length() - 1; i >= 0; i--) {
                        reversedWord += word.charAt(i);
                    }
                    result += reversedWord + " ";
                }
                System.out.println(result.trim());

        String reverse="";
        for(String  word : words){
            String revedword=" ";
            for (int j=word.length()-1;j>=0;j--){
                revedword+=word.charAt(j);
            }
            reverse += revedword+" ";
        }

        System.out.println(reverse);

        int n, a = 1, b = 1, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        n = sc.nextInt();
        System.out.print("Fibonacci Series: ");
        for(int i = 1; i <= n; i++) {
            System.out.print(a + " ");
            c = a + b;
            a = b;
            b = c;

        }



            while (n != 0) {
                rev = rev * 10 + n % 10;
                n = n / 10;
            }
            if (temp == rev) {
                System.out.println("poly");
            } else {
                System.out.println("no");
            }


            Scanner sc = new Scanner(System.in);
            String n = sc.next();
           int in= n.length();
            String rev = "";
            String temp =n;
                for(int i=in-1;i>=0;i--){
                  rev = rev+n.charAt(i);
                }
            if(temp.equals(rev)) {
                System.out.println("poly");
            }else{
                System.out.println("no");
            }
                  int fac=1;
          for (int i= 1;i<=num;i++){
              fac=fac*i;
          }
            System.out.println(fac);

                    int a = num % 2;
            if (a == 0) {
                System.out.println("yes");
            } else {
                System.out.println("no");
                       String num="sd87dh sdhdasjd7s@#$";
            String s = num.replaceAll("[^a-zA-Z0-9]","");

            System.out.println(s);
     */
//        Scanner scan = new Scanner(System.in);
//        System.out.println("ent");
//        String num = scan.nextLine();
//int a=5;
//for (int i=0;i<=a;i++){
//    for (int j=0;j<=i;j++){
//        System.out.print("*");
//    }
//    System.out.println();
//    File shot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//    File file = new File("//c:");
//        FileUtils.copyFile(shot,file);


