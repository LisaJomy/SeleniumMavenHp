package Pagelayer;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMetods {

    @Test

    public void startCar(){
        System.out.println("startCar");
        Assert.fail();

    }
    @Test(dependsOnMethods = {"startCar"})

    public void stopCar(){
        System.out.println("stoptCar");
    }
    @Test(dependsOnMethods = {"stopCar"})

    public void driveCar(){
        System.out.println("driveCar");
    }
    @Test(dependsOnMethods = {"driveCar","startCar"},alwaysRun = true)

    public void parkCar(){
        System.out.println("parkCar");
    }














}
