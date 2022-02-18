package com.technics.infsystem.repository.equipments;

import com.technics.infsystem.entities.equipments.VacuumCleanerEquipment;
import com.technics.infsystem.repository.common.CommonEquipmentRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VacuumCleanerEquipmentRepository extends CommonEquipmentRepository<VacuumCleanerEquipment> {

    @Query("select vce from VacuumCleanerEquipment vce where vce.typeName = lower(:typeName)")
    List<VacuumCleanerEquipment> findByTypeName(@Param("typeName") String typeName);

}
