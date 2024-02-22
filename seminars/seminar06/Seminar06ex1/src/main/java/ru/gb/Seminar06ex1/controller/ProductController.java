package ru.gb.Seminar06ex1.controller;


import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ru.gb.Seminar06ex1.model.Product;
import ru.gb.Seminar06ex1.service.ProductService;

import java.util.List;


@RestController
@RequestMapping("/products")
@RequiredArgsConstructor
public class ProductController {
    private final ProductService productService;


    @GetMapping
    public ResponseEntity<List<Product>> getAll(){
        return new ResponseEntity<>(productService.getAllProducts(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Product> createProduct(@RequestBody Product product){
        return new ResponseEntity<>(productService.createProduct(product), HttpStatus.CREATED);
    }

//    @PutMapping
//    public ResponseEntity<Product> updateProduct(@RequestBody Product product){
//        return new ResponseEntity<>(productService.updateProduct(product), HttpStatus.OK);
//    }

    @PutMapping("/{id}")
    public ResponseEntity<Product> updateProductById(@PathVariable("id") Long id, @RequestBody Product product){
        return new ResponseEntity<>(productService.updateProductById(id, product), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduct(@PathVariable("id") Long id){
        productService.deleteProductById(id);
        return ResponseEntity.ok().build();
    }
}
