package pe.edu.cibertec.bembosapi.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "cliente")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    @Column(name = "apellidopaterno")
    private String ape_paterno;
    @Column(name = "apellidomaterno")
    private String ape_materno;
    private String tipodocumento ;
    private String numdocumento;
    private String direccion;
    @OneToOne
    @JoinColumn(name = "departamento_id")
    private Department departamento_id;
    @OneToOne
    @JoinColumn(name = "provincia_id")
    private Province provincia_id;
    @OneToOne
    @JoinColumn(name="distrito_id")
    private District distrito_id;
    private String telefono;
    private String email;
    private String clave;

}
