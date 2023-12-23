package service;

import entities.Product;

public interface ProductService {
    void addProductToCart (Product product, int quantity);
    int getAllProductsFromCart();
}
