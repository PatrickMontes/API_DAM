package pe.edu.cibertec.bembosapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.edu.cibertec.bembosapi.entity.Order;
import pe.edu.cibertec.bembosapi.entity.OrderDetails;
import pe.edu.cibertec.bembosapi.service.OrderDetailService;
import pe.edu.cibertec.bembosapi.service.OrderService;

@RestController
@RequestMapping("/api/order")
public class OrderController {
	private final OrderService orderService;
	private final OrderDetailService orderdetailService;

    @Autowired
    public OrderController(OrderService orderService,OrderDetailService orderdetailService) {
        this.orderService = orderService;
        this.orderdetailService = orderdetailService;
    }
    @PostMapping("/buy")
    public ResponseEntity<String> iniciarSesion(@RequestBody Order buyOrder) {
        String mensaje = "";
        try {
            int pedidoId = orderService.createOrder(buyOrder);
            System.out.println("Pedido: " + buyOrder);
            for (OrderDetails detalle : buyOrder.getListDetail()) {
            	orderdetailService.createOrderDetail(pedidoId,detalle);
            	System.out.println("Detalle: " + detalle);
            }
            mensaje = "Compra generada correctamente.";
            return ResponseEntity.status(HttpStatus.OK).body(mensaje);
        } catch (Exception e) {
        	mensaje = "Error al generar la compra.";
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(mensaje);
        }
    }
}
