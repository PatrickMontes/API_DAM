package pe.edu.cibertec.bembosapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.bembosapi.entity.Order;
import pe.edu.cibertec.bembosapi.entity.OrderDetails;
import pe.edu.cibertec.bembosapi.repository.OrderDetailsRepository;
import pe.edu.cibertec.bembosapi.repository.OrderRepository;

@Service
public class OrderService {
	private final OrderRepository orderrepository;
	@Autowired
	public OrderService(OrderRepository orderrepository) {
		this.orderrepository = orderrepository;
	}
	public int createOrder(Order newOrder) {
		Order saved = orderrepository.save(newOrder);
		return saved.getId(); 
	}

}
