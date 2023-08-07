package Objects.Objects;

//import org.Objects.Common;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FlipkartSearch  {
    WebDriver driver;
   public FlipkartSearch(WebDriver driver){
       this.driver=driver;
    }
    By cancel=By.xpath("//button[@class='_2KpZ6l _2doB4z']");
    By search=By.xpath("//input[@id='twotabsearchtextbox']");
    By clickk=By.xpath("//input[@id='nav-search-submit-button']");

    public void searchmethod()  {
        try {
                driver.findElement(search).click();
                driver.findElement(search).sendKeys("gift cards");
                driver.findElement(clickk).click();
        }catch (Exception e){
            e.printStackTrace();

        }

    }
}
