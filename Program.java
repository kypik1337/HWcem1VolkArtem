package Newsem.Avtomat;

import java.util.LinkedList;

public class Program {
    public static void main(String[] args) {
        WaterVendingMashin wvm = new WaterVendingMashin();
        Product bonAqua = new BattleWater("BonAqua", 4.3);
        Product readKey = new BattleWater("readKey", 3.3);
        LinkedList<Product> l = new LinkedList<>();
        l.add(bonAqua);
        l.add(readKey);
        wvm.putProduct(l);
        System.out.println(wvm.getProduct());
        System.out.println(wvm.getProduct());
        System.out.println(wvm.getProduct());

       
        Product coffi = new HotDrink("makochino", 5.6, 70);
        Product capuch = new HotDrink("capuchino", 9.5, 90);
        l.add(coffi); 
        l.add(capuch);
        System.out.println(wvm.getProduct());
        System.out.println(wvm.getProduct("makochino"));
   

    }
}
