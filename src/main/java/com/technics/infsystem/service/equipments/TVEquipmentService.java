package com.technics.infsystem.service.equipments;

import com.technics.infsystem.entities.equipments.TVEquipment;
import com.technics.infsystem.repository.equipments.TVEquipmentRepository;
import com.technics.infsystem.service.abstraction.AbstractEquipmentService;
import org.springframework.stereotype.Service;

@Service
public class TVEquipmentService extends AbstractEquipmentService<TVEquipment, TVEquipmentRepository> {

    public TVEquipmentService(TVEquipmentRepository repository) {
        super(repository);
    }

    @Override
    public void createEquipment(TVEquipment tvEquipment) {
        repository.save(tvEquipment);
    }
}
