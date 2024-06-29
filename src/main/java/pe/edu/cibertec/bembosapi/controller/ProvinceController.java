package pe.edu.cibertec.bembosapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.bembosapi.entity.Province;
import pe.edu.cibertec.bembosapi.repository.ProvinceRepository;
import pe.edu.cibertec.bembosapi.service.ProvinceService;

import java.util.List;

@RestController
@RequestMapping("/api/province")
public class ProvinceController {
    private final ProvinceService provinceService;
    @Autowired
    public ProvinceController(ProvinceService provinceService) {
        this.provinceService = provinceService;
    }
    @GetMapping("/list")
    public List<Province> getAllProvince(){
        return provinceService.getAllProvince();
    }
}
