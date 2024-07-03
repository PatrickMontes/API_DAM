package pe.edu.cibertec.bembosapi.DTO;

import lombok.Data;

@Data
public class LoginResponse {
    private Integer id;
    private String nombre;
    private String ape_paterno;
    private String ape_materno;
    private String email;
}