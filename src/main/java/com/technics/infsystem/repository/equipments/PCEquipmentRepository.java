package com.technics.infsystem.repository.equipments;

import com.technics.infsystem.entities.equipments.PCEquipment;
import com.technics.infsystem.repository.common.CommonEquipmentRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PCEquipmentRepository extends CommonEquipmentRepository<PCEquipment> {

    @Query("select pce from PCEquipment pce where pce.typeName = lower(:typeName)")
    List<PCEquipment> findByTypeName(@Param("typeName") String typeName);

}
