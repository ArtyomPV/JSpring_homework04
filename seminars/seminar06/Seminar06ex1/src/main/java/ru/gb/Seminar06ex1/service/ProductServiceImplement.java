package ru.gb.Seminar06ex1.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.gb.Seminar06ex1.model.Product;
import ru.gb.Seminar06ex1.repository.ProductRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class ProductServiceImplement implements ProductService{

    private ProductRepository repository;
    @Override
    public List<Product> getAllProducts() {
        return repository.findAll();
    }

    @Override
    public Product getProductById(Long id) {
        return repository.findById(id).orElseThrow(null);
    }

    @Override
    public Product updateProduct(Product product) {
        Product productById = getProductById(product.getId());
        productById.setName(product.getName());
        productById.setQuantity(product.getQuantity());

        return repository.save(productById);
    }

    @Override
    public Product updateProductById(Long id, Product product) {
        Product productUpdated = getProductById(id);
        productUpdated.setName(product.getName());
        productUpdated.setQuantity(product.getQuantity());
        return repository.save(productUpdated);
    }

    @Override
    public Product createProduct(Product product) {
        return repository.save(product);
    }

    @Override
    public void deleteProductById(Long id) {
        repository.deleteById(id);
    }
}
