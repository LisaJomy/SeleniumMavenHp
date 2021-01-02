package Pagelayer;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Assertion {

    WebDriver driver;

    @BeforeClass

    public void setup(){
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");

    }
    @Test
   public void logoTest(){
    WebElement logo =driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img"));
    Assert.assertTrue(logo.isDisplayed());

    }

    @Test
    public void pageTitleTest(){

    String title=driver.getTitle();
    Assert.assertEquals(title,"OrangeHRM");
    }

    @Test
    public void tearDown(){

    driver.quit();
}




}
