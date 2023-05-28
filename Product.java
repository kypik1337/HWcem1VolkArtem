package Newsem.Avtomat;

public  abstract class Product {
    protected String ProductName;
    protected Double Price;
    public Product(String productName, Double price) {
        this.ProductName = productName;
        this.Price = price;
    }
    public String getProductName() {
        return ProductName;
    }
    public Double getPrice() {
        return Price;
    }
    public void setProductName(String productName) {
        this.ProductName = productName;
    }
    public void setPrice(Double price) {
        this.Price = price;
    }
    
    
    
}
