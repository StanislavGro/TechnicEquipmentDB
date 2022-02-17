package com.technics.infsystem.repository.equipments;

import com.technics.infsystem.entities.equipments.PCEquipment;
import com.technics.infsystem.repository.common.CommonEquipmentRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PCEquipmentRepository extends CommonEquipmentRepository<PCEquipment> {
}
