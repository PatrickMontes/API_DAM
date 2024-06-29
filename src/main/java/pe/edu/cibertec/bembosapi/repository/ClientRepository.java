package pe.edu.cibertec.bembosapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.cibertec.bembosapi.entity.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client,Integer> {
}
