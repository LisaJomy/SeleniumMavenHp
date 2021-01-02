package Pagelayer;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ParallelExecution1 {
    WebDriver driver;


    @Test
    public void loginTest1() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://www.google.com");
        String title  =driver.getTitle();
        System.out.println(title);

        Thread.sleep(10000);

    }


    @Test
    public void ZoginTest2() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://www.facebook.com");
        String title  =driver.getTitle();

        Thread.sleep(10000);
    }

  @AfterMethod
  public void tearDown(){
        driver.quit();

  }




}
