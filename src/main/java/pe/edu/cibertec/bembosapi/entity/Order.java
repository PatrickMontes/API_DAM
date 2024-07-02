package pe.edu.cibertec.bembosapi.entity;

import java.sql.Date;
import java.util.Set;

import jakarta.persistence.*;
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
    @JoinColumn(name = "cliente_id")
    private Client cliente_id;

    @OneToMany(mappedBy = "order", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Set<OrderDetails> listDetail;
}
