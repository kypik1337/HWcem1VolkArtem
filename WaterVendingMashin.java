package Newsem.Avtomat;

import java.util.LinkedList;

public class WaterVendingMashin implements VandingMashin {
    private LinkedList<Product> water;
    @Override
    public void putProduct(LinkedList<Product> item) {
        this.water = item;
    }

    @Override
    public Product getProduct() {
       return water.pollLast();
    }
    public Product getProduct(String name){
        return water.pollLast();
    }  

    
}
