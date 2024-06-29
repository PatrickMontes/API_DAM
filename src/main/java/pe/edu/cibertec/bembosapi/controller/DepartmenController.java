package pe.edu.cibertec.bembosapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.bembosapi.entity.Department;
import pe.edu.cibertec.bembosapi.repository.DepartmenRepository;
import pe.edu.cibertec.bembosapi.service.DepartmenService;

import java.util.List;

@RestController
@RequestMapping("/api/departmen")
public class DepartmenController {
    private final DepartmenService departmenService;
    @Autowired
    public DepartmenController(DepartmenService departmenService) {
        this.departmenService = departmenService;
    }
    @GetMapping("/list")
    public List<Department>getAllDepartment(){
        return  departmenService.getAllDepartment();

    }


}
