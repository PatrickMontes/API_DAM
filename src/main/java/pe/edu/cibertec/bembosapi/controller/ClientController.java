package pe.edu.cibertec.bembosapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.bembosapi.entity.Client;
import pe.edu.cibertec.bembosapi.service.ClientService;
import pe.edu.cibertec.bembosapi.DTO.*;

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

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest) {
        Client client = clientService.login(loginRequest.getEmail(), loginRequest.getClave());
        if (client == null) {
            return ResponseEntity.status(401).build(); // Unauthorized
        }
        LoginResponse loginResponse = new LoginResponse();
        loginResponse.setId(client.getId());
        loginResponse.setNombre(client.getNombre());
        loginResponse.setApe_paterno(client.getApe_paterno());
        loginResponse.setApe_materno(client.getApe_materno());
        loginResponse.setEmail(client.getEmail());
        return ResponseEntity.ok(loginResponse);
    }

    @PostMapping("/createClient")
    public ResponseEntity<Client> registrar(@RequestBody Client newCli) {
    	Client nuevo = clientService.createClient(newCli);
        return ResponseEntity.status(HttpStatus.CREATED).body(nuevo);
    }
}
