package pe.edu.cibertec.bembosapi.DTO;

import lombok.Data;

@Data
public class LoginRequest {
    private String email;
    private String clave;
}