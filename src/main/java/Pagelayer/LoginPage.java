package Pagelayer;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

    static WebDriver driver;
    public static void getUrl(String url){
        driver.get(url);
    }
    public static String getGoogleTitle(){
        return  driver.getTitle();
    }

    public static String getGoogleUrl(){
        return  driver.getCurrentUrl();
    }

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        driver= new ChromeDriver();
        getUrl("https://www.google.com");
        System.out.println( getGoogleTitle());
        System.out.println(getGoogleUrl());



    }




}
