package pe.edu.cibertec.bembosapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.bembosapi.entity.Category;
import pe.edu.cibertec.bembosapi.repository.CategoryRepository;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category>categoryList(){
        return categoryRepository.findAll();
    }
}
