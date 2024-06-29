package pe.edu.cibertec.bembosapi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "provincia")
public class Province {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "departamento_id")
    private Department department_id;
}
