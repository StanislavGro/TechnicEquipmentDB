package com.technics.infsystem.repository.equipments;

import com.technics.infsystem.entities.equipments.TVEquipment;
import com.technics.infsystem.repository.common.CommonEquipmentRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TVEquipmentRepository extends CommonEquipmentRepository<TVEquipment> {

    @Query("select tvequipment from TVEquipment tvequipment where tvequipment.typeName = lower(:typeName)")
    List<TVEquipment> findByTypeName(@Param("typeName") String typeName);

}
