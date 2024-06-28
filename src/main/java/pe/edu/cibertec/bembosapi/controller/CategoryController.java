package pe.edu.cibertec.bembosapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.cibertec.bembosapi.entity.Category;
import pe.edu.cibertec.bembosapi.entity.Product;
import pe.edu.cibertec.bembosapi.service.CategoryService;

import java.util.List;

@Controller
@RequestMapping("/api/category")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;
    @GetMapping("/list")
    public ResponseEntity<List<Category>>listAllCategory(){
        List<Category> category = categoryService.categoryList();
        return ResponseEntity.ok(category);

    }
}
