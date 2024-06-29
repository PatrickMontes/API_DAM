package pe.edu.cibertec.bembosapi.service;

import org.springframework.stereotype.Service;
import pe.edu.cibertec.bembosapi.entity.Department;
import pe.edu.cibertec.bembosapi.repository.DepartmenRepository;

import java.util.List;

@Service
public class DepartmenService {
    private final DepartmenRepository departmenRepository;

    public DepartmenService(DepartmenRepository departmenRepository) {
        this.departmenRepository = departmenRepository;
    }

    public List<Department> getAllDepartment(){
       return departmenRepository.findAll();
    }
}
