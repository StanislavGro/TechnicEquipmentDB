package com.technics.infsystem.service.equipments;

import com.technics.infsystem.entities.equipments.VacuumCleanerEquipment;
import com.technics.infsystem.repository.equipments.VacuumCleanerEquipmentRepository;
import com.technics.infsystem.service.abstraction.AbstractEquipmentService;
import org.springframework.stereotype.Service;

@Service
public class VacuumCleanerEquipmentService extends AbstractEquipmentService<VacuumCleanerEquipment, VacuumCleanerEquipmentRepository> {

    public VacuumCleanerEquipmentService(VacuumCleanerEquipmentRepository repository) {
        super(repository);
    }

    @Override
    public void createEquipment(VacuumCleanerEquipment equipment) {
        repository.save(equipment);
    }

}
