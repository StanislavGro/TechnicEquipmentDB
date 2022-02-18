package com.technics.infsystem.repository.equipments;

import com.technics.infsystem.entities.equipments.SmartphoneEquipment;
import com.technics.infsystem.entities.equipments.TVEquipment;
import com.technics.infsystem.repository.common.CommonEquipmentRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SmartphoneEquipmentRepository extends CommonEquipmentRepository<SmartphoneEquipment> {

    @Query("select se from SmartphoneEquipment se where se.typeName = lower(:typeName) ")
    List<SmartphoneEquipment> findByTypeName(@Param("typeName") String typeName);
}
