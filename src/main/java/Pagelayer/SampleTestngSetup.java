package Pagelayer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SampleTestngSetup {


    @Test

    public void setup(){

        System.out.println("setup");
    }
    @Test
    public void login(){
        System.out.println("login");
    }

    @Test
    public void teardown(){

        System.out.println("teardown");

        Assert.assertEquals(1,1);
    }








}
