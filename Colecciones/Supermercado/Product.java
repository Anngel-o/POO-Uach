package Supermercado;

public class Product {
    Product() {
        this(DEF_NAME, DEF_PRICE, DEF_DESCRIPTION, DEF_BRAND);
    }
    
    Product(String name, int price) {
        this(name, price, DEF_DESCRIPTION, DEF_BRAND);
    }
    
    Product(String name, int price, String description, String brand) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.brand = brand;
    }

    private String name;
    private double price;
    private String description;
    private String brand;
    
    protected final static String DEF_NAME = "Sin nombre";
    protected final static int DEF_PRICE = 0;
    protected final static String DEF_DESCRIPTION = "Sin descripción";
    protected final static String DEF_BRAND = "Sin marca";

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Producto [nombre = " + name + ", precio = " + price + ", descripción = " + description + ", marca = " + brand + "]";
    }

}
