package com.technics.infsystem.service.equipments;

import com.technics.infsystem.entities.equipments.SmartphoneEquipment;
import com.technics.infsystem.repository.equipments.SmartphoneEquipmentRepository;
import com.technics.infsystem.service.abstraction.AbstractEquipmentService;
import org.springframework.stereotype.Service;

@Service
public class SmartphoneEquipmentService extends AbstractEquipmentService<SmartphoneEquipment, SmartphoneEquipmentRepository> {
    public SmartphoneEquipmentService(SmartphoneEquipmentRepository repository) {
        super(repository);
    }

    @Override
    public void createEquipment(SmartphoneEquipment equipment) {
        repository.save(equipment);
    }
}
