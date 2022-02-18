package com.technics.infsystem.service.equipments;

import com.technics.infsystem.entities.equipments.PCEquipment;
import com.technics.infsystem.repository.equipments.PCEquipmentRepository;
import com.technics.infsystem.service.abstraction.AbstractEquipmentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PCEquipmentService extends AbstractEquipmentService<PCEquipment, PCEquipmentRepository> {

    public PCEquipmentService(PCEquipmentRepository repository) {
        super(repository);
    }

    @Override
    public void createEquipment(PCEquipment equipment) {
        repository.save(equipment);
    }

    @Override
    public List<PCEquipment> findByTypeName(String typeName) {
        return repository.findByTypeName(typeName);
    }


}
