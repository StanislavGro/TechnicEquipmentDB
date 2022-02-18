package com.technics.infsystem.service.equipments;

import com.technics.infsystem.entities.equipments.VacuumCleanerEquipment;
import com.technics.infsystem.repository.equipments.VacuumCleanerEquipmentRepository;
import com.technics.infsystem.service.abstraction.AbstractEquipmentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VacuumCleanerEquipmentService extends AbstractEquipmentService<VacuumCleanerEquipment, VacuumCleanerEquipmentRepository> {

    public VacuumCleanerEquipmentService(VacuumCleanerEquipmentRepository repository) {
        super(repository);
    }

    @Override
    public void createEquipment(VacuumCleanerEquipment equipment) {
        repository.save(equipment);
    }

    @Override
    public List<VacuumCleanerEquipment> findByTypeName(String typeName) {
        return repository.findByTypeName(typeName);
    }

}
