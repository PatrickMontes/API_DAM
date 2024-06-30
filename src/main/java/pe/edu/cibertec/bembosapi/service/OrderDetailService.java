package pe.edu.cibertec.bembosapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pe.edu.cibertec.bembosapi.entity.OrderDetails;
import pe.edu.cibertec.bembosapi.repository.OrderDetailsRepository;

@Service
public class OrderDetailService {
	private final OrderDetailsRepository orderdetailrepository;
	@Autowired
	public OrderDetailService(OrderDetailsRepository orderdetailrepository) {
		this.orderdetailrepository = orderdetailrepository;
	}
	public OrderDetails createOrderDetail(int idpedido,OrderDetails detalle) {
		OrderDetails detPed = new OrderDetails();
		detPed.setIdProducto(detalle.getIdProducto());
		detPed.setCantidad(detalle.getCantidad());
		detPed.setPrecioUni(detalle.getPrecioUni());
		OrderDetails saved = orderdetailrepository.save(detPed);
		return saved;
	}
}
