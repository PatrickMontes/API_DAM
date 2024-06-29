package pe.edu.cibertec.bembosapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.cibertec.bembosapi.entity.Province;
import pe.edu.cibertec.bembosapi.repository.ProvinceRepository;
import pe.edu.cibertec.bembosapi.service.ProvinceService;

import java.util.List;

@Controller
@RequestMapping("/api/province")
public class ProvinceController {
    private final ProvinceService provinceService;
    @Autowired
    public ProvinceController(ProvinceService provinceService) {
        this.provinceService = provinceService;
    }
    @GetMapping("/list")
    public ResponseEntity<List<Province>> getAllProvince(){
        List<Province> provinces= provinceService.getAllProvince();
        return ResponseEntity.ok(provinces);
    }
}
