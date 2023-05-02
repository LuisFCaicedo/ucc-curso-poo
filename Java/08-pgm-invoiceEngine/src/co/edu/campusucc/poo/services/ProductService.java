package co.edu.campusucc.poo.services;

import co.edu.campusucc.poo.db.ProductsDB;
import co.edu.campusucc.poo.models.Product;

public class ProductService {
    private ProductsDB productsDB;

    public ProductService(ProductsDB productsDB) {
        this.productsDB = productsDB;
    }

    public void addProduct(Product product) {
        productsDB.getProducts().put(product.getId(), product);
    }

    public Product getProductById(int id) {
    return productsDB.getProducts().get(id);
    }

    
}