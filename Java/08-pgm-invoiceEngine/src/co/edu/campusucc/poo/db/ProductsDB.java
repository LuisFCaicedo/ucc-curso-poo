package co.edu.campusucc.poo.db;

import java.util.HashMap;
import co.edu.campusucc.poo.models.Product;

public class ProductsDB {
    private HashMap<Integer, Product> products;

    public ProductsDB() {
        this.products = new HashMap<>();
    }

    public HashMap<Integer, Product> getProducts() {
        return products;
    }

    public void setProducts(HashMap<Integer, Product> products) {
        this.products = products;
    }
}
