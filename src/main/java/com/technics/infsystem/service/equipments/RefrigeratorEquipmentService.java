package com.technics.infsystem.service.equipments;

import com.technics.infsystem.entities.equipments.RefrigeratorEquipment;
import com.technics.infsystem.repository.equipments.RefrigeratorEquipmentRepository;
import com.technics.infsystem.service.abstraction.AbstractEquipmentService;
import org.springframework.stereotype.Service;

@Service
public class RefrigeratorEquipmentService extends AbstractEquipmentService<RefrigeratorEquipment, RefrigeratorEquipmentRepository> {


    public RefrigeratorEquipmentService(RefrigeratorEquipmentRepository repository) {
        super(repository);
    }

    @Override
    public void createEquipment(RefrigeratorEquipment equipment) {
        repository.save(equipment);
    }
}
