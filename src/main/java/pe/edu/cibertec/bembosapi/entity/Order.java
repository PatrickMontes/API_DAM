package pe.edu.cibertec.bembosapi.entity;

import java.sql.Date;

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
@Table(name = "pedido")
public class Order {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	@Column(name = "fechaCompra")
	private Date fechaCompra;
	@Column(name = "montoTotal")
    private Double montoTotal;
    @OneToOne
    @JoinColumn(name="cliente_id")
    private Client cliente_id;
}
