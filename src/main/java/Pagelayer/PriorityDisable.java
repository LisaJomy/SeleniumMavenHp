package Pagelayer;

import org.testng.annotations.Test;

public class PriorityDisable {

   @Test
   public void testOne(){
  System.out.println("testOne");
   }

   @Test(priority = 1)
   public void testtwo(){
       System.out.println("testtwo");
   }

    @Test(priority = 2)
    public void testthree(){
        System.out.println("testthree");
    }

    @Test(priority = 3,enabled=true)
    public void testfour(){
        System.out.println("testfour");
    }








}
