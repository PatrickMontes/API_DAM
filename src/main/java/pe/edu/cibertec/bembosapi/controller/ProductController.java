package pe.edu.cibertec.bembosapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.bembosapi.entity.Product;
import pe.edu.cibertec.bembosapi.service.ProductService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping ("/producto-id/{id}")
    public Optional<Product> getProductsBYId(@PathVariable("id") int id){
       return productService.getProductById(id);
    }


    @GetMapping("/producto-categoria/{categoryId}")
    public List<Product> getProductsByCategory(@PathVariable("categoryId") int categoryId) {
         return productService.getProductsByCategory(categoryId);

    }
    @GetMapping("/list")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }
}
