package ru.gb.Seminar06ex1.service;

import ru.gb.Seminar06ex1.model.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();
    Product getProductById(Long id);
    Product updateProduct(Product product);
    Product updateProductById(Long id, Product product);
    Product createProduct(Product product);
    void deleteProductById(Long id);
}
