package pe.edu.cibertec.bembosapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.bembosapi.entity.District;
import pe.edu.cibertec.bembosapi.service.DistrictService;

import java.util.List;

@RestController
@RequestMapping("/api/district")
public class DistrictController {
    private final DistrictService districtService;

    @Autowired
    public DistrictController(DistrictService districtService) {
        this.districtService = districtService;
    }
    @GetMapping("/list")
    public List<District>getAllDistrict(){
        return districtService.getAllDistrict();
    }
}
