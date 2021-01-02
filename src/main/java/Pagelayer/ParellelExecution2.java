package Pagelayer;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParellelExecution2 {
    WebDriver driver;
    @Test
    public void yahooTest() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        driver=new ChromeDriver();
        driver.get("http://www.yahoo.com");
        String title  =driver.getTitle();
        System.out.println(title);

        Thread.sleep(10000);

    }








}
