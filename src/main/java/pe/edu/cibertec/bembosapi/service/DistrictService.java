package pe.edu.cibertec.bembosapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.cibertec.bembosapi.entity.District;
import pe.edu.cibertec.bembosapi.repository.DistrictRepository;

import java.util.List;

@Service
public class DistrictService {
    private final DistrictRepository districtRepository;
    @Autowired
    public DistrictService(DistrictRepository districtRepository){
        this.districtRepository = districtRepository;
    }
    public List<District> getAllDistrict(){
        return districtRepository.findAll();
    }
}
