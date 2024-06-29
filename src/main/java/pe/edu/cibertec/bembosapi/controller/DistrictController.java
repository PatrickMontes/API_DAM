package pe.edu.cibertec.bembosapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.edu.cibertec.bembosapi.entity.District;
import pe.edu.cibertec.bembosapi.service.DistrictService;

import java.util.List;

@Controller
@RequestMapping("/api/district")
public class DistrictController {
    private final DistrictService districtService;

    @Autowired
    public DistrictController(DistrictService districtService) {
        this.districtService = districtService;
    }
    @GetMapping("/list")
    public ResponseEntity<List<District>>getAllDistrict(){
        List<District>districts = districtService.getAllDistrict();
        return ResponseEntity.ok(districts);
    }
}
