package ru.gb.spring.sem4example3.service;

import org.springframework.stereotype.Service;
import ru.gb.spring.sem4example3.domain.Product;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    private List<Product> productList = new ArrayList<>();

    public void addProduct(Product product){
        productList.add(product);
    }
    public List<Product> findAll(){
        return productList;
    }
}
