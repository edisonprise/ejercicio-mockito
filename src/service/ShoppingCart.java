package service;

import entities.Product;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public int getTotalProducts() {
        return products.size();
    }

    public List<Product> getProducts() {
        return products;
    }

}
