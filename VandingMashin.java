package Newsem.Avtomat;


import java.util.LinkedList;

// public class VandingMashin {
//    private LinkedList<Product> list;
   
//    public VandingMashin(){
//     this.list = new LinkedList<>();
//    }

//    public void putProduct(LinkedList<Product> item){
//     this.list = item;
//    }
//    public Product getProduct(){
//     return this.list.getLast();
//    }
//    @Override
//    public String toString(){
//     return "VendingMashin{" +
//             "product=" + list +
//             "}";
//    }
     
// }

public interface VandingMashin{
   public void putProduct(LinkedList<Product> item);
   public Product getProduct();
   
}