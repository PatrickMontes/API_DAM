package pe.edu.cibertec.bembosapi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "detallepedido")
public class OrderDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "precioUni")
    private Double precioUni;

    @ManyToOne
    @JoinColumn(name = "idPedido")
    private Order order; // Renombrado de idPedido a order

    @OneToOne
    @JoinColumn(name = "idProducto")
    private Product idProducto;
}
