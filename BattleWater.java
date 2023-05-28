package Newsem.Avtomat;

public class BattleWater extends Product {

    public BattleWater(String productName, Double price) {
        super(productName, price);
    }

    @Override
    public Double getPrice() {
        // TODO Auto-generated method stub
        return super.getPrice();
    }

    @Override
    public String getProductName() {
        // TODO Auto-generated method stub
        return super.getProductName();
    }

    @Override
    public void setPrice(Double price) {
        // TODO Auto-generated method stub
        super.setPrice(price);
    }

    @Override
    public void setProductName(String productName) {
        // TODO Auto-generated method stub
        super.setProductName(productName);
    }

    @Override
    public String toString() {
        return ProductName+ " price = " + Price ;
    }

}
