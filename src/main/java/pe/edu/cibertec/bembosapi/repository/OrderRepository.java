package pe.edu.cibertec.bembosapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.cibertec.bembosapi.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer>{

}
