package Supermercado;

import java.util.ArrayList;
// import java.util.LinkedList;
// import javax.swing.text.html.HTMLDocument.Iterator;
import java.util.List;

public class ShoppingCart extends Product{
    ShoppingCart() {
        this(DEF_NAME, DEF_PRICE, DEF_DESCRIPTION, DEF_BRAND);
    }
    public ShoppingCart(String name, int price, String description, String brand) {
        super(name, price, description, brand);
    }
    private List<Product> products = new ArrayList<Product>();

    public void addProduct(Product product) {
        this.products.add(product);
    }
    
    public void removeProduct(Product product) {
        this.products.remove(product);
    }

    public boolean containsProduct() {
        boolean is = false;
        
        // for (Product obj : products) {
        //     if (products instanceof ArrayList arrayList) {
        //         is = true;
        //     } else {
        //         is = false;
        //     }
        // }
        // Iterator iterator = (Iterator) products.iterator();
        // while (((java.util.Iterator<Product>) iterator).hasNext()) {
        //     if (products instanceof ArrayList arrayList) {
        //         is = true;
        //     } else {
        //         is = false;
        //     }
        // }
        // Comprobar si ya existe un determinado producto
        for (int i = 0; i < products.size(); i++) {
            if (products instanceof ArrayList) {
                is = true;
            }
            else {
                is = false;
            }
        }
        return is;
    }

    public int sizeShoppingCart() {
        //Obtener el tamaño del carrito de compras
        int size = products.size();
        return size;
    }

    public void getProduct(Product product) {
        //Obtener un producto con su índice
        int pos = products.indexOf(product);
        for (Product i : products) {
            if (pos >= 0) {
                System.out.println("Posición: " + pos + ", " + i.toString());
            }
            else {
                System.out.println("No se encontraron resultados");
            }
        }
    }

    public void getProducts() {
        //Lista de productos
        for (Product product : products) {
            System.out.println(product.toString());
        }
    }
}
