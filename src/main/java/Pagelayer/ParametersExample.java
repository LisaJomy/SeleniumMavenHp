package Pagelayer;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametersExample {

    WebDriver driver;

    @BeforeClass
    @Parameters({"browser","url"})
    public void setup(String browser,String url){
        if (browser.equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }else if(browser.equalsIgnoreCase("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }else
        {
            System.out.println("Please enter the correct browser name");
        }


        //"https://opensource-demo.orangehrmlive.com/"

        driver.get(url);


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
