package ru.gb.spring.sem4example3.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import ru.gb.spring.sem4example3.domain.Product;
import ru.gb.spring.sem4example3.service.ProductService;

import java.util.List;

@Controller
@AllArgsConstructor
public class ProductController {

    private final ProductService productService;


    @GetMapping("/products")
    public String viewProducts(Model model){
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);
        return "products";
    }

    @PostMapping("/products")
    public String addProduct(Product product, Model model){
        productService.addProduct(product);
        List<Product> products = productService.findAll();
        model.addAttribute("products", products);
        return "products";
    }
}

