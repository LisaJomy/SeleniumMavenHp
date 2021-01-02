package Pagelayer;

import org.testng.annotations.Test;

public class DataProvider {

    @Test(dataProvider = "getData",dataProviderClass = DiffClassdataProvider.class)
    public void loginTest(String username,String pass){

        System.out.println(username+"   "+pass);
    }








}
