package pe.edu.cibertec.bembosapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.bembosapi.entity.Product;

import java.util.List;

@Repository
public interface ProductRepository  extends JpaRepository <Product , Integer> {

    List<Product> findByCategoryId(int categoryId);
}
