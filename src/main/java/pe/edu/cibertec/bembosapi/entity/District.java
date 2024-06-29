package pe.edu.cibertec.bembosapi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "distrito")
public class District {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    @ManyToOne
    @JoinColumn(name="provincia_id")
    private Province provincia_id;
}
