package pe.edu.cibertec.bembosapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.bembosapi.entity.Province;
import pe.edu.cibertec.bembosapi.repository.ProvinceRepository;

import java.util.List;

@Service
public class ProvinceService {
    private final ProvinceRepository provinceRepository;
    @Autowired
    public ProvinceService(ProvinceRepository provinceRepository) {
        this.provinceRepository = provinceRepository;
    }

    public List<Province> getAllProvince(){
        return provinceRepository.findAll();
    }
}
