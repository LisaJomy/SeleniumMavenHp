package Pagelayer;

import org.testng.annotations.Test;

public class Grouping {
    @Test(groups = {"sanity"})
    public void test1(){
        System.out.println("tes1");
    }
    @Test(groups = {"regression"})
    public void test2(){
        System.out.println("test2");
    }
    @Test(groups = {"regression"})
    public void test13(){
        System.out.println("test3");
    }
    @Test(groups = {"sanity","regression"})
    public void test4(){
        System.out.println("test4");
    }
    @Test(groups = {"sanity","regression"})
    public void test5(){
        System.out.println("test5");

    }








}
