package pe.edu.cibertec.bembosapi.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "DetallePedido")
public class OrderDetails {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	@Column(name = "cantidad")
	private int cantidad;
	@Column(name = "precioUni")
    private Double precioUni;
    @OneToOne
    @JoinColumn(name="idPedido")
    private Order idPedido;
    @OneToOne
    @JoinColumn(name="idProducto")
    private Product idProducto;
}
