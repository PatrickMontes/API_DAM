package pe.edu.cibertec.bembosapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.bembosapi.entity.Product;
import pe.edu.cibertec.bembosapi.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(int id) {
        return productRepository.findById(id);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProductById(int id) {
        productRepository.deleteById(id);
    }

    public List<Product> getProductsByCategory(int categoryId) {
        return productRepository.findByCategoryId(categoryId);
    }



}
