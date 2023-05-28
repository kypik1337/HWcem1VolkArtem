package Newsem.Avtomat;

import java.util.LinkedList;

public class HotDrink extends Product implements VandingMashin{
    protected int temperature;
    public HotDrink(String productName, Double price, int temperature) {
        super(productName, price);
        this.temperature = temperature;
    }
    
    
    @Override
    public String toString() {
        return ProductName + " price = " + Price + "$ Temperature = " + temperature+ "*C" ;
    }
    private LinkedList<Product> water;
    @Override
    public void putProduct(LinkedList<Product> item) {
        this.water = item;
    }
    @Override
    public Product getProduct() {
       return water.pollLast();
    }    
      
}
