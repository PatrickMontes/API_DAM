package pe.edu.cibertec.bembosapi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.bembosapi.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Integer> {
	Optional<Client> findByEmailAndClave(String email, String clave);

}
