package Pagelayer;

public class DiffClassdataProvider {
    @org.testng.annotations.DataProvider(name="getData")
    public Object[][] getData(){

        Object [][] data={{"lisa@gmail.com", "abc"},{"jocelin@gmail.com","xyz"},{"joyal@gmail.com","rqa"}};
        return data;
    }




}
