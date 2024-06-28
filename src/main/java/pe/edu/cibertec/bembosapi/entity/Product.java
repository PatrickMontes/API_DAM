package pe.edu.cibertec.bembosapi.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "productos")
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private Category category;
    private String descripcion;
    private int stock;
    private double precio;
    private String foto_id;

}
