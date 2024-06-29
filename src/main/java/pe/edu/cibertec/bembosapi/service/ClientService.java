package pe.edu.cibertec.bembosapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.bembosapi.entity.Client;
import pe.edu.cibertec.bembosapi.repository.ClientRepository;

import java.util.List;

@Service
public class ClientService {

    private final ClientRepository clientRepository;
    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> getAllClient(){
        return  clientRepository.findAll();
    }
    
    public Client createClient(Client newClient) {
    	Client saved = clientRepository.save(newClient); 
    	return saved;
    }
    
    public List<Client> signin(String mail,String password) {
    	return clientRepository.findByEmailAndClave(mail, password);
    }
}
