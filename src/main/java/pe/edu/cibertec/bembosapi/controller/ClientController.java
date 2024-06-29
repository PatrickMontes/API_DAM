package pe.edu.cibertec.bembosapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.bembosapi.entity.Client;
import pe.edu.cibertec.bembosapi.service.ClientService;

import java.util.List;

@RestController
@RequestMapping("/api/client")
public class ClientController {
    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }
    @GetMapping("/list")
    public List<Client> getAllClient(){
        return clientService.getAllClient();
    }
    @PostMapping("/signin")
    public ResponseEntity<String> iniciarSesion(@RequestBody String mail, @RequestBody String password) {
    	List<Client> login = clientService.signin(mail, password);
        String mensaje = "";
        if (!login.isEmpty()) {
            mensaje = "Bienvenido";
        } else {
            mensaje = "Error en usuario o contraseña";
        }
        return ResponseEntity.ok(mensaje);
    }
    @PostMapping("/createClient")
    public ResponseEntity<Client> iniciarSesion(@RequestBody Client newCli) {
    	Client nuevo = clientService.createClient(newCli);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevo);
    }
}
