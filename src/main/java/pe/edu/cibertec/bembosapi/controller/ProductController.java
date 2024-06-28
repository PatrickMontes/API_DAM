package pe.edu.cibertec.bembosapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.cibertec.bembosapi.entity.Product;
import pe.edu.cibertec.bembosapi.service.ProductService;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/api/products")
public class ProductController {
    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/list")
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return ResponseEntity.ok(products);
    }

    @GetMapping ("/producto-id/{id}")
    public ResponseEntity<Optional<Product>> getProductsBYId(@PathVariable("id") int id){
        Optional<Product> products = productService.getProductById(id);
        if (!products.isEmpty()) {
            return ResponseEntity.ok(products);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @GetMapping("/producto-categoria/{categoryId}")
    public ResponseEntity<List<Product>> getProductsByCategory(@PathVariable("categoryId") int categoryId) {
        List<Product> products = productService.getProductsByCategory(categoryId);
        if (!products.isEmpty()) {
            return ResponseEntity.ok(products);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
