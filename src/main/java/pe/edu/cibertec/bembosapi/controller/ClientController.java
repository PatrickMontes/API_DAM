package pe.edu.cibertec.bembosapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.cibertec.bembosapi.entity.Client;
import pe.edu.cibertec.bembosapi.service.ClientService;

import java.util.List;

@Controller
@RequestMapping("/api/client")
public class ClientController {
    private final ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }
    @GetMapping("/list")
    public ResponseEntity<List<Client>> getAllClient(){
        List<Client> clients = clientService.getAllClient();
        return ResponseEntity.ok(clients);
    }
}
