package Supermercado;

import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

public class SuperMarket{
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        
        Product oatbar = new Product(); //barra avena
        Product soda = new Product("Coca Cola", 20);
        Product juice = new Product("Jumex Mango", 25, "500 ml sabor mango", "Jumex");
        Product chips;
        Product chocolate;
        Product candy;
        Product cookies;
        Product tortillas;
        Product impression;
        Product copy = new Product("Copia", 1, "Copia a color", "N/A");

        shoppingCart.addProduct(oatbar);
        shoppingCart.addProduct(soda);
        shoppingCart.addProduct(juice);
        shoppingCart.addProduct(copy);
        shoppingCart.removeProduct(copy);

        printReceipt(shoppingCart);
        getTotal();
    }

    public static void printReceipt(ShoppingCart shoppingCart) {
        System.out.println("***** RECIBO DE COMPRA *****");
        System.out.println("Gracias por su compra");
        System.out.println();
        System.out.println("Número de artículos: " + shoppingCart.sizeShoppingCart()); 
        shoppingCart.getProducts();
    }

    public static void getTotal() {
        List<Product> products = new ArrayList<Product>();
        double total = 0;
        System.out.println();

        for (int j = 0; j < products.size(); j++) {
            total += products.get(j).getPrice();
        }
    
        System.out.println("El total a pagar es: " + total);
    }
}
