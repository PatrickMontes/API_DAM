package pe.edu.cibertec.bembosapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.bembosapi.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category , Integer> {
}
